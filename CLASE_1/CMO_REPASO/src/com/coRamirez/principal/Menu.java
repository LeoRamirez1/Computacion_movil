package com.coRamirez.principal;

import java.util.Scanner;

import com.coRamirez.principal.UNO.OperacionInterace;
import com.coRamirez.principal.implementaciones.Sumar;


public class Menu {
	Scanner sc = new Scanner(System.in);
	public void mostraMenu () {
		System.out.println("Digite el numero uno ");
		double numUno = sc.nextDouble();
		System.out.println("Digite el numero dos ");
		double numDos = sc.nextDouble();
		System.out.println("Que operacion desea realizar?");
		int seleccion = sc.nextInt();
		Sumar sm= new Sumar();
		switch (seleccion) {
		case 1: 
		System.out.println(sm.sumar(numUno, numDos));
		break;
		case 2: 
			System.out.println(sm.restar(numUno, numDos));
			break;
		case 3: 
			System.out.println(sm.mulriplicar(numUno, numDos));
			break;
		case 4: 
			System.out.println(sm.dividir(numUno, numDos));
			break;

		default:
			break;
		}
		
		
	}

}
