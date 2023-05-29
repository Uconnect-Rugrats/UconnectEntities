package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class TipoIdentificacionEntity {
    private UUID identificador;
    private String nombre;
    private String indicador;

    private TipoIdentificacionEntity(){
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setIndicador(UtilText.getDefaultNumeric());
    }

    public TipoIdentificacionEntity(UUID identificador, String nombre, String indicador){
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setIndicador(indicador);
    }

    public TipoIdentificacionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public TipoIdentificacionEntity setNombre(final String nombre) {
        this.nombre = UtilText.getDefault(nombre);
        return this;
    }

    public TipoIdentificacionEntity setIndicador(final String indicador) {
        this.indicador = UtilText.getUtilText().numericIsValid(UtilText.applyTrim(indicador)) ? UtilText.applyTrim(indicador) : UtilText.getDefaultNumeric();
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getIndicador() {
        return indicador;
    }

    public static TipoIdentificacionEntity create(){
        return new TipoIdentificacionEntity();
    }

}
