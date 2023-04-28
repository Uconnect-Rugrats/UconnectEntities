package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class AdministradorOrganizacionEntity {
    private UUID identificador;
    private PersonaEntity persona;

    public static final AdministradorOrganizacionEntity DEFAULT_OBJECT = new AdministradorOrganizacionEntity();
    private AdministradorOrganizacionEntity(){
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPersona(PersonaEntity.getDefaultObject());
    }

    public AdministradorOrganizacionEntity(final UUID identificador, final PersonaEntity persona){
        super();
        setIdentificador(identificador);
        setPersona(persona);
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setPersona(PersonaEntity persona) {
        this.persona = UtilObject.getDefault(persona, PersonaEntity.getDefaultObject());
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaEntity getPersona() {
        return persona;
    }

    public static AdministradorOrganizacionEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
