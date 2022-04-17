package application;

import java.util.Scanner;

import entities.Champion; 

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Champion c1;
		Champion c2;
		
		int shifts = 0;
		
		//FIRST CHAMPION
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		while(life < 0) {
			System.out.print("Valor inválido! não pode valor negativo!");
			life = sc.nextInt();
		}
		
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		while(attack < 0) {
			System.out.print("Valor inválido! não pode valor negativo!");
			attack = sc.nextInt();
		}
		
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		while(armor < 0) {
			System.out.print("Valor inválido! não pode valor negativo!");
			armor = sc.nextInt();
		}
		
		c1 = new Champion(name, life, attack, armor);
		
		//SECOND CHAMPION
		System.out.println("\nDigite os dados do segundo campeão:");
		System.out.print("Nome: ");
		name = sc.nextLine();
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		while(life < 0) {
			System.out.print("Valor inválido! não pode valor negativo!");
			life = sc.nextInt();
		}
		
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		while(attack < 0) {
			System.out.print("Valor inválido! não pode valor negativo!");
			attack = sc.nextInt();
		}
		
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		while(armor < 0) {
			System.out.print("Valor inválido! não pode valor negativo!");
			armor = sc.nextInt();
		}
		
		c2 = new Champion(name, life, attack, armor);
		
		System.out.print("\nQuantos turnos você deseja executar? ");
		shifts = sc.nextInt();
		while(shifts <= 0) {
			System.out.print("Valor inválido! não pode valor negativo, nem zero!");
			shifts = sc.nextInt();
		}
		
		for (int i = 0; i < shifts; i++) {
			System.out.printf("%nResultado do turno %d:%n", i+1);
			c1.takeDamege(c2);
			c2.takeDamege(c1);
			System.out.println(c1.status());
			System.out.println(c2.status());
			if(c1.getLife() == 0 || c2.getLife() == 0) {
				break;
			}
		}
		
		System.out.println("\nFIM DO COMBATE");
		sc.close();
	}

}