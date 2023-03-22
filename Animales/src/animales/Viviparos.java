package animales;

public class Viviparos extends Animal {
	
	private boolean esMamifero;
	private String pelaje;
	
	public Viviparos() {
		
	}
	

	public Viviparos (int numExtremidades, String tipoAlimentacion, String especie, boolean esMamifero, String pelaje) {
		super(numExtremidades, tipoAlimentacion, especie);
		this.esMamifero = esMamifero;
		this.pelaje = pelaje;
	}
	
	//SETTERS AND GETTERS
	
	public boolean getEsMamifero() {
		return esMamifero;
	}
	
	public void setEsMamifero(boolean esMamifero) {
		this.esMamifero = esMamifero;
	}
	
	public String getPelaje() {
		return pelaje;
	}
	
	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Es mamifero: " + esMamifero + "\nPelaje: " + pelaje);
	}
	
	@Override
	public void esDomestico() {
		System.out.println("La mayoria son domesticables");
		
	}
	
	
}