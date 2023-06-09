package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilBoolean;
import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class ReaccionEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private ParticipanteGrupoEntity autor;
    private LocalDateTime fechaReaccion;
    private TipoReaccionEntity tipo;
    private EstadoEntity estado;
    private boolean estaEstadoRealActivo;

    private ReaccionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionEntity.create());
        setAutor(ParticipanteGrupoEntity.create());
        setFechaReaccion(UtilDate.getDefaultValue());
        setTipo(TipoReaccionEntity.create());
        setEstado(EstadoEntity.create());
        setEstaEstadoRealActivo(UtilBoolean.getDefaultValue());
    }

    public ReaccionEntity( UUID identificador, PublicacionEntity publicacion, ParticipanteGrupoEntity autor, LocalDateTime fechaReaccion, TipoReaccionEntity tipo, EstadoEntity estado,boolean estaEstadoRealActivo) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setAutor(autor);
        setFechaReaccion(fechaReaccion);
        setTipo(tipo);
        setEstado(estado);
        setEstaEstadoRealActivo(estaEstadoRealActivo);
    }

    public ReaccionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ReaccionEntity setPublicacion(final PublicacionEntity publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion,  PublicacionEntity.create());
        return this;
    }

    public ReaccionEntity setAutor(final ParticipanteGrupoEntity autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoEntity.create());
        return this;
    }

    public ReaccionEntity setFechaReaccion(final LocalDateTime fechaReaccion) {
        this.fechaReaccion = UtilDate.getDefault(fechaReaccion);
        return this;
    }

    public ReaccionEntity setTipo(final TipoReaccionEntity tipo) {
        this.tipo = UtilObject.getDefault(tipo, TipoReaccionEntity.create());
        return this;
    }

    public ReaccionEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionEntity getPublicacion() {
        return publicacion;
    }

    public ParticipanteGrupoEntity getAutor() {
        return autor;
    }

    public LocalDateTime getFechaReaccion() {
        return fechaReaccion;
    }

    public TipoReaccionEntity getTipo() {
        return tipo;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static final ReaccionEntity create(){
        return new ReaccionEntity();
    }

	public boolean isEstaEstadoRealActivo() {
		return estaEstadoRealActivo;
	}

	public ReaccionEntity setEstaEstadoRealActivo(boolean estaEstadoRealActivo) {
		this.estaEstadoRealActivo = estaEstadoRealActivo;
		return this;
	}
}
