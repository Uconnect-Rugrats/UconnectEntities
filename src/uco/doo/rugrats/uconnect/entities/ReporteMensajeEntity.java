package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class ReporteMensajeEntity {
    private UUID identificador;
    private MensajeEntity mensaje;
    private ParticipanteGrupoEntity autor;
    private CausaReporteEntity causa;
    private LocalDateTime fechaAcusacion;
    private EstadoEntity estado;
    private ReporteMensajeEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setMensaje(MensajeEntity.getDefaultObject());
        setAutor(ParticipanteGrupoEntity.create());
        setCausa(CausaReporteEntity.create());
        setFechaAcusacion(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.create());
    }

    public ReporteMensajeEntity(final UUID identificador, final MensajeEntity mensaje, final ParticipanteGrupoEntity autor, final CausaReporteEntity causa, final LocalDateTime fechaAcusacion, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setMensaje(mensaje);
        setAutor(autor);
        setCausa(causa);
        setFechaAcusacion(fechaAcusacion);
        setEstado(estado);
    }

    public ReporteMensajeEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ReporteMensajeEntity setMensaje(final MensajeEntity mensaje) {
        this.mensaje = UtilObject.getDefault(mensaje, MensajeEntity.getDefaultObject());
        return this;
    }

    public ReporteMensajeEntity setAutor(final ParticipanteGrupoEntity autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoEntity.create());
        return this;
    }

    public ReporteMensajeEntity setCausa(final CausaReporteEntity causa) {
        this.causa = UtilObject.getDefault(causa, CausaReporteEntity.create());
        return this;
    }

    public ReporteMensajeEntity setFechaAcusacion(final LocalDateTime fechaAcusacion) {
        this.fechaAcusacion = UtilDate.getDefault(fechaAcusacion);
        return this;
    }

    public ReporteMensajeEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public MensajeEntity getMensaje() {
        return mensaje;
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

    public static final ReporteMensajeEntity create(){
        return new ReporteMensajeEntity();
    }
}
