import java.util.Scanner;


public class Notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 EXERCICIO 1
		int nota1, nota2, nota3, soma, media;
		System.out.println("Digite as notas: ");
		nota1 = sc.nextInt();
		nota2 = sc.nextInt();
		nota3 = sc.nextInt();
		
		soma = nota1 + nota2 + nota3;
		media = soma/3;
		
		System.out.println("A média aritmética das notas é: " +media);
		
		sc.close();
		*/
		/*
		 * EXERCICIO 2 
		int nascimento, atual, idade, idade2050;
		
		System.out.println("Digite o ano de nascimento: ");
		nascimento = sc.nextInt();
		
		System.out.println("Digite o ano atual: ");
		atual = sc.nextInt();
		
		idade = atual - nascimento;
		System.out.println("A sua idade atual é " +idade);
		
		idade2050 = 2050 - nascimento;
		System.out.println("Sua idade em 2050 vai ser: " +idade2050);
		
		*/
		/*
		 * EXERCICIO 03 
		 
		double real, cotDolar, dolar;
		
		System.out.println("Quantia em dolares: ");
		dolar = sc.nextDouble();
		cotDolar = (real * 5.16f);
		real = (dolar / 5.16f);
		
		System.out.println("O valor em reais é: " +real);
		
		/*
		 * EXERCICIO 4 
		 
		double salario, aumento, novoSalario;
		System.out.println("Digite o salario: ");
		salario = sc.nextInt();
		aumento = salario * 1.25;
		novoSalario = salario + aumento;
		
		System.out.println("O novo salário é: " +novoSalario);
		
		*/
		/*
		 * EXERCICIO 05
		 
		float diagonalMaior, diagonalMenor, area;
		System.out.println("Digite o valor: ");
		diagonalMaior = sc.nextFloat();
		
		System.out.println("Digite o valor: ");
		diagonalMenor = sc.nextFloat();
		
		area = (diagonalMaior * diagonalMenor)/2;
		System.out.println("A area é: " +area);
		
		*/
		/*
		 * EXERCICIO 06
		float celcius, fahrenheit;
		System.out.println("Temperatura em celcius: ");
		celcius = sc.nextFloat();
		fahrenheit = (celcius * 1.8f)+32;
		System.out.printf("A temperatura em fahrenheit é %.2f", fahrenheit);
	
		 */
		/*
		 * EXERCICIO 07	
		 
		double salarioMinimo, salarioFuncionario, quantiaSalario;
		System.out.println("Insira o salario minimo: ");
		salarioMinimo = sc.nextDouble();
		System.out.println("Funcionario: ");
		salarioFuncionario = sc.nextDouble();
		quantiaSalario = salarioFuncionario / salarioMinimo;
		
		System.out.println("Recebe:" +quantiaSalario);
		
		*/
		/*
		 *EXERCICIO 08
		 
		
		float peso, pesoEng, pesoEma;
		System.out.println("Insira o peso: ");
		peso = sc.nextFloat();
		pesoEng = peso * 1.15f;
		pesoEma = peso * 0.8f;
		
		System.out.println("Se emagreceu, o peso é: " +pesoEma);
		System.out.println("Se engordou, o peso é: " +pesoEng);
		
		*/
		/*
		 * EXERCICIO 09
		 
		
		float cateto1, cateto2, hipotenusa;
		
		System.out.println("Insira o cateto 1: ");
		cateto1 = sc.nextFloat();
		System.out.println("Insira o cateto 2: ");
		cateto2 = sc.nextFloat();
		
		hipotenusa = (float) (Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));
		
		System.out.println("A hipotenusa é: "+hipotenusa);
		
		*/
		
		float raio, comprimento, area, volume;
		System.out.println("Insira o raio: ");
		raio = sc.nextFloat();
		
		comprimento = (float) (2 * Math.PI * raio);
		System.out.printf("O comprimento é %.2f",comprimento);
		System.out.println("\n");
		area = (float) (Math.PI * Math.pow(raio, 2));
		System.out.printf("A area é %.2f",area);
		System.out.println("\n");
		volume = (float) ((3f/4f) * Math.PI * Math.pow(raio, 3));
		System.out.printf("A area é %.2f",volume);
		
		
		
		
	}

}
