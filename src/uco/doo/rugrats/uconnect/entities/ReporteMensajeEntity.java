package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class ReporteMensajeEntity {
    private UUID identificador;
    private MensajeEntity mensaje;
    private ParticipanteGrupoEntity autor;
    private CausaReporteEntity causa;
    private LocalDateTime fechaAcusacion;
    private EstadoEntity estado;
    public static final ReporteMensajeEntity DEFAULT_OBJECT = new ReporteMensajeEntity();
    private ReporteMensajeEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setMensaje(MensajeEntity.getDefaultObject());
        setAutor(ParticipanteGrupoEntity.getDefaultObject());
        setCausa(CausaReporteEntity.getDefaultObject());
        setFechaAcusacion(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
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

    private void setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setMensaje(MensajeEntity mensaje) {
        this.mensaje = UtilObject.getDefault(mensaje, MensajeEntity.getDefaultObject());
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

    public static final ReporteMensajeEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
