package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class GrupoEntity {
    private UUID identificador;
    private EstructuraEntity estructura;
    private String nombre;
    private EstadoEntity estado;

    public static final GrupoEntity DEFAULT_OBJECT = new GrupoEntity();
    private GrupoEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setEstructura(EstructuraEntity.getDefaultObject());
        setNombre(UtilText.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public GrupoEntity(final UUID identificador, final EstructuraEntity estructura, final String nombre, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setEstructura(estructura);
        setNombre(nombre);
        setEstado(estado);
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setEstructura(final EstructuraEntity estructura) {
        this.estructura = UtilObject.getDefault(estructura, EstructuraEntity.getDefaultObject());
    }

    private void setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }

    private void setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public EstructuraEntity getEstructura() {
        return estructura;
    }

    public String getNombre() {
        return nombre;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static GrupoEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
