package alterador;

public class alteradorDeString {

	
	public static void main(String[] args) {
	
		conversor("bom dia");
		
		String texto = conversor("  BAaM DIAAA! ");
		
		System.out.println(texto);
	}
	
	public static String conversor (String palavra1) {
		
		palavra1 = palavra1.trim();
		palavra1 = palavra1.replaceAll("A", "B").replace("a", "b");
		
		if(palavra1.length()>3) {
			return palavra1.substring(0,3);
		}
		
		
		
		return  palavra1;
	}

}
