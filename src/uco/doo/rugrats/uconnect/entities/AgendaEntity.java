package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class AgendaEntity {
    private UUID identificador;
    private GrupoEntity grupo;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private EstadoEntity estado;

    private AgendaEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setGrupo(GrupoEntity.create());
        setFechaInicio(UtilDate.getDefaultValue());
        setFechaFin(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.create());
    }

    public AgendaEntity(final UUID identificador, final GrupoEntity grupo, final LocalDateTime fechaInicio, final LocalDateTime fechaFin, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setGrupo(grupo);
        setFechaInicio(fechaInicio);
        setFechaFin(fechaFin);
        setEstado(estado);
    }

    public AgendaEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public AgendaEntity setGrupo(final GrupoEntity grupo) {
        this.grupo = UtilObject.getDefault(grupo, GrupoEntity.create());
        return this;
    }

    public AgendaEntity setFechaInicio(final LocalDateTime fechaInicio) {
        this.fechaInicio = UtilDate.getDefault(fechaInicio);
        return this;
    }

    public AgendaEntity setFechaFin(final LocalDateTime fechaFin) {
        this.fechaFin = UtilDate.getDefault(fechaFin);
        return this;
    }

    public AgendaEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
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

    public static AgendaEntity create(){
        return new AgendaEntity();
    }
}
