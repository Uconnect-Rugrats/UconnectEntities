package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class ParticipanteEntity {
    private UUID identificador;
    private PersonaEntity persona;
    private EstadoEntity estado;

    public static final ParticipanteEntity DEFAULT_OBJECT = new ParticipanteEntity();

    private ParticipanteEntity(){
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPersona(PersonaEntity.getDefaultObject());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public ParticipanteEntity(final UUID identificador, final PersonaEntity persona, final EstadoEntity estado){
        super();
        setIdentificador(identificador);
        setPersona(persona);
        setEstado(estado);
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setPersona(final PersonaEntity persona) {
        this.persona = UtilObject.getDefault(persona, PersonaEntity.getDefaultObject());
    }

    private void setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaEntity getPersona() {
        return persona;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static ParticipanteEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
