package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class RespuestaReporteComentarioEntity {
    private UUID identificador;
    private LocalDateTime fechaRespuesta;
    private ReporteComentarioEntity reporte;
    private EstadoEntity estado;
    private String explicacionVeredicto;
    private EstructuraAdministradorEstructuraEntity administrador;


    private RespuestaReporteComentarioEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setFechaRespuesta(UtilDate.getDefaultValue());
        setReporte(RespuestaReporteComentarioEntity.create().getReporte());
        setEstado(EstadoEntity.create());
        setExplicacionVeredicto(UtilText.getDefaultValue());
        setAdministrador(EstructuraAdministradorEstructuraEntity.create());
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

    public RespuestaReporteComentarioEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public RespuestaReporteComentarioEntity setFechaRespuesta(final LocalDateTime fechaRespuesta) {
        this.fechaRespuesta = UtilDate.getDefault(fechaRespuesta);
        return this;
    }

    public RespuestaReporteComentarioEntity setReporte(final ReporteComentarioEntity reporte) {
        this.reporte = UtilObject.getDefault(reporte, ReporteComentarioEntity.create());
        return this;
    }

    public RespuestaReporteComentarioEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }

    public RespuestaReporteComentarioEntity setExplicacionVeredicto(final String explicacionVeredicto) {
        this.explicacionVeredicto = UtilText.applyTrim(explicacionVeredicto);
        return this;
    }

    public RespuestaReporteComentarioEntity setAdministrador(final EstructuraAdministradorEstructuraEntity administrador) {
        this.administrador = UtilObject.getDefault(administrador, EstructuraAdministradorEstructuraEntity.create());
        return this;
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

    public static final RespuestaReporteComentarioEntity create(){
        return new RespuestaReporteComentarioEntity();
    }
}
