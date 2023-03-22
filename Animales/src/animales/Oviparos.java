package animales;

public class Oviparos extends Animal{
	
	private boolean esVertebrado;
	private String medioTransporte;
	

	public Oviparos(int numExtremidades, String tipoAlimentacion, String especie, boolean esVertebrado, String medioTransporte) {
		super(numExtremidades, tipoAlimentacion, especie);
		this.esVertebrado = esVertebrado;
		this.medioTransporte = medioTransporte;
	}
	
	//SETTERS AND GETTERS
	
	public boolean getEsVertebrado() {
		return esVertebrado;
	}
	
	public void setEsVertebrado(boolean esVertebrado) {
		this.esVertebrado = esVertebrado;
	}
	
	public String getMedioTransporte() {
		return medioTransporte;
	}
	
	public void setMedioTransporte(String medioTransporte) {
		this.medioTransporte = medioTransporte;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Es vertebrado: " + esVertebrado + "\nMedio de transporte: " + medioTransporte);
		
	}
	
	@Override
	public void esDomestico() {
		System.out.println("Todos son domesticables, excepto los de granja");
	}

 
	
	
	
	
}


