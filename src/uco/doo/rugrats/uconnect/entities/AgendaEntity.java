package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class AgendaEntity {
    private UUID identificador;
    private GrupoEntity grupo;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private EstadoEntity estado;

    public static final AgendaEntity DEFAULT_OBJECT = new AgendaEntity();
    private AgendaEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setGrupo(GrupoEntity.getDefaultObject());
        setFechaInicio(UtilDate.getDefaultValue());
        setFechaFin(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public AgendaEntity(final UUID identificador, final GrupoEntity grupo, final LocalDateTime fechaInicio, final LocalDateTime fechaFin, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setGrupo(grupo);
        setFechaInicio(fechaInicio);
        setFechaFin(fechaFin);
        setEstado(estado);
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setGrupo(GrupoEntity grupo) {
        this.grupo = UtilObject.getDefault(grupo, GrupoEntity.getDefaultObject());
    }

    private void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = UtilDate.getDefault(fechaInicio);
    }

    private void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = UtilDate.getDefault(fechaFin);
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

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static AgendaEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
