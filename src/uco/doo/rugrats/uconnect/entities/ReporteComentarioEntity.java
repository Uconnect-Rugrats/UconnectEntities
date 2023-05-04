package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class ReporteComentarioEntity {
    private UUID identificador;
    private ComentarioEntity comentario;
    private ParticipanteGrupoEntity autor;
    private CausaReporteEntity causa;
    private LocalDateTime fechaAcusacion;
    private EstadoEntity estado;

    public static final ReporteComentarioEntity DEFAULT_OBJECT = new ReporteComentarioEntity();
    private ReporteComentarioEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setComentario(ComentarioEntity.getDefaultObject());
        setAutor(ParticipanteGrupoEntity.getDefaultObject());
        setCausa(CausaReporteEntity.getDefaultObject());
        setFechaAcusacion(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public ReporteComentarioEntity(final UUID identificador, final ComentarioEntity comentario, final ParticipanteGrupoEntity autor, final CausaReporteEntity causa, final LocalDateTime fechaAcusacion, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setComentario(comentario);
        setAutor(autor);
        setCausa(causa);
        setFechaAcusacion(fechaAcusacion);
        setEstado(estado);
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setComentario(ComentarioEntity comentario) {
        this.comentario = UtilObject.getDefault(comentario, ComentarioEntity.getDefaultObject());
    }

    private void setAutor(ParticipanteGrupoEntity autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoEntity.getDefaultObject());
    }

    private void setCausa(CausaReporteEntity causa) {
        this.causa = UtilObject.getDefault(causa, CausaReporteEntity.getDefaultObject());
    }

    private void setFechaAcusacion(LocalDateTime fechaAcusacion) {
        this.fechaAcusacion = UtilDate.getDefault(fechaAcusacion);
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public ComentarioEntity getComentario() {
        return comentario;
    }

    public ParticipanteGrupoEntity getAutor() {
        return autor;
    }

    public CausaReporteEntity getCausa() {
        return causa;
    }

    public LocalDateTime getFechaAcusacion() {
        return fechaAcusacion;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static final ReporteComentarioEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
