import java.util.Scanner;

public class calculator {
	public static Scanner input = new Scanner(System.in);
	public static Calc calc = new Calc();	
	
	
	public static void main(String[] args) {
	
	System.out.println("-Escolha uma opcao");
	System.out.println("1. Soma");
	System.out.println("2. Subtracao");
	System.out.println("3.Multiplicacao");
	System.out.println("4.Divisão");
	System.out.println("5.Ver historico");
	System.out.println("0.Encerrar");
	
	int opcao = input.nextInt();
	
 
    switch(opcao) {
    	
    	case 1:
    		int [] values = getValues();
    		int soma = calc.som(values[0], values[1]);
    		System.out.println(soma);
    		main(args);
    		break;
    		
    	case 2: 
    		int [] values1 = getValues();
    		int subtracao = calc.subt(values1[0], values1[1]);
    		System.out.println(subtracao);
    		main(args);
    		break;
    	case 3:
    		int [] values2 = getValues();
    		int multiplicacao = calc.mult(values2[0], values2[1]);
    		System.out.println(multiplicacao);
    		main(args);
    		break;
    	case 4:
    		int [] values3 = getValues();
    		int divisao = calc.div(values3[0], values3[1]);
    		System.out.println(divisao);
    		main(args);
    		break;
    	case 5 :
    		System.out.println("Seu historico é: ");
    		showHistory();
    		main(args);
    		break;
    		default: input.close();
    		return;
    			
    			
    }
    }
	
	 //Esta função realiza  as operações aritiméticas atraves dos valores inseridos.
	
	public static int [] getValues() {
		System.out.println("Qual o primeiro numero: ");
    	int num1 = input.nextInt();
    	System.out.println("Qual o segundo numero: ");
    	int num2 = input.nextInt();
    	int [] values = {num1, num2};
    	return values;
		
	} //função que recebe os resultados da ultima operação realizada e guarda em memoria para exibição
	public static void showHistory() {
		int index = 0;
		for (int item:calc.memory) {
		index ++;
		System.out.println(index+": " + item +"\n");
		}
	}
}


	

