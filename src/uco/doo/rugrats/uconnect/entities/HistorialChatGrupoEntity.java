package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class HistorialChatGrupoEntity {
    private UUID identificador;
    private ChatEntity chat;
    private ParticipanteGrupoEntity participante;
    private LocalDateTime fechaIngreso;

    public static final HistorialChatGrupoEntity DEFAULT_OBJECT = new HistorialChatGrupoEntity();
    private HistorialChatGrupoEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setChat(ChatEntity.getDefaultObject());
        setParticipante(ParticipanteGrupoEntity.getDefaultObject());
        setFechaIngreso(UtilDate.getDefaultValue());
    }

    public HistorialChatGrupoEntity(final UUID identificador, final ChatEntity chat, final ParticipanteGrupoEntity participante, final LocalDateTime fechaIngreso) {
        super();
        setIdentificador(identificador);
        setChat(chat);
        setParticipante(participante);
        setFechaIngreso(fechaIngreso);
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setChat(ChatEntity chat) {
        this.chat = UtilObject.getDefault(chat, ChatEntity.getDefaultObject());
    }

    public void setParticipante(ParticipanteGrupoEntity participante) {
        this.participante = UtilObject.getDefault(participante, ParticipanteGrupoEntity.getDefaultObject());
    }

    private void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = UtilDate.getDefault(fechaIngreso);
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

    public static final HistorialChatGrupoEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
