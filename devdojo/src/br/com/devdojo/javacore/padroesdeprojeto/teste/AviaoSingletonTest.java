package br.com.devdojo.javacore.padroesdeprojeto.teste;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import br.com.devdojo.javacore.padroesdeprojeto.classe.AviaoSingleton;

public class AviaoSingletonTest {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		agendarAssento("1A");
		agendarAssento("1A");

		AviaoSingleton aviaoSingleton1 = AviaoSingleton.getInstance();
		AviaoSingleton aviaoSingleton2 = null;
		AviaoSingleton aviaoSingleton3 = null;

		// O codigo abaixo quebra o Singleton, permitindo criar 2 instancias do objeto
		// AviaoSingleton
		Constructor<?>[] constructors = AviaoSingleton.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			constructor.setAccessible(true);
			aviaoSingleton2 = (AviaoSingleton) constructor.newInstance();
			aviaoSingleton3 = (AviaoSingleton) constructor.newInstance();
			break;
		}

		System.out.println("Hash code Singleton1: " + aviaoSingleton1.hashCode());
		System.out.println("Hash code Singleton2: " + aviaoSingleton2.hashCode());
		System.out.println("Hash code Singleton2: " + aviaoSingleton3.hashCode());
	}

	private static void agendarAssento(String assento) {
		AviaoSingleton aviaoSingleton = AviaoSingleton.getInstance();
		System.out.println(aviaoSingleton.bookAssento(assento));
	}

}
