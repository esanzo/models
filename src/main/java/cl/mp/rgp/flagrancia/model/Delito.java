package cl.mp.rgp.flagrancia.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Delito implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Id Delito")
	private java.lang.Integer idDelito;
	@org.kie.api.definition.type.Label("Ubicacion")
	private java.lang.String ubicacion;
	@org.kie.api.definition.type.Label("Hecho Delictual")
	private java.lang.String hechoDelictual;

	@org.kie.api.definition.type.Label("Prioritario")
	private java.lang.Boolean prioritario;

	@org.kie.api.definition.type.Label("Tipo Delito")
	private java.lang.String tipoDelito;

	@org.kie.api.definition.type.Label("Código Delito")
	private java.lang.String codigoDelito;

	public Delito() {
	}

	public java.lang.Integer getIdDelito() {
		return this.idDelito;
	}

	public void setIdDelito(java.lang.Integer idDelito) {
		this.idDelito = idDelito;
	}

	public java.lang.String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(java.lang.String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public java.lang.String getHechoDelictual() {
		return this.hechoDelictual;
	}

	public void setHechoDelictual(java.lang.String hechoDelictual) {
		this.hechoDelictual = hechoDelictual;
	}

	public java.lang.Boolean getPrioritario() {
		return this.prioritario;
	}

	public void setPrioritario(java.lang.Boolean prioritario) {
		this.prioritario = prioritario;
	}

	public java.lang.String getTipoDelito() {
		return this.tipoDelito;
	}

	public void setTipoDelito(java.lang.String tipoDelito) {
		this.tipoDelito = tipoDelito;
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

	public java.lang.String getCodigoDelito() {
		return this.codigoDelito;
	}

	public void setCodigoDelito(java.lang.String codigoDelito) {
		this.codigoDelito = codigoDelito;
	}

	public Delito(java.lang.Integer idDelito, java.lang.String ubicacion,
			java.lang.String hechoDelictual, java.lang.Boolean prioritario,
			java.lang.String tipoDelito, java.lang.String codigoDelito) {
		this.idDelito = idDelito;
		this.ubicacion = ubicacion;
		this.hechoDelictual = hechoDelictual;
		this.prioritario = prioritario;
		this.tipoDelito = tipoDelito;
		this.codigoDelito = codigoDelito;
	}

}
