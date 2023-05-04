package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class OrganizacionAdministradorOrganizacionEntity {
    private UUID identificador;
    private AdministradorOrganizacionEntity administrador;
    private OrganizacionEntity organizacion;
    private EstadoEntity estado;

    public static final OrganizacionAdministradorOrganizacionEntity DEFAULT_OBJECT = new OrganizacionAdministradorOrganizacionEntity();
    private OrganizacionAdministradorOrganizacionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setAdministrador(AdministradorOrganizacionEntity.getDefaultObject());
        setOrganizacion(OrganizacionEntity.getDefaultObject());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public OrganizacionAdministradorOrganizacionEntity(final UUID identificador, final AdministradorOrganizacionEntity administrador, final OrganizacionEntity estructura, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setAdministrador(administrador);
        setOrganizacion(estructura);
        setEstado(estado);
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setAdministrador(AdministradorOrganizacionEntity administrador) {
        this.administrador = UtilObject.getDefault(administrador, AdministradorOrganizacionEntity.getDefaultObject());
    }

    private void setOrganizacion(OrganizacionEntity estructura) {
        this.organizacion = UtilObject.getDefault(estructura, OrganizacionEntity.getDefaultObject());
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public AdministradorOrganizacionEntity getAdministrador() {
        return administrador;
    }

    public OrganizacionEntity getEstructura() {
        return organizacion;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static OrganizacionAdministradorOrganizacionEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
