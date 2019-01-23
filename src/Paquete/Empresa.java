package Paquete;

public class Empresa {
	private String cif,nombre,direccion;
	private int empleados,id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEmpleados() {
		return empleados;
	}
	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}
	
	@Override
	public String toString() {
		return "Empresa [cif=" + cif + ", nombre=" + nombre + ", direccion=" + direccion + ", empleados=" + empleados
				+ ", id=" + id + "]";
	}
	
	
}
