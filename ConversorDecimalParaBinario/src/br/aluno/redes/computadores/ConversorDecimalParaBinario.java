package br.aluno.redes.computadores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConversorDecimalParaBinario {	
	
	private static List<Integer> binarios = new ArrayList<Integer>();
	private static List<Integer> newBinarios = new ArrayList<Integer>();
	private static int i = 0;

	public static void main(String[] args) {

		int numDecimal, numBinario, num;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com um numero inteiro para Converter em Binario");
		numDecimal = scanner.nextInt();
		num = numDecimal;
		numBinario = numDecimal;

		for (i = 0; numDecimal > 0; i++) {
			numBinario = numDecimal % 2;
			numDecimal = numDecimal / 2;			
			binarios.add(numBinario);
		}
		scanner.close();
		i = 1;
		
		for(int bin = binarios.size()-i; bin >=0; bin--){
			int newValueBinarios = binarios.get(bin);
			newBinarios.add(newValueBinarios);
		}
		
		System.out.println(num + " --> " + newBinarios.toString());
	}	
}