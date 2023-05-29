package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class EstructuraAdministradorEstructuraEntity {

    private UUID identificador;
    private AdministradorEstructuraEntity administrador;
    private EstructuraEntity estructura;
    private EstadoEntity estado;

    private EstructuraAdministradorEstructuraEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setAdministrador(AdministradorEstructuraEntity.create());
        setEstructura(EstructuraEntity.create());
        setEstado(EstadoEntity.create());
    }

    public EstructuraAdministradorEstructuraEntity(final UUID identificador, final AdministradorEstructuraEntity administrador, final EstructuraEntity estructura, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setAdministrador(administrador);
        setEstructura(estructura);
        setEstado(estado);
    }

    public EstructuraAdministradorEstructuraEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public EstructuraAdministradorEstructuraEntity setAdministrador(final AdministradorEstructuraEntity administrador) {
        this.administrador = UtilObject.getDefault(administrador, AdministradorEstructuraEntity.create());
        return this;
    }

    public EstructuraAdministradorEstructuraEntity setEstructura(final EstructuraEntity estructura) {
        this.estructura = UtilObject.getDefault(estructura, EstructuraEntity.create());
        return this;
    }

    public EstructuraAdministradorEstructuraEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
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

    public static EstructuraAdministradorEstructuraEntity create(){
        return new EstructuraAdministradorEstructuraEntity();
    }
}
