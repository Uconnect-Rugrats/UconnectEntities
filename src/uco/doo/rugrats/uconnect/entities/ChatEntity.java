package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class ChatEntity {
    private UUID identificador;
    private GrupoEntity grupo;
    private EstadoEntity estado;

    private ChatEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setGrupo(GrupoEntity.create());
        setEstado(EstadoEntity.create());
    }

    public ChatEntity(final UUID identificador, final GrupoEntity grupo, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setGrupo(grupo);
        setEstado(estado);
    }

    public ChatEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ChatEntity setGrupo(final GrupoEntity grupo) {
        this.grupo = UtilObject.getDefault(grupo, GrupoEntity.create());
        return this;
    }

    public ChatEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
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

    public static ChatEntity create(){
        return new ChatEntity();
    }
}
