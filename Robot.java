/*
Todos tienen una GUI muy moderna que le indica el nivel de batería restante, su nombre, identificación y la
última acción que hicieron antes de que se sirva el plato
*/
abstract class Robot{//clase padre 
	int bateria;
	String nombre;
	int numID;
	String ultimaAccion;
	
	public Robot(int bateria, String nombre, int numID, String ultimaAccion){
		this.bateria = bateria;
		this.nombre = nombre;
		this.numID = numID;
		this.ultimaAccion = ultimaAccion;
	}
	
	public abstract int estadoBateria(boolean usando);
	public abstract void nombreRobot();
	public abstract void numIdentificacion();
	public abstract void lastAction(String lastAction);
	
	
	
	public void setBateria(int bateria){
		this.bateria = bateria;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setNumID(int numID){
		this.numID = numID;
	}
	public void setUltimaAccion(String ultimaAccion){
		this.ultimaAccion = ultimaAccion;
	}
	
	public int getBateria(){
		return bateria;
	}
	public String getNombre(){
		return nombre;
	}
	public int getNumID(){
		return numID;
	}
	public String getUltimaAccion(){
		return ultimaAccion;
	}
	
}

