package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class OrganizacionAdministradorOrganizacionEntity {
    private UUID identificador;
    private AdministradorOrganizacionEntity administrador;
    private OrganizacionEntity organizacion;
    private EstadoEntity estado;

    public static final OrganizacionAdministradorOrganizacionEntity DEFAULT_OBJECT = new OrganizacionAdministradorOrganizacionEntity();
    private OrganizacionAdministradorOrganizacionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setAdministrador(AdministradorOrganizacionEntity.create());
        setOrganizacion(OrganizacionEntity.create());
        setEstado(EstadoEntity.create());
    }

    public OrganizacionAdministradorOrganizacionEntity(final UUID identificador, final AdministradorOrganizacionEntity administrador, final OrganizacionEntity estructura, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setAdministrador(administrador);
        setOrganizacion(estructura);
        setEstado(estado);
    }

    public OrganizacionAdministradorOrganizacionEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public OrganizacionAdministradorOrganizacionEntity setAdministrador(final AdministradorOrganizacionEntity administrador) {
        this.administrador = UtilObject.getDefault(administrador, AdministradorOrganizacionEntity.create());
        return this;
    }

    public OrganizacionAdministradorOrganizacionEntity setOrganizacion(final OrganizacionEntity estructura) {
        this.organizacion = UtilObject.getDefault(estructura, OrganizacionEntity.create());
        return this;
    }

    public OrganizacionAdministradorOrganizacionEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public AdministradorOrganizacionEntity getAdministrador() {
        return administrador;
    }

    public OrganizacionEntity getOrganizacion() {
        return organizacion;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static OrganizacionAdministradorOrganizacionEntity create(){
        return new OrganizacionAdministradorOrganizacionEntity();
    }
}
