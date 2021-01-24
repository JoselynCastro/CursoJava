package JavaOpp;

public class Project {
	
	private String nombre;
	private String descripcion;
	public Project() {
		super();
	}
	public Project(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Project(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public String elevatorPitch() {
		return(this.nombre+":"+this.descripcion);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
