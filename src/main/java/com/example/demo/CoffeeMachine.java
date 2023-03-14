package com.example.demo;

import java.util.Scanner;

import model.Coffee;
import model.Mooca;

public class CoffeeMachine {
	public void prepare(int selectedBeverage) {
		// 1. Receber solicitação da bebida.
		Coffee drink = receiveSelection(selectedBeverage);
		// 2. Exibir valor da bebida.
		showPrice(drink);
		// 3. Aguardar pagamento.
		awaitPayment(drink);		
		// 4. Preparar café.
		make();
		// 5. Finalizar pedido.
		finishHim();
	}

	private Coffee receiveSelection(int selectedBeverage) {
		Coffee drink = new Coffee();
		if(selectedBeverage == 1) {
			// Café
			drink = new Coffee();
		} else if (selectedBeverage == 2) {
			// Capuccino 
		} else if (selectedBeverage == 3) {
			// Mooca
			drink = new Mooca();
		} else if (selectedBeverage == 4){
			// Café gelado
		}
		
		return drink;
	}
	
	private void showPrice(Coffee drink ) {
		System.out.println(drink.getPrice());
	}
	
	private void awaitPayment(Coffee drink) {
		System.out.println("Insira um valor.");
		
		Scanner console = new Scanner(System.in);
		try {
			float payment = console.nextFloat();
		} catch (Exception e) {
			System.out.println("Insira um valor maior ou igual a " + drink.getPrice());
		}
		
		if (payment < drink.getPrice()) {
			System.out.println("Insira um valor maior ou igual a " + drink.getPrice());
		} else {
			System.out.println("Pagamento inválido!");
		}
	}
	
	private void make() {
		
	}
	
	private void finishHim() {
		
	}
}
