import java.util.Scanner;
public class codigo {

	public static void main(String[] args) {
		System.out.println("----- Programa Impar ou Par -----");
		
		
		//LA�O DE REPETI��O 
		
		while(true) {
			

			System.out.println("Insira um n�mero:");
			
			Scanner sc = new Scanner(System.in);
			int numero = sc.nextInt();
			double resto = numero % 2;
			
			if (resto == 0) {
				System.out.println(String.format("O numero %d � par", numero));
			}
			
			else {
				System.out.println(String.format("O numero %d � impar", numero));
			}
			
			
		}
		
		
	}

}
