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

    private EstadoEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setTipoEstado(TipoEstadoEntity.create());
    }


    public EstadoEntity(final UUID identificador, final String nombre, final TipoEstadoEntity tipoEstado, final String descripcion) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
        setTipoEstado(tipoEstado);
    }

    public final EstadoEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public final EstadoEntity setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public EstadoEntity setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public final EstadoEntity setTipoEstado(final TipoEstadoEntity tipoEstado) {
        this.tipoEstado = UtilObject.getDefault(tipoEstado, TipoEstadoEntity.create());
        return this;
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

    public static EstadoEntity create (){
        return new EstadoEntity();
    }
}
