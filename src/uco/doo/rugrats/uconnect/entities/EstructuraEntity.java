package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class EstructuraEntity {
    private UUID identificador;
    private OrganizacionEntity organizacion;
    private EstructuraEntity estructuraPadre;
    private String nombre;
    private EstadoEntity estado;

    public static final EstructuraEntity DEFAULT_OBJECT = new EstructuraEntity();

    public EstructuraEntity(final UUID identificador, final OrganizacionEntity organizacion, final EstructuraEntity estructuraPadre, final String nombre, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setOrganizacion(organizacion);
        setEstructuraPadre(estructuraPadre);
        setNombre(nombre);
        setEstado(estado);

    }

    private EstructuraEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setOrganizacion(OrganizacionEntity.getDefaultObject());
        setEstructuraPadre(EstructuraEntity.getDefaultObject());
        setNombre(UtilText.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());

    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setOrganizacion(final OrganizacionEntity organizacion) {
        this.organizacion = UtilObject.getDefault(organizacion, OrganizacionEntity.getDefaultObject());
    }

    private void setEstructuraPadre(final EstructuraEntity estructuraPadre) {
        this.estructuraPadre = UtilObject.getDefault(estructuraPadre, EstructuraEntity.getDefaultObject());
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

    public OrganizacionEntity getOrganizacion() {
        return organizacion;
    }

    public EstructuraEntity getEstructuraPadre() {
        return estructuraPadre;
    }

    public String getNombre() {
        return nombre;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static EstructuraEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
