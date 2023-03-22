package animales;

public class Main extends ListadoAnimales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 ListadoAnimales lista1 = new ListadoAnimales();
	 
	 //CONSTRUCTOR VACIO 3 VIVIPAROS
	 Viviparos vaca = new Viviparos();
	 Viviparos tigre = new Viviparos();
	 Viviparos oso = new Viviparos();
	 
	 //CONSTRUCTOR LLENO 3 VIVIPAROS
	 Viviparos leon = new Viviparos(5, "carnivoro", "felino", true, "piel y pelos");
	 Viviparos mono = new Viviparos(5, "carnivoro", "primate", true, "piel y pelos");
	 Viviparos caballo = new Viviparos(5, "carnivoro", "", true, "piel y pelos");
	 
	 
	 //CONSTRUCTOR VACIO 3 OVIPAROS
	 Oviparos tortuga = new Oviparos();
	 Oviparos gallina = new Oviparos();
	 Oviparos cangrejo = new Oviparos();
	 
	//CONSTRUCTOR LLENO 3 VIVIPAROS
	 Oviparos aguila = new Oviparos(5, "omnivoro","ave", false, "vuela");
	 Oviparos pez = new Oviparos(4, "omnivoro", "cetaceo", false, "nada");
	 Oviparos serpiente = new Oviparos(2, "omnivoro", "reptil", false, "arrastra");
	
	 
	 
	 
	 
}
