package cl.mp.rgp.ingreso.model;

import org.kie.api.remote.Remotable;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Date;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.remote.Remotable
public class Causa implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private String idCausa;
	private java.util.List<cl.mp.rgp.common.model.Documentacion> docAdjunta;

	private String idDenuncia;

	private java.lang.String descripcion;

	@org.kie.api.definition.type.Label("Ruc")
	private java.lang.String ruc;

	@org.kie.api.definition.type.Label("Existe Propuesta Asignacion")
	private java.lang.Boolean existePropuestaAsignacion;

	@org.kie.api.definition.type.Label("Fiscal Jefe Preclasificó")
	private java.lang.Boolean fiscalJefePreclasifico;

	@org.kie.api.definition.type.Label("Lista de Delitos")
	private java.util.List<cl.mp.rgp.flagrancia.model.Delito> delitos;

	@org.kie.api.definition.type.Label("Estado Propuesta Asignacion")
	private java.lang.String estadoPropuestaAsignacion;

	@org.kie.api.definition.type.Label("Antecedentes Especificos")
	private java.util.List<cl.mp.rgp.common.model.Documentacion> antecedentesEspecificos;

	@org.kie.api.definition.type.Label("Especies")
	private java.util.List<cl.mp.rgp.common.model.Especie> especies;

	@org.kie.api.definition.type.Label("ID Catalogo Documental Digital")
	private java.lang.String idCatalogoDocDigital;

	@org.kie.api.definition.type.Label("Comuna Registrada")
	private java.lang.Boolean comunaRegistrada;

	@org.kie.api.definition.type.Label("Decision Asignacion")
	private java.lang.String decisionAsignacion;

	@org.kie.api.definition.type.Label("Complejidad")
	private java.lang.String complejidad;

	private java.lang.String idProcedimiento;

	private java.lang.String idInstitucionOrigen;

	private java.lang.String alerta;

	private java.lang.Boolean existenLesionados;

	private java.lang.Boolean existenFallecidos;

	private java.lang.String caratula;

	private java.lang.String numeroDenuncia;

	private java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> imputados;

	private java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> victimas;

	private java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> denunciantes;

	private java.lang.String actividad;

	private java.lang.String causaJudicializada;

	private Date fechaUltimaActividad;

	private cl.mp.rgp.common.model.Preclasificacion preclasificacion;

	private java.lang.String nombrePreclasificador;

	private java.lang.String idFiscalAsignado;

	private java.lang.String idFiscalia;

	private java.util.List<cl.mp.rgp.common.model.Solicitud> diligenciasASolicitar;

	private java.util.List<cl.mp.rgp.common.model.Relacion> relaciones;

	private java.util.Date fechaCreacion;

	private java.lang.String idOrigenDenuncia;

	private java.lang.String tipoTermino;

	private java.lang.String accionTermino;

	private java.lang.String subTipoTermino;

	private java.lang.String motivoTermino;

	public Causa() {
	}

	public java.util.List<cl.mp.rgp.common.model.Documentacion> getDocAdjunta() {
		return this.docAdjunta;
	}

	public void setDocAdjunta(
			java.util.List<cl.mp.rgp.common.model.Documentacion> docAdjunta) {
		this.docAdjunta = docAdjunta;
	}

	public java.lang.String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(java.lang.String descripcion) {
		this.descripcion = descripcion;
	}

	public java.lang.String getRuc() {
		return this.ruc;
	}

	public void setRuc(java.lang.String ruc) {
		this.ruc = ruc;
	}

	public java.lang.String getIdDenuncia() {
		return this.idDenuncia;
	}

	public void setIdDenuncia(java.lang.String idDenuncia) {
		this.idDenuncia = idDenuncia;
	}

	public java.lang.Boolean getExistePropuestaAsignacion() {
		return this.existePropuestaAsignacion;
	}

	public void setExistePropuestaAsignacion(
			java.lang.Boolean existePropuestaAsignacion) {
		this.existePropuestaAsignacion = existePropuestaAsignacion;
	}

	public java.lang.Boolean getFiscalJefePreclasifico() {
		return this.fiscalJefePreclasifico;
	}

	public void setFiscalJefePreclasifico(
			java.lang.Boolean fiscalJefePreclasifico) {
		this.fiscalJefePreclasifico = fiscalJefePreclasifico;
	}

	public java.util.List<cl.mp.rgp.flagrancia.model.Delito> getDelitos() {
		return this.delitos;
	}

	public void setDelitos(
			java.util.List<cl.mp.rgp.flagrancia.model.Delito> delitos) {
		this.delitos = delitos;
	}

	public java.lang.String getEstadoPropuestaAsignacion() {
		return this.estadoPropuestaAsignacion;
	}

	public void setEstadoPropuestaAsignacion(
			java.lang.String estadoPropuestaAsignacion) {
		this.estadoPropuestaAsignacion = estadoPropuestaAsignacion;
	}

	public java.util.List<cl.mp.rgp.common.model.Documentacion> getAntecedentesEspecificos() {
		return this.antecedentesEspecificos;
	}

	public void setAntecedentesEspecificos(
			java.util.List<cl.mp.rgp.common.model.Documentacion> antecedentesEspecificos) {
		this.antecedentesEspecificos = antecedentesEspecificos;
	}

	public java.util.List<cl.mp.rgp.common.model.Especie> getEspecies() {
		return this.especies;
	}

	public void setEspecies(
			java.util.List<cl.mp.rgp.common.model.Especie> especies) {
		this.especies = especies;
	}

	public java.lang.String getIdCatalogoDocDigital() {
		return this.idCatalogoDocDigital;
	}

	public void setIdCatalogoDocDigital(java.lang.String idCatalogoDocDigital) {
		this.idCatalogoDocDigital = idCatalogoDocDigital;
	}

	public java.lang.Boolean getComunaRegistrada() {
		return this.comunaRegistrada;
	}

	public void setComunaRegistrada(java.lang.Boolean comunaRegistrada) {
		this.comunaRegistrada = comunaRegistrada;
	}

	public java.lang.String getDecisionAsignacion() {
		return this.decisionAsignacion;
	}

	public void setDecisionAsignacion(java.lang.String decisionAsignacion) {
		this.decisionAsignacion = decisionAsignacion;
	}

	public java.lang.String getComplejidad() {
		return this.complejidad;
	}

	public void setComplejidad(java.lang.String complejidad) {
		this.complejidad = complejidad;
	}

	public java.lang.String getIdProcedimiento() {
		return this.idProcedimiento;
	}

	public void setIdProcedimiento(java.lang.String idProcedimiento) {
		this.idProcedimiento = idProcedimiento;
	}

	public java.lang.String getIdCausa() {
		return this.idCausa;
	}

	public void setIdCausa(java.lang.String idCausa) {
		this.idCausa = idCausa;
	}

	public java.lang.String getIdInstitucionOrigen() {
		return this.idInstitucionOrigen;
	}

	public void setIdInstitucionOrigen(java.lang.String idInstitucionOrigen) {
		this.idInstitucionOrigen = idInstitucionOrigen;
	}

	public java.lang.String getAlerta() {
		return this.alerta;
	}

	public void setAlerta(java.lang.String alerta) {
		this.alerta = alerta;
	}

	public java.lang.Boolean getExistenLesionados() {
		return this.existenLesionados;
	}

	public void setExistenLesionados(java.lang.Boolean existenLesionados) {
		this.existenLesionados = existenLesionados;
	}

	public java.lang.Boolean getExistenFallecidos() {
		return this.existenFallecidos;
	}

	public void setExistenFallecidos(java.lang.Boolean existenFallecidos) {
		this.existenFallecidos = existenFallecidos;
	}

	public java.lang.String getCaratula() {
		return this.caratula;
	}

	public void setCaratula(java.lang.String caratula) {
		this.caratula = caratula;
	}

	public java.lang.String getNumeroDenuncia() {
		return this.numeroDenuncia;
	}

	public void setNumeroDenuncia(java.lang.String numeroDenuncia) {
		this.numeroDenuncia = numeroDenuncia;
	}

	public java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> getImputados() {
		return this.imputados;
	}

	public void setImputados(
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> imputados) {
		this.imputados = imputados;
	}

	public java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> getVictimas() {
		return this.victimas;
	}

	public void setVictimas(
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> victimas) {
		this.victimas = victimas;
	}

	public java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> getDenunciantes() {
		return this.denunciantes;
	}

	public void setDenunciantes(
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> denunciantes) {
		this.denunciantes = denunciantes;
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

	public java.lang.String getActividad() {
		return this.actividad;
	}

	public void setActividad(java.lang.String actividad) {
		this.actividad = actividad;
	}

	public java.lang.String getCausaJudicializada() {
		return this.causaJudicializada;
	}

	public void setCausaJudicializada(java.lang.String causaJudicializada) {
		this.causaJudicializada = causaJudicializada;
	}

	public cl.mp.rgp.common.model.Preclasificacion getPreclasificacion() {
		return this.preclasificacion;
	}

	public void setPreclasificacion(
			cl.mp.rgp.common.model.Preclasificacion preclasificacion) {
		this.preclasificacion = preclasificacion;
	}

	public java.util.Date getFechaUltimaActividad() {
		return this.fechaUltimaActividad;
	}

	public void setFechaUltimaActividad(java.util.Date fechaUltimaActividad) {
		this.fechaUltimaActividad = fechaUltimaActividad;
	}

	public java.lang.String getNombrePreclasificador() {
		return this.nombrePreclasificador;
	}

	public void setNombrePreclasificador(java.lang.String nombrePreclasificador) {
		this.nombrePreclasificador = nombrePreclasificador;
	}

	public java.lang.String getIdFiscalAsignado() {
		return this.idFiscalAsignado;
	}

	public void setIdFiscalAsignado(java.lang.String idFiscalAsignado) {
		this.idFiscalAsignado = idFiscalAsignado;
	}

	public java.lang.String getIdFiscalia() {
		return this.idFiscalia;
	}

	public void setIdFiscalia(java.lang.String idFiscalia) {
		this.idFiscalia = idFiscalia;
	}

	public java.util.List<cl.mp.rgp.common.model.Solicitud> getDiligenciasASolicitar() {
		return this.diligenciasASolicitar;
	}

	public void setDiligenciasASolicitar(
			java.util.List<cl.mp.rgp.common.model.Solicitud> diligenciasASolicitar) {
		this.diligenciasASolicitar = diligenciasASolicitar;
	}

	public java.util.List<cl.mp.rgp.common.model.Relacion> getRelaciones() {
		return this.relaciones;
	}

	public void setRelaciones(
			java.util.List<cl.mp.rgp.common.model.Relacion> relaciones) {
		this.relaciones = relaciones;
	}

	public java.util.Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(java.util.Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public java.lang.String getIdOrigenDenuncia() {
		return this.idOrigenDenuncia;
	}

	public void setIdOrigenDenuncia(java.lang.String idOrigenDenuncia) {
		this.idOrigenDenuncia = idOrigenDenuncia;
	}

	public java.lang.String getTipoTermino() {
		return this.tipoTermino;
	}

	public void setTipoTermino(java.lang.String tipoTermino) {
		this.tipoTermino = tipoTermino;
	}

	public java.lang.String getAccionTermino() {
		return this.accionTermino;
	}

	public void setAccionTermino(java.lang.String accionTermino) {
		this.accionTermino = accionTermino;
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

	public Causa(
			java.lang.String idCausa,
			java.util.List<cl.mp.rgp.common.model.Documentacion> docAdjunta,
			java.lang.String idDenuncia,
			java.lang.String descripcion,
			java.lang.String ruc,
			java.lang.Boolean existePropuestaAsignacion,
			java.lang.Boolean fiscalJefePreclasifico,
			java.util.List<cl.mp.rgp.flagrancia.model.Delito> delitos,
			java.lang.String estadoPropuestaAsignacion,
			java.util.List<cl.mp.rgp.common.model.Documentacion> antecedentesEspecificos,
			java.util.List<cl.mp.rgp.common.model.Especie> especies,
			java.lang.String idCatalogoDocDigital,
			java.lang.Boolean comunaRegistrada,
			java.lang.String decisionAsignacion,
			java.lang.String complejidad,
			java.lang.String idProcedimiento,
			java.lang.String idInstitucionOrigen,
			java.lang.String alerta,
			java.lang.Boolean existenLesionados,
			java.lang.Boolean existenFallecidos,
			java.lang.String caratula,
			java.lang.String numeroDenuncia,
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> imputados,
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> victimas,
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> denunciantes,
			java.lang.String actividad,
			java.lang.String causaJudicializada,
			java.util.Date fechaUltimaActividad,
			cl.mp.rgp.common.model.Preclasificacion preclasificacion,
			java.lang.String nombrePreclasificador,
			java.lang.String idFiscalAsignado,
			java.lang.String idFiscalia,
			java.util.List<cl.mp.rgp.common.model.Solicitud> diligenciasASolicitar,
			java.util.List<cl.mp.rgp.common.model.Relacion> relaciones,
			java.util.Date fechaCreacion, java.lang.String idOrigenDenuncia,
			java.lang.String tipoTermino, java.lang.String accionTermino,
			java.lang.String subTipoTermino, java.lang.String motivoTermino) {
		this.idCausa = idCausa;
		this.docAdjunta = docAdjunta;
		this.idDenuncia = idDenuncia;
		this.descripcion = descripcion;
		this.ruc = ruc;
		this.existePropuestaAsignacion = existePropuestaAsignacion;
		this.fiscalJefePreclasifico = fiscalJefePreclasifico;
		this.delitos = delitos;
		this.estadoPropuestaAsignacion = estadoPropuestaAsignacion;
		this.antecedentesEspecificos = antecedentesEspecificos;
		this.especies = especies;
		this.idCatalogoDocDigital = idCatalogoDocDigital;
		this.comunaRegistrada = comunaRegistrada;
		this.decisionAsignacion = decisionAsignacion;
		this.complejidad = complejidad;
		this.idProcedimiento = idProcedimiento;
		this.idInstitucionOrigen = idInstitucionOrigen;
		this.alerta = alerta;
		this.existenLesionados = existenLesionados;
		this.existenFallecidos = existenFallecidos;
		this.caratula = caratula;
		this.numeroDenuncia = numeroDenuncia;
		this.imputados = imputados;
		this.victimas = victimas;
		this.denunciantes = denunciantes;
		this.actividad = actividad;
		this.causaJudicializada = causaJudicializada;
		this.fechaUltimaActividad = fechaUltimaActividad;
		this.preclasificacion = preclasificacion;
		this.nombrePreclasificador = nombrePreclasificador;
		this.idFiscalAsignado = idFiscalAsignado;
		this.idFiscalia = idFiscalia;
		this.diligenciasASolicitar = diligenciasASolicitar;
		this.relaciones = relaciones;
		this.fechaCreacion = fechaCreacion;
		this.idOrigenDenuncia = idOrigenDenuncia;
		this.tipoTermino = tipoTermino;
		this.accionTermino = accionTermino;
		this.subTipoTermino = subTipoTermino;
		this.motivoTermino = motivoTermino;
	}

}