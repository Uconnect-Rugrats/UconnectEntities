package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilBoolean;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class GrupoEntity {
    private UUID identificador;
    private EstructuraEntity estructura;
    private String nombre;
    private EstadoEntity estado;
    private boolean estaEstadoRealActivo;

    private GrupoEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setEstructura(EstructuraEntity.create());
        setNombre(UtilText.getDefaultValue());
        setEstado(EstadoEntity.create());
        setEstaEstadoRealActivo(UtilBoolean.getDefaultValue());
    }

    public GrupoEntity(final UUID identificador, final EstructuraEntity estructura, final String nombre, final EstadoEntity estado, final boolean estaEstadoRealActivo) {
        super();
        setIdentificador(identificador);
        setEstructura(estructura);
        setNombre(nombre);
        setEstado(estado);
        setEstaEstadoRealActivo(estaEstadoRealActivo);
    }

    public GrupoEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public GrupoEntity setEstructura(final EstructuraEntity estructura) {
        this.estructura = UtilObject.getDefault(estructura, EstructuraEntity.create());
        return this;
    }

    public GrupoEntity setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public GrupoEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
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

    public static GrupoEntity create(){
        return new GrupoEntity();
    }

	public boolean isEstaEstadoRealActivo() {
		return estaEstadoRealActivo;
	}

	public GrupoEntity setEstaEstadoRealActivo(boolean estaEstadoRealActivo) {
		this.estaEstadoRealActivo = estaEstadoRealActivo;
		return this;
	}
}
