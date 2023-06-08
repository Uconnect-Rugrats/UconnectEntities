package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilBoolean;
import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class PublicacionEntity {
    private UUID identificador;
    private ParticipanteGrupoEntity autor;
    private LocalDateTime fechaPublicacion;
    private String titulo;
    private String contenido;
    private EstadoEntity estado;
    private boolean estaEstadoRealActivo;


    private PublicacionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setAutor(ParticipanteGrupoEntity.create());
        setFechaPublicacion(UtilDate.getDefaultValue());
        setTitulo(UtilText.getDefaultValue());
        setContenido(UtilText.getDefaultValue());
        setEstado(EstadoEntity.create());
        setEstaEstadoRealActivo(UtilBoolean.getDefaultValue());
    }

    public PublicacionEntity( UUID identificador, ParticipanteGrupoEntity autor, LocalDateTime fechaPublicacion, String titulo, String contenido, EstadoEntity estado,boolean estaEstadoRealActivo) {
        super();
        setIdentificador(identificador);
        setAutor(autor);
        setFechaPublicacion(fechaPublicacion);
        setTitulo(titulo);
        setContenido(contenido);
        setEstado(estado);
        setEstaEstadoRealActivo(estaEstadoRealActivo);
    }

    public PublicacionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PublicacionEntity setAutor(final ParticipanteGrupoEntity autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoEntity.create());
        return this;
    }

    public PublicacionEntity setFechaPublicacion(final LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = UtilDate.getDefault(fechaPublicacion);
        return this;
    }

    public PublicacionEntity setTitulo(final String titulo) {
        this.titulo = UtilText.applyTrim(titulo);
        return this;
    }

    public PublicacionEntity setContenido(final String contenido) {
        this.contenido = UtilText.applyTrim(contenido);
        return this;
    }

    public PublicacionEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }


    public ParticipanteGrupoEntity getAutor() {
        return autor;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static final PublicacionEntity create(){
        return new PublicacionEntity();
    }

	public boolean isEstaEstadoRealActivo() {
		return estaEstadoRealActivo;
	}

	public PublicacionEntity setEstaEstadoRealActivo(boolean estaEstadoRealActivo) {
		this.estaEstadoRealActivo = estaEstadoRealActivo;
		return this;
	}
}
