package mx.com.twg;

import java.util.*;
public class MainColeccionesGenericasJava {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("N");
		list.add("M");
		list.add("O");
		imprimir(list);
		
		Set<String> set = new HashSet<>();
		set.add("100");
		set.add("200");
		set.add("200");
		set.add("300");
		imprimir(set);
		
		Map<String,String> map = new HashMap<>();
		map.put("1", "N");
		map.put("2", "H");
		map.put("3", "C");

		imprimir(map.keySet());
		imprimir(map.values());
	}
	
	public static void imprimir(Collection<String> o){
		 for(String e:o) {
			 System.out.print(e+" ");
		 }
		 System.out.println();
	}

}
