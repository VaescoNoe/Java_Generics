package mx.com.twg;

import mx.com.twg.generics.ClaseGenerica;

public class MainClasesGenericas{

	public static void main(String[] args) {
		
		//Instancia de la clase para Integer
		ClaseGenerica<Integer> obj = new ClaseGenerica<Integer>(15);
		obj.obtenerTipo();
		
		// Instancia de clase para String
		ClaseGenerica<String> obj_0 = new ClaseGenerica<>("Noah");
		obj_0.obtenerTipo();
		
		//Las clases genericas no aplica para tipos de datos primitivos
		//Esto marcaria un error de compilación
		//  ClaseGenerica<int> obj = new ClaseGenerica<int>(15); 
		
	}

}
