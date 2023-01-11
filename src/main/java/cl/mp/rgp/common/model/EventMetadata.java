package cl.mp.rgp.common.model;

import org.kie.api.remote.Remotable;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@org.kie.api.remote.Remotable
public class EventMetadata implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String idProcedimiento;

	@org.kie.api.definition.type.Label("Causa")
	private cl.mp.rgp.ingreso.model.Causa causa;

	@org.kie.api.definition.type.Label("Usuario")
	private cl.mp.rgp.common.model.PerfilamientoUsuarios usuario;

	private cl.mp.rgp.common.model.Preclasificacion preclasificacion;

	private cl.mp.rgp.flagrancia.model.Procedimiento procedimiento;

	private cl.mp.rgp.common.model.Solicitud solicitud;

	private cl.mp.rgp.common.ObjetoCDD objetoCDD;

	private java.lang.String cursoDeLaCausa;

	private java.lang.Boolean mismoFiscal;

	private java.lang.String ambiente;

	private java.lang.String token;

	private java.lang.String tipoTermino;

	private java.lang.String subTipoTermino;

	private java.lang.String motivoTermino;

	private cl.mp.rgp.common.ObjetoCCD objetoCCD;

	private cl.mp.rgp.common.ObjetoGCD objetoGCD;

	private cl.mp.rgp.common.AgruparSeparar agruparSeparar;

	public EventMetadata() {
	}

	public java.lang.String getIdProcedimiento() {
		return this.idProcedimiento;
	}

	public void setIdProcedimiento(java.lang.String idProcedimiento) {
		this.idProcedimiento = idProcedimiento;
	}

	public cl.mp.rgp.ingreso.model.Causa getCausa() {
		return this.causa;
	}

	public void setCausa(cl.mp.rgp.ingreso.model.Causa causa) {
		this.causa = causa;
	}

	public cl.mp.rgp.common.model.PerfilamientoUsuarios getUsuario() {
		return this.usuario;
	}

	public void setUsuario(cl.mp.rgp.common.model.PerfilamientoUsuarios usuario) {
		this.usuario = usuario;
	}

	public cl.mp.rgp.common.model.Preclasificacion getPreclasificacion() {
		return this.preclasificacion;
	}

	public void setPreclasificacion(
			cl.mp.rgp.common.model.Preclasificacion preclasificacion) {
		this.preclasificacion = preclasificacion;
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

	public cl.mp.rgp.flagrancia.model.Procedimiento getProcedimiento() {
		return this.procedimiento;
	}

	public void setProcedimiento(
			cl.mp.rgp.flagrancia.model.Procedimiento procedimiento) {
		this.procedimiento = procedimiento;
	}

	public cl.mp.rgp.common.model.Solicitud getSolicitud() {
		return this.solicitud;
	}

	public void setSolicitud(cl.mp.rgp.common.model.Solicitud solicitud) {
		this.solicitud = solicitud;
	}

	public cl.mp.rgp.common.ObjetoCDD getObjetoCDD() {
		return this.objetoCDD;
	}

	public void setObjetoCDD(cl.mp.rgp.common.ObjetoCDD objetoCDD) {
		this.objetoCDD = objetoCDD;
	}

	public java.lang.String getCursoDeLaCausa() {
		return this.cursoDeLaCausa;
	}

	public void setCursoDeLaCausa(java.lang.String cursoDeLaCausa) {
		this.cursoDeLaCausa = cursoDeLaCausa;
	}

	public java.lang.Boolean getMismoFiscal() {
		return this.mismoFiscal;
	}

	public void setMismoFiscal(java.lang.Boolean mismoFiscal) {
		this.mismoFiscal = mismoFiscal;
	}

	public java.lang.String getAmbiente() {
		return this.ambiente;
	}

	public void setAmbiente(java.lang.String ambiente) {
		this.ambiente = ambiente;
	}

	public java.lang.String getToken() {
		return this.token;
	}

	public void setToken(java.lang.String token) {
		this.token = token;
	}

	public java.lang.String getTipoTermino() {
		return this.tipoTermino;
	}

	public void setTipoTermino(java.lang.String tipoTermino) {
		this.tipoTermino = tipoTermino;
	}

	public java.lang.String getSubTipoTermino() {
		return this.subTipoTermino;
	}

	public void setSubTipoTermino(java.lang.String subTipoTermino) {
		this.subTipoTermino = subTipoTermino;
	}

	public java.lang.String getMotivoTermino() {
		return this.motivoTermino;
	}

	public void setMotivoTermino(java.lang.String motivoTermino) {
		this.motivoTermino = motivoTermino;
	}

	public cl.mp.rgp.common.ObjetoCCD getObjetoCCD() {
		return this.objetoCCD;
	}

	public void setObjetoCCD(cl.mp.rgp.common.ObjetoCCD objetoCCD) {
		this.objetoCCD = objetoCCD;
	}

	public cl.mp.rgp.common.ObjetoGCD getObjetoGCD() {
		return this.objetoGCD;
	}

	public void setObjetoGCD(cl.mp.rgp.common.ObjetoGCD objetoGCD) {
		this.objetoGCD = objetoGCD;
	}

	public cl.mp.rgp.common.AgruparSeparar getAgruparSeparar() {
		return this.agruparSeparar;
	}

	public void setAgruparSeparar(cl.mp.rgp.common.AgruparSeparar agruparSeparar) {
		this.agruparSeparar = agruparSeparar;
	}

	public EventMetadata(java.lang.String idProcedimiento,
			cl.mp.rgp.ingreso.model.Causa causa,
			cl.mp.rgp.common.model.PerfilamientoUsuarios usuario,
			cl.mp.rgp.common.model.Preclasificacion preclasificacion,
			cl.mp.rgp.flagrancia.model.Procedimiento procedimiento,
			cl.mp.rgp.common.model.Solicitud solicitud,
			cl.mp.rgp.common.ObjetoCDD objetoCDD,
			java.lang.String cursoDeLaCausa, java.lang.Boolean mismoFiscal,
			java.lang.String ambiente, java.lang.String token,
			java.lang.String tipoTermino, java.lang.String subTipoTermino,
			java.lang.String motivoTermino,
			cl.mp.rgp.common.ObjetoCCD objetoCCD,
			cl.mp.rgp.common.ObjetoGCD objetoGCD,
			cl.mp.rgp.common.AgruparSeparar agruparSeparar) {
		this.idProcedimiento = idProcedimiento;
		this.causa = causa;
		this.usuario = usuario;
		this.preclasificacion = preclasificacion;
		this.procedimiento = procedimiento;
		this.solicitud = solicitud;
		this.objetoCDD = objetoCDD;
		this.cursoDeLaCausa = cursoDeLaCausa;
		this.mismoFiscal = mismoFiscal;
		this.ambiente = ambiente;
		this.token = token;
		this.tipoTermino = tipoTermino;
		this.subTipoTermino = subTipoTermino;
		this.motivoTermino = motivoTermino;
		this.objetoCCD = objetoCCD;
		this.objetoGCD = objetoGCD;
		this.agruparSeparar = agruparSeparar;
	}

}