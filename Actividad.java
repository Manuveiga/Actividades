import java.util.Scanner;
public class Actividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc=new Scanner(System.in);
	
	double f;
	double c =0;
	
	
	
	System.out.println("introduce la temperatura en grados centigrados ");
	c=sc.nextDouble();
	
	
	  f = 32 + ( 9 * c / 5);
	
	System.out.println("la temperatura en fahrenheit "+f );


   
}
}