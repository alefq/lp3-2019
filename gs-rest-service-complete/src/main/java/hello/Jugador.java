package hello;

public class Jugador extends Empleado {

	Integer habilidad;
	public Integer getHabilidad() {
		return habilidad;
	}
	public void setHabilidad(Integer habilidad) {
		this.habilidad = habilidad;
	}
	public Character getPiernaHabil() {
		return piernaHabil;
	}
	public void setPiernaHabil(Character piernaHabil) {
		this.piernaHabil = piernaHabil;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	Character piernaHabil;
	String posicion;
	
	
}
