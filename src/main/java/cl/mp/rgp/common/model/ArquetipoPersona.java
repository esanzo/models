package cl.mp.rgp.common.model;

/**
 * This class was automatically generated by the data modeler tool.
 */
 
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@org.kie.api.definition.type.Description("Arquetipo")
public class ArquetipoPersona implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private String idPersona;

	private java.lang.String rut;

	private java.lang.String pasaporte;

	private java.lang.String dni;

	private java.lang.String nombre;

	private java.lang.String apellido;

	private java.lang.String tipo;

	private java.util.List<cl.mp.rgp.common.model.Direccion> domicilio;

	@org.kie.api.definition.type.Label("Detenido")
	private java.lang.Boolean detenido;

	@org.kie.api.definition.type.Label("ACD")
	private java.lang.Boolean acd;

	@org.kie.api.definition.type.Label("Denunciante Policial")
	private java.lang.Boolean denunciantePolicial;

	@org.kie.api.definition.type.Label("Apercibido")
	private java.lang.Boolean apercibido;

	private java.lang.String apellidoMaterno;

	private java.lang.String apellidoPaterno;

	public ArquetipoPersona() {
	}

	public java.lang.String getRut() {
		return this.rut;
	}

	public void setRut(java.lang.String rut) {
		this.rut = rut;
	}

	public java.lang.String getPasaporte() {
		return this.pasaporte;
	}

	public void setPasaporte(java.lang.String pasaporte) {
		this.pasaporte = pasaporte;
	}

	public java.lang.String getDni() {
		return this.dni;
	}

	public void setDni(java.lang.String dni) {
		this.dni = dni;
	}

	public java.lang.String getNombre() {
		return this.nombre;
	}

	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	public java.lang.String getApellido() {
		return this.apellido;
	}

	public void setApellido(java.lang.String apellido) {
		this.apellido = apellido;
	}

	public java.lang.String getTipo() {
		return this.tipo;
	}

	public void setTipo(java.lang.String tipo) {
		this.tipo = tipo;
	}

	public java.util.List<cl.mp.rgp.common.model.Direccion> getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(
			java.util.List<cl.mp.rgp.common.model.Direccion> domicilio) {
		this.domicilio = domicilio;
	}

	public java.lang.Boolean getDetenido() {
		return this.detenido;
	}

	public void setDetenido(java.lang.Boolean detenido) {
		this.detenido = detenido;
	}

	public java.lang.Boolean getAcd() {
		return this.acd;
	}

	public void setAcd(java.lang.Boolean acd) {
		this.acd = acd;
	}

	public java.lang.Boolean getDenunciantePolicial() {
		return this.denunciantePolicial;
	}

	public void setDenunciantePolicial(java.lang.Boolean denunciantePolicial) {
		this.denunciantePolicial = denunciantePolicial;
	}

    @Override
    public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		try {
			json = mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return json;
    }

	public java.lang.String getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(java.lang.String idPersona) {
		this.idPersona = idPersona;
	}

	public java.lang.Boolean getApercibido() {
		return this.apercibido;
	}

	public void setApercibido(java.lang.Boolean apercibido) {
		this.apercibido = apercibido;
	}

	public java.lang.String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(java.lang.String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public java.lang.String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(java.lang.String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public ArquetipoPersona(java.lang.String idPersona, java.lang.String rut,
			java.lang.String pasaporte, java.lang.String dni,
			java.lang.String nombre, java.lang.String apellido,
			java.lang.String tipo,
			java.util.List<cl.mp.rgp.common.model.Direccion> domicilio,
			java.lang.Boolean detenido, java.lang.Boolean acd,
			java.lang.Boolean denunciantePolicial,
			java.lang.Boolean apercibido, java.lang.String apellidoMaterno,
			java.lang.String apellidoPaterno) {
		this.idPersona = idPersona;
		this.rut = rut;
		this.pasaporte = pasaporte;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo = tipo;
		this.domicilio = domicilio;
		this.detenido = detenido;
		this.acd = acd;
		this.denunciantePolicial = denunciantePolicial;
		this.apercibido = apercibido;
		this.apellidoMaterno = apellidoMaterno;
		this.apellidoPaterno = apellidoPaterno;
	}

}