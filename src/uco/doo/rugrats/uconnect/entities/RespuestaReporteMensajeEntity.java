package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class RespuestaReporteMensajeEntity {
    private UUID identificador;
    private LocalDateTime fechaRespuesta;
    private ReporteMensajeEntity reporte;
    private EstadoEntity estado;
    private String explicacionVeredicto;
    private EstructuraAdministradorEstructuraEntity administrador;

    public static final RespuestaReporteMensajeEntity DEFAULT_OBJECT = new RespuestaReporteMensajeEntity();

    private RespuestaReporteMensajeEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setFechaRespuesta(UtilDate.getDefaultValue());
        setReporte(ReporteMensajeEntity.getDefaultObject());
        setEstado(EstadoEntity.getDefaultObject());
        setExplicacionVeredicto(UtilText.getDefaultValue());
        setAdministrador(EstructuraAdministradorEstructuraEntity.getDefaultObject());
    }

    public RespuestaReporteMensajeEntity(final UUID identificador, final LocalDateTime fechaRespuesta, final ReporteMensajeEntity reporte, final EstadoEntity estado, final String explicacionVeredicto, final EstructuraAdministradorEstructuraEntity administrador) {
        super();
        setIdentificador(identificador);
        setFechaRespuesta(fechaRespuesta);
        setReporte(reporte);
        setEstado(estado);
        setExplicacionVeredicto(explicacionVeredicto);
        setAdministrador(administrador);
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setFechaRespuesta(final LocalDateTime fechaRespuesta) {
        this.fechaRespuesta = UtilDate.getDefault(fechaRespuesta);
    }

    private void setReporte(final ReporteMensajeEntity reporte) {
        this.reporte = UtilObject.getDefault(reporte, ReporteMensajeEntity.getDefaultObject());
    }

    private void setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    private void setExplicacionVeredicto(final String explicacionVeredicto) {
        this.explicacionVeredicto = UtilText.applyTrim(explicacionVeredicto);
    }

    private void setAdministrador(final EstructuraAdministradorEstructuraEntity administrador) {
        this.administrador = UtilObject.getDefault(administrador, EstructuraAdministradorEstructuraEntity.getDefaultObject());
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public LocalDateTime getFechaRespuesta() {
        return fechaRespuesta;
    }

    public ReporteMensajeEntity getReporte() {
        return reporte;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public String getExplicacionVeredicto() {
        return explicacionVeredicto;
    }

    public EstructuraAdministradorEstructuraEntity getAdministrador() {
        return administrador;
    }

    public static final RespuestaReporteMensajeEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
