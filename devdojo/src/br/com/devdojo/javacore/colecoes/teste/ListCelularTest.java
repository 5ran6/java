package br.com.devdojo.javacore.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.devdojo.javacore.colecoes.classes.Celular;

public class ListCelularTest {

	public static void main(String[] args) {
		Celular celular1 = new Celular("Galaxy S7", "123456");
		Celular celular2 = new Celular("IPhone 7", "1234568");
		Celular celular3 = new Celular("Sony Experia", "1234568");
		
		List<Celular> celularList = new ArrayList<Celular>();
		celularList.add(celular2);
		celularList.add(celular1);
		celularList.add(celular3);
		
		Collections.sort(celularList, new Comparator<Celular>() {
			@Override
			public int compare(Celular c1, Celular c2) {
				return c2.getNome().compareTo(c1.getNome());
			}
		});
		
		for (Celular celular : celularList) {
			System.out.println(celular);
		}
		
		Celular celular4 = new Celular("Sony Experia", "1234568");
		System.out.println(celular3 == celular4); // false
		System.out.println(celular3.equals(celular4)); // true
		System.out.println(celularList.contains(celular4));
	}
}

