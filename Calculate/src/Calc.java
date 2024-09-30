import java.util.ArrayList;
import java.util.Scanner;

public class Calc {
	
	public ArrayList<Integer> memory = new ArrayList();

	
	//Funções aritimeticas basicas da calculadora
	
	
	// Soma
	public int som(int num1, int num2) {
		int result = num1 +num2;
		memory.add(result);
		
		return result;
	} //Subtração
    public int subt(int num1,int num2) {
	int result = num1 - num2;
	memory.add(result);
	
	return result;
    }
    //Multiplicação
    public int mult(int num1,int num2) {
	int result = num1 * num2;
	memory.add(result);
	
	return result;
    }
    //Divisão
    public int div(int num1 , int num2) {
	int result = num1 / num2;
	memory.add(result);
	
	return result;
 }
}

