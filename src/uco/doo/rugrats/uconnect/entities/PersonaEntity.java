package uco.doo.rugrats.uconnect.entities;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public final class PersonaEntity {
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

    private PersonaEntity(){
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setTipoIdentificacion(TipoIdentificacionEntity.create());
        setNumeroIdentificacion(UtilText.getDefaultNumeric());
        setPrimerNombre(UtilText.getDefaultValue());
        setSegundoNombre(UtilText.getDefaultValue());
        setPrimerApellido(UtilText.getDefaultValue());
        setSegundoApellido(UtilText.getDefaultValue());
        setCorreo(UtilText.getDefaultEmailAdress());
        setPaisTelefono(PaisEntity.create());
        setNumeroTelefono(UtilText.getDefaultNumeric());
        setEstado(EstadoEntity.create());
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

    public PersonaEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PersonaEntity setTipoIdentificacion(final TipoIdentificacionEntity tipoIdentificacion) {
        this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionEntity.create());
        return this;
    }

    public PersonaEntity setNumeroIdentificacion(final String numeroIdentificacion) {
        this.numeroIdentificacion = UtilText.getUtilText().numericIsValid(UtilText.applyTrim(numeroIdentificacion)) ? UtilText.applyTrim(numeroIdentificacion) : UtilText.getDefaultNumeric();
        return this;
    }

    public PersonaEntity setPrimerNombre(String primerNombre) {
        this.primerNombre = UtilText.applyTrim(primerNombre);
        return this;
    }

    public PersonaEntity setSegundoNombre(String segundoNombre) {
        this.segundoNombre = UtilText.applyTrim(segundoNombre);
        return this;
    }

    public PersonaEntity setPrimerApellido(String primerApellido) {
        this.primerApellido = UtilText.applyTrim(primerApellido);
        return this;
    }

    public PersonaEntity setSegundoApellido(String segundoApellido) {
        this.segundoApellido = UtilText.applyTrim(segundoApellido);
        return this;
    }

    public PersonaEntity setCorreo(final String correo) {
        this.correo = UtilText.getUtilText().emailIsvalid(UtilText.applyTrim(correo)) ? UtilText.applyTrim(correo) : UtilText.getDefaultEmailAdress();
        return this;
 }

    public PersonaEntity setPaisTelefono(final PaisEntity paisTelefono) {
        this.paisTelefono = UtilObject.getDefault(paisTelefono, PaisEntity.create());
        return this;
    }

    public PersonaEntity setNumeroTelefono(final String numeroTelefono) {
        this.numeroTelefono = UtilText.getUtilText().numericIsValid(UtilText.applyTrim(numeroTelefono)) ? UtilText.applyTrim(numeroTelefono) : UtilText.getDefaultNumeric();
        return this;
    }

    public PersonaEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
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

    public static PersonaEntity create(){
        return new PersonaEntity();
    }
}
