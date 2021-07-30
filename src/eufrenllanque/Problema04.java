/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eufrenllanque;

/**
 *
 * @author Sergio
 */
public class Problema04 {
	
	private double radianes;
	private double minutos , segundos;
	private static double gradosStatic,minutosStatic,segundosStatic,radianesStatic,fraccion;
	private static String gradMinSeg;
	
	public void convertirRadianesVoid (int grad, int min, int seg)
	{
		/* 180 grados = PI * RAD*/
		final double PI = 3.1416d;		
		minutos = min/60;
		segundos = seg/60*60;
		radianes = (180 + grad + minutos + segundos)/PI;		
		System.out.println("radianes");
	}
	
	public double convertirRadianesRetorno (int grad, int min, int seg)
	{
		final double PI = 3.1416d;		
		minutos = min/60;
		segundos = seg/60*60;
		radianes = (180 + grad + minutos + segundos)/PI;
		return radianes;
	}
	
	public static double convertirRadianesRetornoStatic (int grad, int min, int seg)
	{
		final double PI = 3.1416d;
		gradosStatic = grad;
		minutosStatic = min/60;
		segundosStatic = seg/60*60;
		fraccion = PI/180;
		radianesStatic = fraccion*(gradosStatic+minutosStatic+segundosStatic);
		return (radianesStatic);
	}
	
	public static String convertirRadianeAGradosMinutosSegundos (double radianes)
	{
		final double PI = 3.1416d;
		fraccion = 180/PI;
		radianes = radianes*fraccion;
		gradMinSeg = ""+ Math.floor(radianes);
		return gradMinSeg;
	}
	
	
}
