package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class ReporteComentarioEntity {
    private UUID identificador;
    private ComentarioEntity comentario;
    private ParticipanteGrupoEntity autor;
    private CausaReporteEntity causa;
    private LocalDateTime fechaAcusacion;
    private EstadoEntity estado;

    private ReporteComentarioEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setComentario(ComentarioEntity.create());
        setAutor(ParticipanteGrupoEntity.create());
        setCausa(CausaReporteEntity.create());
        setFechaAcusacion(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.create());
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

    public ReporteComentarioEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ReporteComentarioEntity setComentario(final ComentarioEntity comentario) {
        this.comentario = UtilObject.getDefault(comentario, ComentarioEntity.create());
        return this;
    }

    public ReporteComentarioEntity setAutor(final ParticipanteGrupoEntity autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoEntity.create());
        return this;
    }

    public ReporteComentarioEntity setCausa(final CausaReporteEntity causa) {
        this.causa = UtilObject.getDefault(causa, CausaReporteEntity.create());
        return this;
    }

    public ReporteComentarioEntity setFechaAcusacion(final LocalDateTime fechaAcusacion) {
        this.fechaAcusacion = UtilDate.getDefault(fechaAcusacion);
        return this;
    }

    public ReporteComentarioEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
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

    public static final ReporteComentarioEntity create(){
        return new ReporteComentarioEntity();
    }
}
