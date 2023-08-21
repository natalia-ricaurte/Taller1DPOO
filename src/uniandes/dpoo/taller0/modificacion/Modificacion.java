package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {

	public static void main(String[] args)
	{
		
		System.out.println("Hola, mundo!"+"\n");
		
		CalculadoraEstadisticas calc = null;
		try {
			calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Map<String, Integer> paises = calc.paisConMasMedallistas();
		
		for (String nombre : paises.keySet())
		{
			System.out.println("\n"+ "El país con más medallistas es "+ nombre + " ha tenido " + paises.get(nombre) + " medallistas");
		}
		
	}	
	
}
