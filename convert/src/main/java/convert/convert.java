package convert;

public class convert {
	
	

	public static void main(String[] args) {
		
	 int resultado = soma("5","2");
	 System.out.println(resultado);
		
		
		
	}
	
	public static int soma (String value1, String value2) {
		
		try{ 
		int number1 = Integer.parseInt(value1);
		int number2 = Integer.parseInt(value2);
		return number1+number2;
		}
		
		catch(Exception erro) {
			erro.printStackTrace();
		}
		return 0;
	
	}

}