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

    public static final HistorialLecturaEntity DEFAULT_OBJECT = new HistorialLecturaEntity();
    private HistorialLecturaEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setGrupo(GrupoEntity.getDefaultObject());
        setLector(ParticipanteGrupoEntity.getDefaultObject());
        setFechaLectura(UtilDate.getDefaultValue());
        setMensaje(MensajeEntity.getDefaultObject());
        setEstado(EstadoEntity.getDefaultObject());
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

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setGrupo(final GrupoEntity grupo) {
        this.grupo = UtilObject.getDefault(grupo, GrupoEntity.getDefaultObject());
    }

    private void setLector(final ParticipanteGrupoEntity lector) {
        this.lector = UtilObject.getDefault(lector, ParticipanteGrupoEntity.getDefaultObject());
    }

    private void setFechaLectura(final LocalDateTime fechaLectura) {
        this.fechaLectura = UtilDate.getDefault(fechaLectura);
    }

    private void setMensaje(final MensajeEntity mensaje) {
        this.mensaje = UtilObject.getDefault(mensaje, MensajeEntity.getDefaultObject());
    }

    private void setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
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

    public static HistorialLecturaEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
