package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class TipoOrganizacionEntity {
    private UUID identificador;
    private String nombre;
    private String descripcion;

    public static final TipoOrganizacionEntity DEFAULT_OBJECT = new TipoOrganizacionEntity();
    private TipoOrganizacionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
    }

    public TipoOrganizacionEntity(UUID identificador, String nombre, String descripcion) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }



    private void setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }

    private void setDescripcion(String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
    }


    public static TipoOrganizacionEntity getDefaultObject() {
        return DEFAULT_OBJECT;
    }

}

