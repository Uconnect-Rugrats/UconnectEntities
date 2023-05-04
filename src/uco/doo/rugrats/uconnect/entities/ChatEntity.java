package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class ChatEntity {
    private UUID identificador;
    private GrupoEntity grupo;
    private EstadoEntity estado;

    public static final ChatEntity DEFAULT_OBJECT = new ChatEntity();

    private ChatEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setGrupo(GrupoEntity.getDefaultObject());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public ChatEntity(final UUID identificador, final GrupoEntity grupo, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setGrupo(grupo);
        setEstado(estado);
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setGrupo(GrupoEntity grupo) {
        this.grupo = UtilObject.getDefault(grupo, GrupoEntity.getDefaultObject());
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public GrupoEntity getGrupo() {
        return grupo;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static ChatEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
