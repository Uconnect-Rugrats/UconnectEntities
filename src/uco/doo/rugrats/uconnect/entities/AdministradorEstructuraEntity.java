package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class AdministradorEstructuraEntity {
    private UUID identificador;
    private PersonaEntity persona;
    private AdministradorEstructuraEntity(){
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPersona(PersonaEntity.create());
    }

    public AdministradorEstructuraEntity(final UUID identificador, final PersonaEntity persona){
        super();
        setIdentificador(identificador);
        setPersona(persona);
    }

    public AdministradorEstructuraEntity setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public AdministradorEstructuraEntity setPersona(PersonaEntity persona) {
        this.persona = UtilObject.getDefault(persona, PersonaEntity.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaEntity getPersona() {
        return persona;
    }

    public static AdministradorEstructuraEntity create(){
        return new AdministradorEstructuraEntity();
    }
}
