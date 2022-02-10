package entities;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	public double porcentagem_Salario;


	public double aumento() {
		double aumento = salarioBruto / 100 * porcentagem_Salario;
		return aumento;
	}
	public double salario_Atual() {
		double salario_Atual = aumento() + salarioBruto;
		return salario_Atual;
		
	}
	
}
