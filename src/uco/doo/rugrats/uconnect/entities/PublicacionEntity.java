package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class PublicacionEntity {
    private UUID identificador;
    private GrupoEntity grupo;
    private ParticipanteGrupoEntity autor;
    private LocalDateTime fechaPublicacion;
    private String titulo;
    private String contenido;
    private EstadoEntity estado;

    public static final PublicacionEntity DEFAULT_OBJECT = new PublicacionEntity();

    private PublicacionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setGrupo(GrupoEntity.getDefaultObject());
        setAutor(ParticipanteGrupoEntity.getDefaultObject());
        setFechaPublicacion(UtilDate.getDefaultValue());
        setTitulo(UtilText.getDefaultValue());
        setContenido(UtilText.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public PublicacionEntity(final UUID identificador, final GrupoEntity grupo, final ParticipanteGrupoEntity autor, final LocalDateTime fechaPublicacion, final String titulo, final String contenido, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setGrupo(grupo);
        setAutor(autor);
        setFechaPublicacion(fechaPublicacion);
        setTitulo(titulo);
        setContenido(contenido);
        setEstado(estado);
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setGrupo(GrupoEntity grupo) {
        this.grupo = UtilObject.getDefault(grupo, GrupoEntity.getDefaultObject());
    }

    private void setAutor(ParticipanteGrupoEntity autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoEntity.getDefaultObject());
    }

    private void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = UtilDate.getDefault(fechaPublicacion);
    }

    private void setTitulo(String titulo) {
        this.titulo = UtilText.applyTrim(titulo);
    }

    private void setContenido(String contenido) {
        this.contenido = UtilText.applyTrim(contenido);
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public GrupoEntity getGrupo() {
        return grupo;
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

    public static final PublicacionEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
