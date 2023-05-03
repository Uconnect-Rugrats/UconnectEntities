package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class ComentarioEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private ComentarioEntity comentarioPadre;
    private LocalDateTime fechaPublicacion;
    private ParticipanteGrupoEntity autor;
    private String contenido;
    private EstadoEntity estado;

    public static final ComentarioEntity DEFAULT_OBJECT = new ComentarioEntity();

    private ComentarioEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionEntity.getDefaultObject());
        setComentarioPadre(null); // PROBLEMA
        setFechaPublicacion(UtilDate.getDefaultValue());
        setAutor(ParticipanteGrupoEntity.getDefaultObject());
        setContenido(UtilText.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public ComentarioEntity(final UUID identificador, final PublicacionEntity publicacion, final ComentarioEntity comentarioPadre, final LocalDateTime fechaPublicacion, final ParticipanteGrupoEntity autor, final String contenido, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setComentarioPadre(comentarioPadre);
        setFechaPublicacion(fechaPublicacion);
        setAutor(autor);
        setContenido(contenido);
        setEstado(estado);
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setPublicacion(final PublicacionEntity publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
    }

    private void setComentarioPadre(final ComentarioEntity comentarioPadre) {
        this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioEntity.getDefaultObject());
    }

    private void setFechaPublicacion(final LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = UtilDate.getDefault(fechaPublicacion);
    }

    private void setAutor(final ParticipanteGrupoEntity autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoEntity.getDefaultObject());
    }

    private void setContenido(final String contenido) {
        this.contenido = UtilText.applyTrim(contenido);
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionEntity getPublicacion() {
        return publicacion;
    }

    public ComentarioEntity getComentarioPadre() {
        return comentarioPadre;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public ParticipanteGrupoEntity getAutor() {
        return autor;
    }

    public String getContenido() {
        return contenido;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static final ComentarioEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
