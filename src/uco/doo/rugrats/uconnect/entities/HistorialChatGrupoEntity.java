package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class HistorialChatGrupoEntity {
    private UUID identificador;
    private ChatEntity chat;
    private ParticipanteGrupoEntity participante;
    private LocalDateTime fechaIngreso;

    private HistorialChatGrupoEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setChat(ChatEntity.create());
        setParticipante(ParticipanteGrupoEntity.create());
        setFechaIngreso(UtilDate.getDefaultValue());
    }

    public HistorialChatGrupoEntity(final UUID identificador, final ChatEntity chat, final ParticipanteGrupoEntity participante, final LocalDateTime fechaIngreso) {
        super();
        setIdentificador(identificador);
        setChat(chat);
        setParticipante(participante);
        setFechaIngreso(fechaIngreso);
    }

    public HistorialChatGrupoEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public HistorialChatGrupoEntity setChat(final ChatEntity chat) {
        this.chat = UtilObject.getDefault(chat, ChatEntity.create());
        return this;
    }

    public HistorialChatGrupoEntity setParticipante(final ParticipanteGrupoEntity participante) {
        this.participante = UtilObject.getDefault(participante, ParticipanteGrupoEntity.create());
        return this;
    }

    public HistorialChatGrupoEntity setFechaIngreso(final LocalDateTime fechaIngreso) {
        this.fechaIngreso = UtilDate.getDefault(fechaIngreso);
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public ChatEntity getChat() {
        return chat;
    }

    public ParticipanteGrupoEntity getParticipante() {
        return participante;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public static final HistorialChatGrupoEntity create(){
        return new HistorialChatGrupoEntity();
    }
}
