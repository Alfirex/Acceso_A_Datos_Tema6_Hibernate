package Paquete;

import java.util.Date;

public class Pedido {
	private int id;
	private Date fecha;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Pedido [id= " + id + ", fecha= " + fecha + "]";
	}
	
}
