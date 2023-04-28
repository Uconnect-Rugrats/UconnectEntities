package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class PersonaEntity {
    private UUID identificador;
    private TipoIdentificacionEntity tipoIdentificacion;
    private String numeroIdentificacion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String correo;
    private PaisEntity paisTelefono;
    private String numeroTelefono;
    private EstadoEntity estado;

    public static final PersonaEntity DEFAULT_OBJECT = new PersonaEntity();
    private PersonaEntity(){
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setTipoIdentificacion(TipoIdentificacionEntity.getDefaultObject());
        setNumeroIdentificacion(UtilText.getDefaultNumeric());
        setPrimerNombre(UtilText.getDefaultValue());
        setSegundoNombre(UtilText.getDefaultValue());
        setPrimerApellido(UtilText.getDefaultValue());
        setSegundoApellido(UtilText.getDefaultValue());
        setCorreo(UtilText.getDefaultEmailAdress());
        setPaisTelefono(PaisEntity.getDefaultObject());
        setNumeroTelefono(UtilText.getDefaultNumeric());
        setEstado(EstadoEntity.getDefaultObject());
    }

    public PersonaEntity(final UUID identificador, final TipoIdentificacionEntity tipoIdentificacion, final String numeroIdentificacion, final String primerNombre, final String segundoNombre, final String primerApellido, final String segundoApellido, final String correo, final PaisEntity paisTelefono, final String numeroTelefono, final EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setTipoIdentificacion(tipoIdentificacion);
        setNumeroIdentificacion(numeroIdentificacion);
        setPrimerNombre(primerNombre);
        setSegundoNombre(segundoNombre);
        setPrimerApellido(primerApellido);
        setSegundoApellido(segundoApellido);
        setCorreo(correo);
        setPaisTelefono(paisTelefono);
        setNumeroTelefono(numeroTelefono);
        setEstado(estado);
    }

    private void setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setTipoIdentificacion(TipoIdentificacionEntity tipoIdentificacion) {
        this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionEntity.getDefaultObject());
    }

    private void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = UtilText.numericIsValid(UtilText.applyTrim(numeroIdentificacion)) ? UtilText.applyTrim(numeroIdentificacion) : UtilText.getDefaultNumeric();
    }

    private void setPrimerNombre(String primerNombre) {
        this.primerNombre = UtilText.applyTrim(primerNombre);
    }

    private void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = UtilText.applyTrim(segundoNombre);
    }

    private void setPrimerApellido(String primerApellido) {
        this.primerApellido = UtilText.applyTrim(primerApellido);
    }

    private void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = UtilText.applyTrim(segundoApellido);
    }

    private void setCorreo(String correo) {
        this.correo = UtilText.emailIsvalid(UtilText.applyTrim(correo)) ? UtilText.applyTrim(correo) : UtilText.getDefaultEmailAdress();
    }

    private void setPaisTelefono(PaisEntity paisTelefono) {
        this.paisTelefono = UtilObject.getDefault(paisTelefono, PaisEntity.getDefaultObject());
    }

    private void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = UtilText.numericIsValid(UtilText.applyTrim(numeroTelefono)) ? UtilText.applyTrim(numeroTelefono) : UtilText.getDefaultNumeric();
    }

    private void setEstado(EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public TipoIdentificacionEntity getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getCorreo() {
        return correo;
    }

    public PaisEntity getPaisTelefono() {
        return paisTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public static PersonaEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
