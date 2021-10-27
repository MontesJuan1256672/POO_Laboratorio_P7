class RobotMasterChef extends Robot implements Vegetales, Carne{
	public RobotMasterChef(int bateria, String nombre, int numID, String ultimaAccion){
		super(bateria, nombre, numID, ultimaAccion);
	}

	//método de la clase abstracta Robot
	public int estadoBateria(boolean usando){
		if(usando){
			bateria -= 20;
		}
		return bateria;
	}
	public void nombreRobot(){
		System.out.println("Soy en robot Master Chef que sirve el platillo.");
		System.out.println("Mi nombre es: " + getNombre());
		System.out.println("\n");
	}
	public void numIdentificacion(){
		System.out.println("Soy en robot Master Chef que sirve el platillo.");
		System.out.println("ID num: " + getNumID());
		System.out.println("\n");
	}
	public void lastAction(String lastAction){
		System.out.println("Soy en robot Master Chef que sirve el platillo.");
		System.out.println("Mi ultima accion fue " + lastAction);
		System.out.println("\n");
	}
	
	//método de la interfaz vegetales
	public void vegetalesWorks(){
		System.out.println("Soy en robot Master Chef que sirve el platillo.");
		System.out.println("Estoy sirviendo una guarnicion de esparragos");
		System.out.println("\n");
	}
	
	//método de la interfaz carne
	public  void carneWorks(){
		System.out.println("Soy en robot Master Chef que sirve el platillo.");
		System.out.println("Estoy sirviendo un filete de arrachera.");
		System.out.println("\n");
	}
}