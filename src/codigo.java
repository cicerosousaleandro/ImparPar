import java.util.Scanner;
public class codigo {

	public static void main(String[] args) {
		System.out.println("----- Programa Impar ou Par -----");
		
		
		//LAÇO DE REPETIÇÃO 
		
		while(true) {
			

			System.out.println("Insira um número:");
			
			Scanner sc = new Scanner(System.in);
			int numero = sc.nextInt();
			double resto = numero % 2;
			
			if (resto == 0) {
				System.out.println(String.format("O numero %d é par", numero));
			}
			
			else {
				System.out.println(String.format("O numero %d é impar", numero));
			}
			
			
		}
		
		
	}

}
