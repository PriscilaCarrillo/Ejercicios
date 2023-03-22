package animales;

public class Animal implements Domesticos{

	private int numExtremidades;
	private String tipoAlimentacion;
	private String especie;
	
	public Animal() {
		
	}
	
	
	public Animal(int numExtremidades, String tipoAlimentacion, String especie) {
		this.numExtremidades = numExtremidades;
		this.tipoAlimentacion = tipoAlimentacion;
		this.especie = especie;
	}
	
	//SETTERS Y GETTERS
	
	public int getNumExtremidades() {
		return numExtremidades;
	}
	
	public void setNumExtremidades(int numExtremidades) {
		this.numExtremidades = numExtremidades;
	}
	
	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}
	
	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public void mostrarDatos() {
		System.out.println("Numero de Extremidades: " + numExtremidades + "\nEspecie: " + especie + "\nTipo de Alimentacion: " + tipoAlimentacion);
	}
	
	public void esDomestico() {
		
	}
}
