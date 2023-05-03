package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class OrganizacionEntity {
    private UUID identificador;
    private String nombre;
    private String descripcion;
    private TipoOrganizacionEntity tipo;
    private EstadoEntity estado;

    public static final OrganizacionEntity DEFAULT_OBJECT = new OrganizacionEntity();

    private OrganizacionEntity(){
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setTipo(TipoOrganizacionEntity.getDefaultObject());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public OrganizacionEntity(final UUID identificador, final String nombre, final String descripcion, final TipoOrganizacionEntity tipo, final EstadoEntity estado) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
        setTipo(tipo);
        setEstado(estado);
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }

    private void setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
    }

    private void setTipo(final TipoOrganizacionEntity tipo) {
        this.tipo = UtilObject.getDefault(tipo, TipoOrganizacionEntity.getDefaultObject());
    }

    private void setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
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

    public TipoOrganizacionEntity getTipo() {
        return tipo;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static OrganizacionEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
