package br.com.devdojo.javacore.io.teste;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("arquivo.txt");
		try {
			if (file.exists()) {
				boolean delete = file.delete();
				System.out.println("Arquivo deletado? " + delete);
			}
			
			boolean newFile = file.createNewFile();
			System.out.println("Arquivo criado? " + newFile);
			System.out.println("Permiss�o de leitura? " + file.canRead());
			System.out.println("Caminho do arquivo: " + file.getPath());
			System.out.println("Caminho do absoluto do arquivo: " + file.getAbsolutePath());
			System.out.println("� um diret�rio: " + file.isDirectory());
			System.out.println("� oculto: " + file.isFile());
			System.out.println("Data �ltima modifica��o: " + new Date(file.lastModified()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
