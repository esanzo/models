package cl.mp.rgp.common.model;

import org.kie.api.remote.Remotable;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * This class was automatically generated by the data modeler tool.
 */

public class Relacion implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String ruc;
	private java.lang.String idVictima;
	private java.lang.String idImputado;
	private java.lang.String idDelito;
	private java.lang.String idCausa;

	public Relacion() {
	}

	public java.lang.String getRuc() {
		return this.ruc;
	}

	public void setRuc(java.lang.String ruc) {
		this.ruc = ruc;
	}

	public java.lang.String getIdVictima() {
		return this.idVictima;
	}

	public void setIdVictima(java.lang.String idVictima) {
		this.idVictima = idVictima;
	}

	public java.lang.String getIdImputado() {
		return this.idImputado;
	}

	public void setIdImputado(java.lang.String idImputado) {
		this.idImputado = idImputado;
	}

	public java.lang.String getIdDelito() {
		return this.idDelito;
	}

	public void setIdDelito(java.lang.String idDelito) {
		this.idDelito = idDelito;
	}

	public java.lang.String getIdCausa() {
		return this.idCausa;
	}

	public void setIdCausa(java.lang.String idCausa) {
		this.idCausa = idCausa;
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

	public Relacion(java.lang.String ruc, java.lang.String idVictima,
			java.lang.String idImputado, java.lang.String idDelito,
			java.lang.String idCausa) {
		this.ruc = ruc;
		this.idVictima = idVictima;
		this.idImputado = idImputado;
		this.idDelito = idDelito;
		this.idCausa = idCausa;
	}

}