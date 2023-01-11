package cl.mp.rgp.common.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PerfilamientoUsuarios implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer fiscaliaId;

	private java.lang.String regionId;

	@org.kie.api.definition.type.Label("Zona Id")
	private java.lang.Integer zonaId;

	private java.lang.String modulo;

	private java.lang.String token;

	private java.lang.String ambiente;

	public PerfilamientoUsuarios() {
	}

	public java.lang.Integer getFiscaliaId() {
		return this.fiscaliaId;
	}

	public void setFiscaliaId(java.lang.Integer fiscaliaId) {
		this.fiscaliaId = fiscaliaId;
	}

	public java.lang.String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(java.lang.String regionId) {
		this.regionId = regionId;
	}

	public java.lang.Integer getZonaId() {
		return this.zonaId;
	}

	public void setZonaId(java.lang.Integer zonaId) {
		this.zonaId = zonaId;
	}

	public java.lang.String getModulo() {
		return this.modulo;
	}

	public void setModulo(java.lang.String modulo) {
		this.modulo = modulo;
	}

	@Override
	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		String tempToken = this.getToken();
		this.setToken("empty");
		String json = null;
		try {
			json = mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setToken(tempToken);
		return json;
	}

	public java.lang.String getToken() {
		return this.token;
	}

	public void setToken(java.lang.String token) {
		this.token = token;
	}

	public java.lang.String getAmbiente() {
		return this.ambiente;
	}

	public void setAmbiente(java.lang.String ambiente) {
		this.ambiente = ambiente;
	}

	public PerfilamientoUsuarios(java.lang.Integer fiscaliaId,
			java.lang.String regionId, java.lang.Integer zonaId,
			java.lang.String modulo, java.lang.String token,
			java.lang.String ambiente) {
		this.fiscaliaId = fiscaliaId;
		this.regionId = regionId;
		this.zonaId = zonaId;
		this.modulo = modulo;
		this.token = token;
		this.ambiente = ambiente;
	}

}
