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


    private OrganizacionEntity(){
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setTipo(TipoOrganizacionEntity.create());
        setEstado(EstadoEntity.create());
    }

    public OrganizacionEntity(final UUID identificador, final String nombre, final String descripcion, final TipoOrganizacionEntity tipo, final EstadoEntity estado) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
        setTipo(tipo);
        setEstado(estado);
    }

    public OrganizacionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public OrganizacionEntity setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public OrganizacionEntity setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public OrganizacionEntity setTipo(final TipoOrganizacionEntity tipo) {
        this.tipo = UtilObject.getDefault(tipo, TipoOrganizacionEntity.create());
        return this;
    }

    public OrganizacionEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
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

    public static OrganizacionEntity create(){
        return new OrganizacionEntity();
    }
}
