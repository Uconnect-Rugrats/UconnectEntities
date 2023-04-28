package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class PaisEntity {
    private UUID identificador;
    private String nombre;
    private String indicador;

    public static final PaisEntity DEFAULT_OBJECT = new PaisEntity();

    private PaisEntity(){
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setIndicador(UtilText.getDefaultNumeric());
    }

    public PaisEntity(UUID identificador, String nombre, String indicador){
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setIndicador(indicador);
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }

    private void setIndicador(String indicador) {
        this.indicador = UtilText.numericIsValid(UtilText.applyTrim(indicador)) ? UtilText.applyTrim(indicador) : UtilText.getDefaultNumeric();
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

    public static PaisEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }

}
