import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o seu numero de identificacao:");
		int id = sc.nextInt();
		System.out.println("Entre com a quantidade de horas trabalhadas:");
		int qtdH = sc.nextInt();
		System.out.println("Entre com o valor recebido por hora trabalhada [R$/h]:");
		double valH = sc.nextDouble();
		
		double sal = qtdH * valH;
		
		System.out.println("");
		System.out.println("Number = " + id);
		System.out.printf("Salary = R$ %.2f\n", sal);
		
		sc.close();
	}
		
}
