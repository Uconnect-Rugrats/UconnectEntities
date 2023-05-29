package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class RespuestaReportePublicacionEntity {
    private UUID identificador;
    private LocalDateTime fechaRespuesta;
    private ReportePublicacionEntity reporte;
    private EstadoEntity estado;
    private String explicacionVeredicto;
    private EstructuraAdministradorEstructuraEntity administrador;


    private RespuestaReportePublicacionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setFechaRespuesta(UtilDate.getDefaultValue());
        setReporte(ReportePublicacionEntity.create());
        setEstado(EstadoEntity.create());
        setExplicacionVeredicto(UtilText.getDefaultValue());
        setAdministrador(EstructuraAdministradorEstructuraEntity.create());
    }

    public RespuestaReportePublicacionEntity(final UUID identificador, final LocalDateTime fechaRespuesta, final ReportePublicacionEntity reporte, final EstadoEntity estado, final String explicacionVeredicto, final EstructuraAdministradorEstructuraEntity administrador) {
        super();
        setIdentificador(identificador);
        setFechaRespuesta(fechaRespuesta);
        setReporte(reporte);
        setEstado(estado);
        setExplicacionVeredicto(explicacionVeredicto);
        setAdministrador(administrador);
    }

    public RespuestaReportePublicacionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public RespuestaReportePublicacionEntity setFechaRespuesta(final LocalDateTime fechaRespuesta) {
        this.fechaRespuesta = UtilDate.getDefault(fechaRespuesta);
        return this;
    }

    public RespuestaReportePublicacionEntity setReporte(final ReportePublicacionEntity reporte) {
        this.reporte = UtilObject.getDefault(reporte, ReportePublicacionEntity.create());
        return this;
    }

    public RespuestaReportePublicacionEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }

    public RespuestaReportePublicacionEntity setExplicacionVeredicto(final String explicacionVeredicto) {
        this.explicacionVeredicto = UtilText.applyTrim(explicacionVeredicto);
        return this;
    }

    public RespuestaReportePublicacionEntity setAdministrador(final EstructuraAdministradorEstructuraEntity administrador) {
        this.administrador = UtilObject.getDefault(administrador, EstructuraAdministradorEstructuraEntity.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public LocalDateTime getFechaRespuesta() {
        return fechaRespuesta;
    }

    public ReportePublicacionEntity getReporte() {
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

    public static final RespuestaReportePublicacionEntity create(){
        return new RespuestaReportePublicacionEntity();
    }
}
