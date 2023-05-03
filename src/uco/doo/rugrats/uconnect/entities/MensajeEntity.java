package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class MensajeEntity {
    private UUID identificador;
    private ChatEntity chat;
    private ParticipanteGrupoEntity autor;
    private LocalDateTime fechaEnviado;
    private String contenido;
    private EstadoEntity estado;

    public static final MensajeEntity DEFAULT_OBJECT = new MensajeEntity();
    public MensajeEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setChat(ChatEntity.getDefaultObject());
        setAutor(ParticipanteGrupoEntity.getDefaultObject());
        setFechaEnviado(UtilDate.getDefaultValue());
        setContenido(UtilText.getDefaultValue());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public MensajeEntity(final UUID identificador, final ChatEntity chat, final ParticipanteGrupoEntity autor, final LocalDateTime fechaEnviado, final String contenido, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setChat(chat);
        setAutor(autor);
        setFechaEnviado(fechaEnviado);
        setContenido(contenido);
        setEstado(estado);
    }

    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setChat(final ChatEntity chat) {
        this.chat = UtilObject.getDefault(chat, ChatEntity.getDefaultObject());
    }

    private void setAutor(ParticipanteGrupoEntity autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoEntity.getDefaultObject());
    }

    private void setFechaEnviado(LocalDateTime fechaEnviado) {
        this.fechaEnviado = UtilDate.getDefault(fechaEnviado);
    }

    private void setContenido(String contenido) {
        this.contenido = UtilText.applyTrim(contenido);
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public ChatEntity getChat() {
        return chat;
    }

    public ParticipanteGrupoEntity getAutor() {
        return autor;
    }

    public LocalDateTime getFechaEnviado() {
        return fechaEnviado;
    }

    public String getContenido() {
        return contenido;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static MensajeEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
