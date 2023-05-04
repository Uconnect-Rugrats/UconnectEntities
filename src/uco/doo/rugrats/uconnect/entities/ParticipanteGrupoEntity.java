package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilBoolean;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class ParticipanteGrupoEntity {
    private UUID identificador;
    private ParticipanteEntity participante;
    private GrupoEntity grupo;
    private Boolean puedePublicar;
    private EstadoEntity estado;

    public static final ParticipanteGrupoEntity DEFAULT_OBJECT = new ParticipanteGrupoEntity();

    private ParticipanteGrupoEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setParticipante(ParticipanteEntity.getDefaultObject());
        setPuedePublicar(UtilBoolean.getDefaultValue());
        setGrupo(GrupoEntity.getDefaultObject());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public ParticipanteGrupoEntity(final UUID identificador, final ParticipanteEntity participante, final Boolean puedePublicar, final GrupoEntity grupo, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setParticipante(participante);
        setPuedePublicar(puedePublicar);
        setGrupo(grupo);
        setEstado(estado);
    }

    private void setPuedePublicar(final Boolean puedePublicar) {
        this.puedePublicar = UtilBoolean.getDefault(puedePublicar);
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setParticipante(final ParticipanteEntity participante) {
        this.participante = UtilObject.getDefault(participante, ParticipanteEntity.getDefaultObject());
    }

    private void setGrupo(final GrupoEntity grupo) {
        this.grupo = UtilObject.getDefault(grupo, GrupoEntity.getDefaultObject());
    }

    private void setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    public Boolean getPuedePublicar() {
        return puedePublicar;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public ParticipanteEntity getParticipante() {
        return participante;
    }

    public GrupoEntity getGrupo() {
        return grupo;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static ParticipanteGrupoEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
