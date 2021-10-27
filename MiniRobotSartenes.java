class MiniRobotSartenes extends Robot implements Vegetales, Carne {
	public MiniRobotSartenes(int bateria, String nombre, int numID, String ultimaAccion){
		super(bateria, nombre, numID, ultimaAccion);
	}
	//método de la clase abstracta Robot
	public int estadoBateria(boolean usando){
		if(usando){
			bateria -= 15;
		}
		return bateria;
	}
	public void nombreRobot(){
		System.out.println("Soy en robot con sartenes que cocina y prepara la verdura y carne");
		System.out.println("Mi nombre es: " + getNombre());
		System.out.println("\n");
	}
	public void numIdentificacion(){
		System.out.println("Soy en robot con sartenes que cocina y prepara la verdura y carne");
		System.out.println("ID num: " + getNumID());
		System.out.println("\n");
	}
	public void lastAction(String lastAction){
		System.out.println("Soy en robot con sartenes que cocina y prepara la verdura y carne");
		System.out.println("Mi ultima accion fue " + lastAction);
		System.out.println("\n");
	}
	
	//método de la interfaz vegetales
	public void vegetalesWorks(){
		System.out.println("Soy en robot con sartenes que cocina y prepara la verdura y carne");
		System.out.println("Estoy cociendo vegetales");
		System.out.println("\n");
	}
	
	//método de la interfaz carne
	public  void carneWorks(){
		System.out.println("Soy en robot con sartenes que cocina y prepara la verdura y carne");
		System.out.println("Estoy cociendo carne");
		System.out.println("\n");
	}
}