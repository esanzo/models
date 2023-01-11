package cl.mp.rgp.common.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Transferir implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String idMotivoTransferencia;
	private java.lang.String idFiscaliaOrgien;
	private java.lang.String comentario;

	private java.lang.String idFiscaliaDestino;

	private java.lang.Boolean fiscaliaDestinoEsTerritorial;

	public Transferir() {
	}

	public java.lang.String getIdMotivoTransferencia() {
		return this.idMotivoTransferencia;
	}

	public void setIdMotivoTransferencia(java.lang.String idMotivoTransferencia) {
		this.idMotivoTransferencia = idMotivoTransferencia;
	}

	public java.lang.String getIdFiscaliaOrgien() {
		return this.idFiscaliaOrgien;
	}

	public void setIdFiscaliaOrgien(java.lang.String idFiscaliaOrgien) {
		this.idFiscaliaOrgien = idFiscaliaOrgien;
	}

	public java.lang.String getComentario() {
		return this.comentario;
	}

	public void setComentario(java.lang.String comentario) {
		this.comentario = comentario;
	}

	public java.lang.String getIdFiscaliaDestino() {
		return this.idFiscaliaDestino;
	}

	public void setIdFiscaliaDestino(java.lang.String idFiscaliaDestino) {
		this.idFiscaliaDestino = idFiscaliaDestino;
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

	public java.lang.Boolean getFiscaliaDestinoEsTerritorial() {
		return this.fiscaliaDestinoEsTerritorial;
	}

	public void setFiscaliaDestinoEsTerritorial(
			java.lang.Boolean fiscaliaDestinoEsTerritorial) {
		this.fiscaliaDestinoEsTerritorial = fiscaliaDestinoEsTerritorial;
	}

	public Transferir(java.lang.String idMotivoTransferencia,
			java.lang.String idFiscaliaOrgien, java.lang.String comentario,
			java.lang.String idFiscaliaDestino,
			java.lang.Boolean fiscaliaDestinoEsTerritorial) {
		this.idMotivoTransferencia = idMotivoTransferencia;
		this.idFiscaliaOrgien = idFiscaliaOrgien;
		this.comentario = comentario;
		this.idFiscaliaDestino = idFiscaliaDestino;
		this.fiscaliaDestinoEsTerritorial = fiscaliaDestinoEsTerritorial;
	}

}