import java.util.Scanner;

public class ConversaoFahrenheit {

	public static void main(String[] args) {
	// Entrada 
		int num1, num2, num3, num4, res;
		num2 = 32;
		num3 = 5;
		num4 = 9;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Digite os graus em Farenheit: ");
		num1 =  sc.nextInt();
		res = ((num1 - num2) * num3)/num4;
		System.out.println("O resultado em graus Celcius é: " +  res);
		
		
		
		

	}

}
