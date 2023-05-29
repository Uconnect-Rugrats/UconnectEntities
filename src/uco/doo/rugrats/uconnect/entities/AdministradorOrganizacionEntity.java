package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class AdministradorOrganizacionEntity {
    private UUID identificador;
    private PersonaEntity persona;
    private AdministradorOrganizacionEntity(){
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPersona(PersonaEntity.create());
    }

    public AdministradorOrganizacionEntity(final UUID identificador, final PersonaEntity persona){
        super();
        setIdentificador(identificador);
        setPersona(persona);
    }

    public AdministradorOrganizacionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public AdministradorOrganizacionEntity setPersona(final PersonaEntity persona) {
        this.persona = UtilObject.getDefault(persona, PersonaEntity.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaEntity getPersona() {
        return persona;
    }

    public static AdministradorOrganizacionEntity create(){
        return new AdministradorOrganizacionEntity();
    }
}
