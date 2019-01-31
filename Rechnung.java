import java.lang.Math;
public class Rechnung {
	public double kreisberechnung() {
		double radius;
		double kreisflaeche;
		
		radius = 4.7;
		kreisflaeche = Math.PI * (radius*radius);	
		
		System.out.println("Radius: " + radius + "\nKreisflaeche: " + kreisflaeche);
		return kreisflaeche;
	}
}
