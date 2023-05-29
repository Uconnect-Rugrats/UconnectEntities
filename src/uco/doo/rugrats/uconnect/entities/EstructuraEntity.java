package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilBoolean;
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
    private boolean tienePadre;
    private static final String UUID_PADRE = "";
    private static final EstructuraEntity PADRE = new EstructuraEntity(UtilUUID.generateUUIDFromString(UUID_PADRE),OrganizacionEntity.create(),null,UtilText.getDefaultValue(),EstadoEntity.create(),UtilBoolean.getDefaultValue());

    public EstructuraEntity(UUID identificador, OrganizacionEntity organizacion, EstructuraEntity estructuraPadre,String nombre, EstadoEntity estado, boolean tienePadre) {
        super();
        setIdentificador(identificador);
        setOrganizacion(organizacion);
        setEstructuraPadre(estructuraPadre);
        setNombre(nombre);
        setEstado(estado);
        setTienePadre(tienePadre);
    }

    private EstructuraEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setOrganizacion(OrganizacionEntity.create());
        setEstructuraPadre(PADRE);
        setNombre(UtilText.getDefaultValue());
        setEstado(EstadoEntity.create());
        setTienePadre(UtilBoolean.getDefaultValue());
    }
    
    public final boolean isTienePadre() {
		return tienePadre;
	}

	public final EstructuraEntity setTienePadre(boolean tienePadre) {
		this.tienePadre = UtilBoolean.getDefault(tienePadre);
		return this;
	}

	public EstructuraEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

	public EstructuraEntity setOrganizacion(final OrganizacionEntity organizacion) {
        this.organizacion = UtilObject.getDefault(organizacion, OrganizacionEntity.create());
        return this;
    }

	public EstructuraEntity setEstructuraPadre(final EstructuraEntity estructuraPadre) {
        if(isTienePadre()) {
            this.estructuraPadre = UtilObject.getDefault(estructuraPadre, EstructuraEntity.create());
        }else {
            this.estructuraPadre = PADRE;
        }
    	return this;
    }

	public EstructuraEntity setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

	public EstructuraEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
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

    public static EstructuraEntity create(){
        return new EstructuraEntity();
    }
}
