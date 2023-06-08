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
    private boolean estaEstadoRealActivo;


    private ParticipanteGrupoEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setParticipante(ParticipanteEntity.create());
        setPuedePublicar(UtilBoolean.getDefaultValue());
        setGrupo(GrupoEntity.create());
        setEstado(EstadoEntity.create());
        setEstaEstadoRealActivo(UtilBoolean.getDefaultValue());
    }

    public ParticipanteGrupoEntity(final UUID identificador, final ParticipanteEntity participante, final Boolean puedePublicar, final GrupoEntity grupo, final EstadoEntity estado, boolean estaEstadoRealActivo) {
        super();
        setIdentificador(identificador);
        setParticipante(participante);
        setPuedePublicar(puedePublicar);
        setGrupo(grupo);
        setEstado(estado);
        setEstaEstadoRealActivo(estaEstadoRealActivo);
    }

    public ParticipanteGrupoEntity setPuedePublicar(final Boolean puedePublicar) {
        this.puedePublicar = UtilBoolean.getDefault(puedePublicar);
        return this;
    }

    public ParticipanteGrupoEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ParticipanteGrupoEntity setParticipante(final ParticipanteEntity participante) {
        this.participante = UtilObject.getDefault(participante, ParticipanteEntity.create());
        return this;
    }

    public ParticipanteGrupoEntity setGrupo(final GrupoEntity grupo) {
        this.grupo = UtilObject.getDefault(grupo, GrupoEntity.create());
        return this;
    }

    public ParticipanteGrupoEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
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

    public static ParticipanteGrupoEntity create(){
        return new ParticipanteGrupoEntity();
    }

	public boolean isEstaEstadoRealActivo() {
		return estaEstadoRealActivo;
	}

	public ParticipanteGrupoEntity setEstaEstadoRealActivo(boolean estaEstadoRealActivo) {
		this.estaEstadoRealActivo = estaEstadoRealActivo;
		return this;
	}
}
