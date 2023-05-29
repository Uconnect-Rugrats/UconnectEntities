package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class EventoEntity {
    private UUID identificador;
    private AgendaEntity agenda;
    private String nombre;
    private String descripcion;
    private String lugar;
    private EstructuraAdministradorEstructuraEntity organizador;
    private TipoEventoEntity tipo;
    private LocalDateTime fechaEjecucion;
    private EstadoEntity estado;

    private EventoEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setAgenda(AgendaEntity.create());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setLugar(UtilText.getDefaultValue());
        setOrganizador(EstructuraAdministradorEstructuraEntity.create());
        setTipo(TipoEventoEntity.create());
        setFechaEjecucion(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.create());
    }

    public EventoEntity(final UUID identificador, final AgendaEntity agenda, final String nombre, final String descripcion, String lugar, final EstructuraAdministradorEstructuraEntity organizador, final TipoEventoEntity tipo, final LocalDateTime fechaEjecucion, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setAgenda(agenda);
        setNombre(nombre);
        setDescripcion(descripcion);
        setLugar(lugar);
        setOrganizador(organizador);
        setTipo(tipo);
        setFechaEjecucion(fechaEjecucion);
        setEstado(estado);
    }

    public EventoEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public EventoEntity setAgenda(final AgendaEntity agenda) {
        this.agenda = UtilObject.getDefault(agenda, AgendaEntity.create());
        return this;
    }

    public EventoEntity setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public EventoEntity setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public EventoEntity setLugar(final String lugar) {
        this.lugar = UtilText.applyTrim(lugar);
        return this;
    }

    public EventoEntity setOrganizador(final EstructuraAdministradorEstructuraEntity organizador) {
        this.organizador = UtilObject.getDefault(organizador, EstructuraAdministradorEstructuraEntity.create());
        return this;
    }

    public EventoEntity setTipo(final TipoEventoEntity tipo) {
        this.tipo = UtilObject.getDefault(tipo, TipoEventoEntity.create());
        return this;
    }

    public EventoEntity setFechaEjecucion(final LocalDateTime fechaEjecucion) {
        this.fechaEjecucion = UtilDate.getDefault(fechaEjecucion);
        return this;
    }

    public EventoEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public AgendaEntity getAgenda() {
        return agenda;
    }

    public String getNombreEvento() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public EstructuraAdministradorEstructuraEntity getOrganizador() {
        return organizador;
    }

    public TipoEventoEntity getTipo() {
        return tipo;
    }

    public LocalDateTime getFechaEjecucion() {
       return fechaEjecucion;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static final EventoEntity create(){
        return new EventoEntity();
    }
}
