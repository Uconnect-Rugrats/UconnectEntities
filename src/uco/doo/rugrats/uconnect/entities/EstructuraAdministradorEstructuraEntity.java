package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class EstructuraAdministradorEstructuraEntity {

    private UUID identificador;
    private AdministradorEstructuraEntity administrador;
    private EstructuraEntity estructura;
    private EstadoEntity estado;

    public static final EstructuraAdministradorEstructuraEntity DEFAULT_OBJECT = new EstructuraAdministradorEstructuraEntity();
    private EstructuraAdministradorEstructuraEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setAdministrador(AdministradorEstructuraEntity.getDefaultObject());
        setEstructura(EstructuraEntity.getDefaultObject());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public EstructuraAdministradorEstructuraEntity(final UUID identificador, final AdministradorEstructuraEntity administrador, final EstructuraEntity estructura, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setAdministrador(administrador);
        setEstructura(estructura);
        setEstado(estado);
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setAdministrador(final AdministradorEstructuraEntity administrador) {
        this.administrador = UtilObject.getDefault(administrador, AdministradorEstructuraEntity.getDefaultObject());
    }

    private void setEstructura(final EstructuraEntity estructura) {
        this.estructura = UtilObject.getDefault(estructura, EstructuraEntity.getDefaultObject());
    }

    private void setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public AdministradorEstructuraEntity getAdministrador() {
        return administrador;
    }

    public EstructuraEntity getEstructura() {
        return estructura;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static EstructuraAdministradorEstructuraEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
