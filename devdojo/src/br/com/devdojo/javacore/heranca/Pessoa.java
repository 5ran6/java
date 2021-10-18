package br.com.devdojo.javacore.heranca;

public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;

	static {
		System.out.println("Bloco de inicializa��o est�tico Pessoa");
	}

	{
		System.out.println("Bloco de inicializa��o Pessoa 1 ");
	}

	{
		System.out.println("Bloco de inicializa��o Pessoa 2");
	}

//	public Pessoa() {}

	public Pessoa(String nome) {
		this.nome = nome;
		System.out.println("Dentro do construtor Pessoa");
	}

	public Pessoa(String nome, String cpf) {
		this(nome);
		this.cpf = cpf;
	}

	public void print() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Endere�o: " + this.endereco.getRua() + " - Bairro: " + this.endereco.getBairro());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
