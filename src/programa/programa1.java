package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class programa1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Insira a altura e a largura do retangulo: ");
		retangulo.height = sc.nextDouble();
		retangulo.width = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("AREA: " + retangulo.area() );
		System.out.println("PERIMETRO : " + retangulo.perimetro() );
		System.out.println("DIAGONAL : " + retangulo.diagonal() );
		
		
		
		sc.close();

	}

}
