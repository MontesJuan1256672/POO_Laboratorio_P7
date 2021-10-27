/*
Clase que contiene los menús y submenús que seran utilizados en el método main
*/
class MagnumOpus{
	
	boolean banderaCuchillos = false;
	boolean banderaSartenes = false;
	boolean banderaMasterChef = false;
	
	MiniRobotCuchillos robotCuchillos = new MiniRobotCuchillos(100, "Robot con cuchillos", 1234, "Picar carne y verduras");
	MiniRobotSartenes robotSartenes = new MiniRobotSartenes(100, "Robot con sartenes", 2345, "Cocer verduras y carne");
	RobotMasterChef masterChef = new RobotMasterChef(100, "Robot Master Chef", 3456, "Servir platillo");	

	public static void main (String args[]){
		
		MagnumOpus menus = new MagnumOpus();
		menus.menuPrincipal();
	}
	
	//Menú principal del programa
	//te da a escoger entre los 3 robots 
	public void menuPrincipal(){

		int opc;
		
		do{
			System.out.println("\n");
			System.out.println("Seleccione una opcion: ");
			System.out.println("1) Mini Robot Chef cuchillos.");
			System.out.println("2) Mini Robot Chef sartenes.");
			System.out.println("3) Robot Chef principal");
			System.out.println("4) Salir.");
			
			opc = CapturaEntrada.capturarEntero(">>>");
			
			switch (opc){
				case 1:	 /*invocar método del menú de opciones para Mini Robot cuchillos*/
						 menuCuchillos();
						 banderaCuchillos = true;
						 System.out.println("Bateria: " + robotCuchillos.estadoBateria(banderaCuchillos));
						 break;
				
				case 2:	 /*invocar método del menú de opciones para Mini Robot sartenes*/
						 if(banderaCuchillos){
							menuSartenes();
							banderaSartenes = true;
							System.out.println("Bateria: " + robotSartenes.estadoBateria(banderaSartenes));
						 }else{
							System.out.println("Primero pique y corte los vegetales y la carne"); 
						 }
						 
						 break;
				
				case 3:	 /*invocar método del menú de opciones para Robot Chef principal*/
						 if(banderaCuchillos && banderaSartenes){
							menuServir();
							banderaMasterChef = true;
							System.out.println("Bateria: " + masterChef.estadoBateria(banderaMasterChef));
						 }else{
							System.out.println("Primero cocine los vegetales y la carne"); 
						 }
						 break;
				
				default: /*mensaje de error si se elige una opcion incorrecta*/
						 if (opc == 4){
							break;
						 }else{
							 System.out.println("Opcion no encontrada.");
						  }
						 break;
			}//fin de switch
			System.out.println("\n");
			
		}while(opc != 4);
			
	}//fin de método menuPrincipal
	
	
	
	
	
	//método para el menú de opciones de Mini Robot Chef cuchillos
	public void menuCuchillos(){
		int opc;
		
		/*
		invocacion de métodos de la clase MiniRobotCuchillos
		que indican el estado del robot,
		*/
		System.out.println("Bateria: " + robotCuchillos.estadoBateria(banderaCuchillos));
		robotCuchillos.nombreRobot();
		robotCuchillos.numIdentificacion();
		robotCuchillos.lastAction(robotCuchillos.getUltimaAccion());
		System.out.println("\n");
		
		
		do{
			System.out.println(" ");
			System.out.println("1) Cortar vegetales.");
			System.out.println("2) Cortar carne.");
			System.out.println("3) Regresar");
			opc = CapturaEntrada.capturarEntero(">>>");
			
			switch (opc){
				case 1:	 /*invocar método para cortar vegetales*/
						 robotCuchillos.vegetalesWorks();
						 break;
				
				case 2:	 /*invocar método para cortar carne*/
						 robotCuchillos.carneWorks();
						 break;
				
				default: /*mensaje de error si se elige una opcion incorrecta*/
						 System.out.println("Opcion no encontrada.");
			}//fin de switch
			
			System.out.println("\n");
			
		}while(opc != 3);
	}



	
	//método para el menú de opciones de Mini Robot Chef sartenes
	public void menuSartenes(){
		int opc;
		
		/*
		invocacion de métodos de la clase MiniRobotSartenes
		que indican el estado del robot,
		*/
		System.out.println("Bateria: " + robotSartenes.estadoBateria(banderaSartenes));
		robotSartenes.nombreRobot();
		robotSartenes.numIdentificacion();
		robotSartenes.lastAction(robotSartenes.getUltimaAccion());
		System.out.println("\n");
		
		do{
			System.out.println(" ");
			System.out.println("1) Cocinar vegetales.");
			System.out.println("2) Cocinar carne.");
			System.out.println("3) Regresar.");
			
			opc = CapturaEntrada.capturarEntero(">>>");
			
			switch (opc){
				case 1:	 /*invocar método para cocinar vegetales*/
						 robotSartenes.vegetalesWorks();
						 break;
				
				case 2:	 /*invocar método para cocinar carne*/
						 robotSartenes.carneWorks();
						 break;
				
				default: /*mensaje de error si se elige una opcion incorrecta*/
						 System.out.println("Opcion no encontrada.");
			}//fin de switch
			
			System.out.println("\n");
			
		}while(opc != 3);
	}
	
	
	
	
	//método para el menú de opciones de Robot Chef principal
	public void menuServir(){
		int opc;
		
		/*
		invocacion de métodos de la clase RobotMasterChef
		que indican el estado del robot,
		*/
		System.out.println("Bateria: " + masterChef.estadoBateria(banderaMasterChef));
		masterChef.nombreRobot();
		masterChef.numIdentificacion();
		masterChef.lastAction(masterChef.getUltimaAccion());
		System.out.println("\n");
		
		do{
			System.out.println(" ");
			System.out.println("1) Servir vegetales");
			System.out.println("2) Servir carne. ");
			System.out.println("3) Presentar platillo.");
			opc = CapturaEntrada.capturarEntero(">>>");
			
			switch (opc){
				case 1:	 /*invocar método para servir vegetales*/
						 masterChef.vegetalesWorks();
						 break;
				
				case 2:	 /*invocar método para servir carne*/
						 masterChef.carneWorks();
						 break;
				
				case 3:	 /*invocar método para presentar platillo*/
						 System.out.println("¡Hurra! El plato estaba delicioso");
						 break;
				default: /*mensaje de error si se elige una opcion incorrecta*/
						 System.out.println("Opcion no encontrada.");
			}//fin de switch
			
			System.out.println("\n");
			
		}while(opc != 3);
	}
	
	
}//fin de clase Menus