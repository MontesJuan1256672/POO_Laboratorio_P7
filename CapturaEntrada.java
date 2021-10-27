import java.util.*;

//This class allows capturing imput from the terminal/console, entered by the user
//This class uses the Java Scanner class to get imput from terminal/console
//All methods are "static", they are "class methods", so to create objects from this class is not necessary to use these methods.
public class CapturaEntrada {
    
	//Capturing integer
	//This method is "static", so don't need to create and object; it can be called throuhg the class
    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextInt());
    }
    
    //Capturing a float
    //This method is "static", so don't need to create and object; it can be called throuhg the class
	public static float capturarFloat(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return sc.nextFloat();
    }
	
	//Capturing a double
	//This method is "static", so don't need to create and object; it can be called throuhg the class		
	public static double capturarDouble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextDouble());
    }
    
	//Capturing a Sitrng
	//This method is "static", so don't need to create and object; it can be called throuhg the class
	public static String capturarString(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }
}
