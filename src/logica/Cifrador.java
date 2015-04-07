package logica;

public class Cifrador {

	public static int expRapida(int p, int alfa, int x){
		//p = modulo, alfa = base, x = exponente
		// alfa^x mod(p)
		int exp = 1;
		int der = alfa;
		
		while(x > 0){
			if(x % 2 != 0){ //Si no es par
				exp = (exp * der) % p;
				x = x - 1;
			}
			
			else{
				der = (der * der) % p;
				x = x / 2;
			}
		}
		return exp;
	}
	
	public static String cifrar(String primo, String alfa, String secretoa, String secretob){
		
		String cadena = "";
		int xa = Integer.parseInt(secretoa);
		int xb = Integer.parseInt(secretob);
		int p = Integer.parseInt(primo);
		int al = Integer.parseInt(alfa);
		
		int ya = expRapida(p,al,xa);
		int yb = expRapida(p,al,xb);

		//para calcular k;
		int k  = expRapida(p, yb, xa);

		cadena = "Ya = " + ya + "\nYb = " + yb  + "\nk = " + k ;

		return cadena;
	}
	
	
}
