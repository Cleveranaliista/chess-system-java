package application;

import java.util.Scanner;

import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digie a Linha");
		int row = sc.nextInt();
		System.out.println("Digie a Coluna");
		int column = sc.nextInt();
		
		Position pos = new Position(row, column);
		System.out.println(pos);

		
		sc.close();
	}

}
