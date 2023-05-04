package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class ReaccionEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private ParticipanteGrupoEntity autor;
    private LocalDateTime fechaReaccion;
    private TipoReaccionEntity tipo;
    private EstadoEntity estado;

    public static final ReaccionEntity DEFAULT_OBJECT = new ReaccionEntity();
    private ReaccionEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionEntity.getDefaultObject());
        setAutor(ParticipanteGrupoEntity.getDefaultObject());
        setFechaReaccion(UtilDate.getDefaultValue());
        setTipo(TipoReaccionEntity.getDefaultObject());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public ReaccionEntity(final UUID identificador, final PublicacionEntity publicacion, final ParticipanteGrupoEntity autor, final LocalDateTime fechaReaccion, final TipoReaccionEntity tipo, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setAutor(autor);
        setFechaReaccion(fechaReaccion);
        setTipo(tipo);
        setEstado(estado);
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setPublicacion(final PublicacionEntity publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion,  PublicacionEntity.getDefaultObject());
    }

    private void setAutor(final ParticipanteGrupoEntity autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoEntity.getDefaultObject());
    }

    private void setFechaReaccion(final LocalDateTime fechaReaccion) {
        this.fechaReaccion = UtilDate.getDefault(fechaReaccion);
    }

    private void setTipo(final TipoReaccionEntity tipo) {
        this.tipo = UtilObject.getDefault(tipo, TipoReaccionEntity.getDefaultObject());
    }

    private void setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionEntity getPublicacion() {
        return publicacion;
    }

    public ParticipanteGrupoEntity getAutor() {
        return autor;
    }

    public LocalDateTime getFechaReaccion() {
        return fechaReaccion;
    }

    public TipoReaccionEntity getTipo() {
        return tipo;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static final ReaccionEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
