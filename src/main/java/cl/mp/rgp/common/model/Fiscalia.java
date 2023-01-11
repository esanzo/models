package cl.mp.rgp.common.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Fiscalia implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "identificador de la Fiscalía")
	private java.lang.String id;
	@org.kie.api.definition.type.Label(value = "Nombre de la fiscalía")
	private java.lang.String nombre;
	private java.lang.String tipo;
	private java.lang.String subTipo;

	public Fiscalia() {
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getNombre() {
		return this.nombre;
	}

	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	public java.lang.String getTipo() {
		return this.tipo;
	}

	public void setTipo(java.lang.String tipo) {
		this.tipo = tipo;
	}

	public java.lang.String getSubTipo() {
		return this.subTipo;
	}

	public void setSubTipo(java.lang.String subTipo) {
		this.subTipo = subTipo;
	}

	public Fiscalia(java.lang.String id, java.lang.String nombre,
			java.lang.String tipo, java.lang.String subTipo) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.subTipo = subTipo;
	}

}