package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class ParticipanteEntity {
    private UUID identificador;
    private PersonaEntity persona;
    private EstadoEntity estado;


    private ParticipanteEntity(){
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPersona(PersonaEntity.create());
        setEstado(EstadoEntity.create());
    }

    public ParticipanteEntity(final UUID identificador, final PersonaEntity persona, final EstadoEntity estado){
        super();
        setIdentificador(identificador);
        setPersona(persona);
        setEstado(estado);
    }

    public ParticipanteEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ParticipanteEntity setPersona(final PersonaEntity persona) {
        this.persona = UtilObject.getDefault(persona, PersonaEntity.create());
        return this;
    }

    public ParticipanteEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
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

    public static ParticipanteEntity create(){
        return new ParticipanteEntity();
    }
}
