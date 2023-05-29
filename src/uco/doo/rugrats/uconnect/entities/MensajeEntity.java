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

    public MensajeEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setChat(ChatEntity.create());
        setAutor(ParticipanteGrupoEntity.create());
        setFechaEnviado(UtilDate.getDefaultValue());
        setContenido(UtilText.getDefaultValue());
        setEstado(EstadoEntity.create());
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

    public MensajeEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public MensajeEntity setChat(final ChatEntity chat) {
        this.chat = UtilObject.getDefault(chat, ChatEntity.create());
        return this;
    }

    public MensajeEntity setAutor(ParticipanteGrupoEntity autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoEntity.create());
        return this;
    }

    public MensajeEntity setFechaEnviado(LocalDateTime fechaEnviado) {
        this.fechaEnviado = UtilDate.getDefault(fechaEnviado);
        return this;
    }

    public MensajeEntity setContenido(String contenido) {
        this.contenido = UtilText.applyTrim(contenido);
        return this;
    }

    public MensajeEntity setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
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
        return new MensajeEntity();
    }
}
