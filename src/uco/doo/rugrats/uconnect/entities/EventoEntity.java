package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class EventoEntity {
    private UUID identificador;
    private AgendaEntity agenda;
    private String nombre;
    private String descripcion;
    private String lugar;
    private EstructuraAdministradorEstructuraEntity organizador;
    private TipoEventoEntity tipo;
    private LocalDateTime fechaEjecucion;
    private EstadoEntity estado;

    public static final EventoEntity DEFAULT_OBJECT = new EventoEntity();
    private EventoEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setAgenda(AgendaEntity.getDefaultObject());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setLugar(UtilText.getDefaultValue());
        setOrganizador(EstructuraAdministradorEstructuraEntity.getDefaultObject());
        setTipo(TipoEventoEntity.getDefaultObject());
        setFechaEjecucion(UtilDate.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
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

    private void setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setAgenda(AgendaEntity agenda) {
        this.agenda = UtilObject.getDefault(agenda, AgendaEntity.getDefaultObject());
    }

    private void setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }

    private void setDescripcion(String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
    }

    private void setLugar(String lugar) {
        this.lugar = UtilText.applyTrim(lugar);
    }

    private void setOrganizador(EstructuraAdministradorEstructuraEntity organizador) {
        this.organizador = UtilObject.getDefault(organizador, EstructuraAdministradorEstructuraEntity.getDefaultObject());
    }

    private void setTipo(TipoEventoEntity tipo) {
        this.tipo = UtilObject.getDefault(tipo, TipoEventoEntity.getDefaultObject());
    }

    private void setFechaEjecucion(LocalDateTime fechaEjecucion) {
        this.fechaEjecucion = UtilDate.getDefault(fechaEjecucion);
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
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

    public static final EventoEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
