package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class HistorialLecturaEntity {
    private UUID identificador;
    private GrupoEntity grupo;
    private ParticipanteGrupoEntity lector;
    private LocalDateTime fechaLectura;
    private MensajeEntity mensaje;
    private EstadoEntity estado;

    private HistorialLecturaEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setGrupo(GrupoEntity.create());
        setLector(ParticipanteGrupoEntity.create());
        setFechaLectura(UtilDate.getDefaultValue());
        setMensaje(MensajeEntity.getDefaultObject());
        setEstado(EstadoEntity.create());
    }

    public HistorialLecturaEntity(final UUID identificador, final GrupoEntity grupo, final ParticipanteGrupoEntity lector, final LocalDateTime fechaLectura, final MensajeEntity mensaje, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setGrupo(grupo);
        setLector(lector);
        setFechaLectura(fechaLectura);
        setMensaje(mensaje);
        setEstado(estado);
    }

    public HistorialLecturaEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public HistorialLecturaEntity setGrupo(final GrupoEntity grupo) {
        this.grupo = UtilObject.getDefault(grupo, GrupoEntity.create());
        return this;
    }

    public HistorialLecturaEntity setLector(final ParticipanteGrupoEntity lector) {
        this.lector = UtilObject.getDefault(lector, ParticipanteGrupoEntity.create());
        return this;
    }

    public HistorialLecturaEntity setFechaLectura(final LocalDateTime fechaLectura) {
        this.fechaLectura = UtilDate.getDefault(fechaLectura);
        return this;
    }

    public HistorialLecturaEntity setMensaje(final MensajeEntity mensaje) {
        this.mensaje = UtilObject.getDefault(mensaje, MensajeEntity.getDefaultObject());
        return this;
    }

    public HistorialLecturaEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public GrupoEntity getGrupo() {
        return grupo;
    }

    public ParticipanteGrupoEntity getLector() {
        return lector;
    }

    public LocalDateTime getFechaLectura() {
        return fechaLectura;
    }

    public MensajeEntity getMensaje() {
        return mensaje;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static HistorialLecturaEntity create(){
        return new HistorialLecturaEntity();
    }
}
