package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilBoolean;
import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class ComentarioEntity {
    private UUID identificador;
    private PublicacionEntity publicacion;
    private ComentarioEntity comentarioPadre;
    private LocalDateTime fechaComentario;
    private ParticipanteGrupoEntity autor;
    private String contenido;
    private EstadoEntity estado;
    private boolean tienePadre;
    private static final String UUID_PADRE = "";
    private static final ComentarioEntity PADRE = new ComentarioEntity(UtilUUID.generateUUIDFromString(UUID_PADRE),PublicacionEntity.create(),null,UtilDate.getDefaultValue(),ParticipanteGrupoEntity.create(),UtilText.getDefaultValue(),EstadoEntity.create(),UtilBoolean.getDefaultValue());


    public static final ComentarioEntity DEFAULT_OBJECT = new ComentarioEntity();

    private ComentarioEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionEntity.create());
        setComentarioPadre(PADRE);
        setFechaComentario(UtilDate.getDefaultValue());
        setAutor(ParticipanteGrupoEntity.create());
        setContenido(UtilText.getDefaultValue());
        setEstado(EstadoEntity.create());
        setTienePadre(UtilBoolean.getDefaultValue());
    }

    public ComentarioEntity( UUID identificador, PublicacionEntity publicacion, ComentarioEntity comentarioPadre, LocalDateTime fechaPublicacion, ParticipanteGrupoEntity autor, String contenido, EstadoEntity estado, boolean tienePadre) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setComentarioPadre(comentarioPadre);
        setFechaComentario(fechaPublicacion);
        setAutor(autor);
        setContenido(contenido);
        setEstado(estado);
        setTienePadre(tienePadre);
    }
    

    public final boolean isTienePadre() {
		return tienePadre;
	}

	public final ComentarioEntity setTienePadre(boolean tienePadre) {
		this.tienePadre = UtilBoolean.getDefault(tienePadre);
		return this;
	}

	public ComentarioEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

	public ComentarioEntity setPublicacion(final PublicacionEntity publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.create());
        return this;
    }

	public ComentarioEntity setComentarioPadre(final ComentarioEntity comentarioPadre) {
        if(isTienePadre()) {
            this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioEntity.create());
        }else {
            this.comentarioPadre = PADRE;

        }
    	return this;
    }

	public ComentarioEntity setFechaComentario(final LocalDateTime fechaPublicacion) {
        this.fechaComentario = UtilDate.getDefault(fechaPublicacion);
        return this;
    }

	public ComentarioEntity setAutor(final ParticipanteGrupoEntity autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoEntity.create());
        return this;
    }

	public ComentarioEntity setContenido(final String contenido) {
        this.contenido = UtilText.applyTrim(contenido);
        return this;
    }

	public ComentarioEntity setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionEntity getPublicacion() {
        return publicacion;
    }

    public ComentarioEntity getComentarioPadre() {
        return comentarioPadre;
    }

    public LocalDateTime getFechaComentario() {
        return fechaComentario;
    }

    public ParticipanteGrupoEntity getAutor() {
        return autor;
    }

    public String getContenido() {
        return contenido;
    }

    public EstadoEntity getEstado() {
        return estado;
    }
    
    public static final ComentarioEntity create(){
        return new  ComentarioEntity();
    }
}
