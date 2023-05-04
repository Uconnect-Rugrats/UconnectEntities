package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class RespuestaReporteComentarioEntity {
    private UUID identificador;
    private LocalDateTime fechaRespuesta;
    private ReporteComentarioEntity reporte;
    private EstadoEntity estado;
    private String explicacionVeredicto;
    private EstructuraAdministradorEstructuraEntity administrador;

    public static final RespuestaReporteComentarioEntity DEFAULT_OBJECT = new RespuestaReporteComentarioEntity();

    private RespuestaReporteComentarioEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setFechaRespuesta(UtilDate.getDefaultValue());
        setReporte(RespuestaReporteComentarioEntity.getDefaultObject().getReporte());
        setEstado(EstadoEntity.getDefaultObject());
        setExplicacionVeredicto(UtilText.getDefaultValue());
        setAdministrador(EstructuraAdministradorEstructuraEntity.getDefaultObject());
    }

    public RespuestaReporteComentarioEntity(final UUID identificador, final LocalDateTime fechaRespuesta, final ReporteComentarioEntity reporte, final EstadoEntity estado, final String explicacionVeredicto, final EstructuraAdministradorEstructuraEntity administrador) {
        super();
        setIdentificador(identificador);
        setFechaRespuesta(fechaRespuesta);
        setReporte(reporte);
        setEstado(estado);
        setExplicacionVeredicto(explicacionVeredicto);
        setAdministrador(administrador);
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setFechaRespuesta(LocalDateTime fechaRespuesta) {
        this.fechaRespuesta = UtilDate.getDefault(fechaRespuesta);
    }

    private void setReporte(ReporteComentarioEntity reporte) {
        this.reporte = UtilObject.getDefault(reporte, ReporteComentarioEntity.getDefaultObject());
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    private void setExplicacionVeredicto(String explicacionVeredicto) {
        this.explicacionVeredicto = UtilText.applyTrim(explicacionVeredicto);
    }

    private void setAdministrador(EstructuraAdministradorEstructuraEntity administrador) {
        this.administrador = UtilObject.getDefault(administrador, EstructuraAdministradorEstructuraEntity.getDefaultObject());
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public LocalDateTime getFechaRespuesta() {
        return fechaRespuesta;
    }

    public ReporteComentarioEntity getReporte() {
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

    public static final RespuestaReporteComentarioEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
