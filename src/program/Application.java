package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Funcionario x;
		x = new Funcionario();
				
		System.out.println("Preencha com o nome do funcion�rio: ");
		x.nome = sc.next();
		System.out.println("O sal�rio bruto: ");
		x.salarioBruto = sc.nextDouble();
		System.out.println("E o imposto sobre o sal�rio: ");
		x.imposto = sc.nextDouble();
		
		System.out.println("Digite a porcentagem de aumento sal�rio");
		x.porcentagem_Salario = sc.nextDouble();
		System.out.printf("Foi aumentado o salario em: R$ %s", x.aumento());
		System.out.println();
		System.out.printf("Salario atualizado: R$ %s", x.salario_Atual());
		
		sc.close();	

	}

}
