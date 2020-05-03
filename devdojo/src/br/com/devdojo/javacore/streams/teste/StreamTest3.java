package br.com.devdojo.javacore.streams.teste;

import java.util.Comparator;
import java.util.List;

import br.com.devdojo.javacore.streams.Pessoa;

public class StreamTest3 {

	public static void main(String[] args) {
		List<Pessoa> pessoas = Pessoa.bancoDePessoas();
		System.out.println(pessoas.stream().anyMatch(p -> p.getSalario() > 40));
		System.out.println(pessoas.stream().allMatch(p -> p.getIdade() > 18));
		System.out.println(pessoas.stream().noneMatch(p -> p.getIdade() > 18));

		pessoas.stream()
			.filter(p -> p.getIdade() < 25)
			.findAny()
			.ifPresent(p -> System.out.println(p.getNome()));
		
		pessoas.stream()
			.filter(p -> p.getIdade() > 30)
			.sorted(Comparator.comparing(Pessoa::getIdade).reversed())
			.findFirst()
			.ifPresent(p -> System.out.println(p.getNome()));
	}

}
