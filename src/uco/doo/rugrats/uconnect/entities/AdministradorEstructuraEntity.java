package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class AdministradorEstructuraEntity {
    private UUID identificador;
    private PersonaEntity persona;
    public static final AdministradorEstructuraEntity DEFAULT_OBJECT = new AdministradorEstructuraEntity();
    private AdministradorEstructuraEntity(){
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPersona(PersonaEntity.getDefaultObject());
    }

    public AdministradorEstructuraEntity(final UUID identificador, final PersonaEntity persona){
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

    public static AdministradorEstructuraEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
