package animales;

import java.util.ArrayList;

public class ListadoAnimales {
	ArrayList<Domesticos>listadoAnimales = new ArrayList<Domesticos>();
	
	
	public void agregarAnimal(Domesticos domestico) {
		listadoAnimales.add(domestico);
	}
	
	public void mostrarLista() {
		for(Domesticos domestico: listadoAnimales) {
			Domesticos.mostrarDatos();
			Domesticos.esDomestico();
		}
	}
}