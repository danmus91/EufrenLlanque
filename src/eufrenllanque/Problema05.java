package eufrenllanque;

public class Problema05 {
	
	static int cuadrado,cubo;
	static double raizCuadrada, raizCubica;
	static String resultado;
	
	public static String retorno (int n)
	{
		cuadrado = n*n;
		cubo = n*n*n;
		raizCuadrada = Math.sqrt(n);
		raizCubica = Math.pow(n, (double) 1/3);
		resultado =  n + "-" + cuadrado + "-" + cubo  + "-" + raizCuadrada + "-" + raizCubica;
		return resultado;
	}
	
	

}
