package uco.doo.rugrats.uconnect.entities;


import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;


public final class EstadoEntity {

    private UUID identificador;
    private String nombre;
    private String descripcion;
    private TipoEstadoEntity tipoEstado;

    public static final EstadoEntity DEFAULT_OBJECT = new EstadoEntity();
    private EstadoEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setTipoEstado(TipoEstadoEntity.getDefaultObject());
    }


    public EstadoEntity(final UUID identificador, final String nombre, final TipoEstadoEntity tipoEstado, final String descripcion) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
        setTipoEstado(tipoEstado);
    }

    private final void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private final void setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }

    private void setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
    }

    public String getDescripcion() {
        return descripcion;
    }

    private final void setTipoEstado(final TipoEstadoEntity tipoEstado) {
        this.tipoEstado = UtilObject.getDefault(tipoEstado, TipoEstadoEntity.getDefaultObject());
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final String getNombre() {
        return nombre;
    }

    public final TipoEstadoEntity getTipoEstado() {
        return tipoEstado;
    }

    public static EstadoEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
}
