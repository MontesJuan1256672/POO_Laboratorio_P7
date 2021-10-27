class MiniRobotCuchillos extends Robot implements Vegetales, Carne {
	public MiniRobotCuchillos(int bateria, String nombre, int numID, String ultimaAccion){
		super(bateria, nombre, numID, ultimaAccion);
	}
	
	//método de la clase abstracta Robot
	public int estadoBateria(boolean usando){
		if(usando){
			bateria -= 10;
		}
		return bateria;
	}
	public void nombreRobot(){
		System.out.println("Soy en robot con cuchillos que pica y corta la verdura y carne");
		System.out.println("Mi nombre es: " + getNombre());
		System.out.println("\n");
	}
	public void numIdentificacion(){
		System.out.println("Soy en robot con cuchillos que pica y corta la verdura y carne");
		System.out.println("ID num: " + getNumID());
		System.out.println("\n");
	}
	public void lastAction(String lastAction){
		System.out.println("Soy en robot con cuchillos que pica y corta la verdura y carne");
		System.out.println("Mi ultima accion fue " + lastAction);
		System.out.println("\n");
	}
	
	//método de la interfaz vegetales
	public void vegetalesWorks(){
		System.out.println("Soy en robot con cuchillos que pica y corta la verdura y carne");
		System.out.println("Estoy picando vegetales");
		System.out.println("\n");
	}
	
	//método de la interfaz carne
	public  void carneWorks(){
		System.out.println("Soy en robot con cuchillos que pica y corta la verdura y carne");
		System.out.println("Estoy picando carne");
		System.out.println("\n");
	}
}