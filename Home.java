import java.util.Scanner;
public class Home {

	public static void main(String[] args) {
		
		//INSTANCIA DE CLASE
		
				Productos producto = new Productos();
				Usuarios usuario = new Usuarios();
				
				
				String exit="exit";
				String programaEncendido= "ON";
				String cerrar ="cerrar";
				int intentos=0;
				
				
				do {
					
					Scanner datoUserName = new Scanner(System.in);
					
					System.out.println("                                  ");
					System.out.println("             SnekearGt");
					System.out.println("***************************************");
					System.out.println("Ingresar");
					System.out.println("***************************************");
					System.out.println("                                  ");
					System.out.print("User; ");
					
					String user = datoUserName.nextLine();
					
					for(int j = 0; j<2;j++) {//2     0 1
					
						if(user.equals(usuario.UserName[j])) {
							
							Scanner datoPassword = new Scanner(System.in); 
							System.out.print("Password: ");
							String pass = datoPassword.nextLine();
							
							if(pass.contentEquals(usuario.password[j])) {
								
								
								
								do {
									Scanner datoCodigo = new Scanner(System.in);
									
									
									System.out.println("***************************************");
									System.out.println("Codigo producto");
									System.out.println("***************************************");
									System.out.println("                                  ");
									System.out.print("Código/Producto: ");
									String rCodigo = datoCodigo.nextLine();//a001
									System.out.println("***************************************");
								
									
									
									
									if(rCodigo.equalsIgnoreCase("exit")) {
									
										
											exit="salir";
									}else {
										
									for(int i = 0;i<producto.Producto.length;i++) {
											
											if(rCodigo.equals(producto.Producto [i])){
												
												System.out.println("Código:       "+producto.codigo [i]);
												System.out.println("Nombre:       "+producto.Producto [i]);
												System.out.println("Proveedor:    "+producto.proveedor [i]);
												System.out.println("Existencia:   "+producto.existencias [i]);
												System.out.println("Precio:     Q "+producto.precio[i]);
												System.out.println("Descripción:  "+producto.descripcion [i]);
											}
										}
										
									for(int i = 0;i<producto.Producto.length;i++) {
										if(rCodigo.equals(producto.codigo[i])){
											
											System.out.println("Código:       "+producto.codigo [i]);
											System.out.println("Nombre:       "+producto.Producto [i]);
											System.out.println("Proveedor:    "+producto.proveedor [i]);
											System.out.println("Existencia:   "+producto.existencias [i]);
											System.out.println("Precio:     Q "+producto.precio[i]);
											System.out.println("Descripción:  "+producto.descripcion [i]);
										}
									}
									
								}
							}while(exit.equalsIgnoreCase("exit"));//false
							
						}else {
								System.out.println("Contraseña incorrecta");
							}
							
						}
					
					
					}
				}while(exit.equalsIgnoreCase("salir"));//true
				
				
	}
}

