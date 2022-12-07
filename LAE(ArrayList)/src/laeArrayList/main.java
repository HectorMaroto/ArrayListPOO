package laeArrayList;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.function.UnaryOperator;


public class main {
	public static Scanner sc=new Scanner(System.in);
	
	public static int menuPrincipal() {
		int opcion;
		System.out.println("------Menu principal-------");
		System.out.println("1.-   Libros              -");
		System.out.println("2.-   Autores             -");
		System.out.println("3.-   Editorial           -");
		System.out.println("4.-   Salir               -");
		System.out.println("---------------------------");
		System.out.println("Usuario dame una opcion de la 1 a la 4");
		opcion=sc.nextInt();
		return opcion;
	}
	
	public static int menuLibros() {
		int opcion;
		System.out.println("------Menu de libros-------");
		System.out.println("1.-   Insertar Libro      -");
		System.out.println("2.-   Listar libros       -");
		System.out.println("3.-   Modificar libro     -");
		System.out.println("4.-   Eliminar libro      -");
		System.out.println("5.-   Salir               -");
		System.out.println("---------------------------");
		System.out.println("Usuario dame una opcion de la 1 a la 5");
		opcion=sc.nextInt();
		return opcion;
	}
	
	public static void espaciado() {
		for(int i=0;i<10;i++) {
			System.out.println("");
		}
	}
	
	public static void errorLibros(int numero_error) {
			
			switch(numero_error) {
				case 1:{
					System.out.println("Opción no valida.");
					System.out.println("Por favor, escoge una opcion de las validas");
					System.out.println("Pulsa una tecla para continuar .....");
					sc.nextLine(); //No limpio buffer leo tecla.
					break;
				}
				case 2:{
					System.out.println("Usuario, para trabajar con los libros, antes tienes");
					System.out.println("que insertar libros pasando por la opcion 1 del Menu de Libros");
					System.out.println("Pulsa una tecla para continuar ....");
					sc.nextLine(); // No limpio buffer.
					break;
				}
			}
		}

	public static int menuAutores() {
		int opcion;
		System.out.println("------Menu de autores-------");
		System.out.println("1.-   Insertar autor      -");
		System.out.println("2.-   Listar autores       -");
		System.out.println("3.-   Modificar autor     -");
		System.out.println("4.-   Eliminar autor      -");
		System.out.println("5.-   Salir               -");
		System.out.println("---------------------------");
		System.out.println("Usuario dame una opcion de la 1 a la 5");
		opcion=sc.nextInt();
		return opcion;
	}
	
	public static void errorAutor(int numero_error) {
		
		switch(numero_error) {
			case 1:{
				System.out.println("Opción no valida.");
				System.out.println("Por favor, escoge una opcion de las validas");
				System.out.println("Pulsa una tecla para continuar .....");
				sc.nextLine(); //No limpio buffer leo tecla.
				break;
			}
			case 2:{
				System.out.println("Usuario, para trabajar con los autores, antes tienes");
				System.out.println("que insertar autores pasando por la opcion 1 del Menu de Autores");
				System.out.println("Pulsa una tecla para continuar ....");
				sc.nextLine(); // No limpio buffer.
				break;
			}
		}
	}
	
	public static int menuEditoriales() {
		int opcion;
		System.out.println("------Menu de editoriales-------");
		System.out.println("1.-   Insertar editorial      -");
		System.out.println("2.-   Listar editoriales       -");
		System.out.println("3.-   Modificar editorial     -");
		System.out.println("4.-   Eliminar editorial      -");
		System.out.println("5.-   Salir               -");
		System.out.println("---------------------------");
		System.out.println("Usuario dame una opcion de la 1 a la 5");
		opcion=sc.nextInt();
		return opcion;
	}
	
public static void errorEditorial(int numero_error) {
		
		switch(numero_error) {
			case 1:{
				System.out.println("Opción no valida.");
				System.out.println("Por favor, escoge una opcion de las validas");
				System.out.println("Pulsa una tecla para continuar .....");
				sc.nextLine(); //No limpio buffer leo tecla.
				break;
			}
			case 2:{
				System.out.println("Usuario, para trabajar con los editorial, antes tienes");
				System.out.println("que insertar editoriales pasando por la opcion 1 del Menu de Editoriales");
				System.out.println("Pulsa una tecla para continuar ....");
				sc.nextLine(); // No limpio buffer.
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		//Declaramos los ArrayList
		
		ArrayList<Libro> libros=new ArrayList();
		ArrayList<Autor> autores=new ArrayList();
		ArrayList<Editorial> editoriales=new ArrayList();
		
		int opcion=0;
		int opcion1=0;
		boolean indice_libros=false;
		boolean indice_autores=false;
		boolean indice_editoriales=false;
		
		//Empezamos la estructura del menu
		
		do {
			opcion=menuPrincipal();
			
			switch(opcion) {
				case 1:{
					do {
						opcion1=menuLibros();			
						espaciado();
						switch(opcion1) {
							case 1:{
								//Insertamos libro 
								
								System.out.println("Usuario dime el id del libro: ");
								int id_libro=sc.nextInt();
								System.out.println("Usuario dime el id de la editorial del libro: ");
								int id_editorial=sc.nextInt();
								System.out.println("Usuario dime el id del autor del libro: ");
								int id_autor=sc.nextInt();
								sc.nextLine(); //Limpiamos buffer
								System.out.println("Usuario dime el titulo del libro: ");
								String titulo_libro=sc.nextLine();
								System.out.println("Usuario dime el isbn del libro:");
								String isbn_libro=sc.nextLine();
								System.out.println("Usuario dime cuantas paginas tiene el libro:");
								int paginas_libro=sc.nextInt();
								Libro libro=new Libro(id_libro,id_editorial,id_autor,titulo_libro,isbn_libro,paginas_libro);
								libros.add(libro);
								System.out.println("Libro insertado con exito!!");
								System.out.println("Pulsa intro para continuar...");
								sc.nextLine();
								sc.nextLine();
								indice_libros=true;
								espaciado();
								break;
							}
							case 2:{
								//Mostramos la lista de libros insertados
								if(!indice_libros) {
									errorLibros(2);
									sc.nextLine();
								}else {
									System.out.println("Lista de libros:");
									for(Libro i:libros) {
										i.infoLibro();
									}
									System.out.println("Pulsa intro para continuar...");
									sc.nextLine();
									sc.nextLine();
									espaciado();
								}
								break;
							}
							case 3:{
								//Modificamos el libro que queramos
									if(!indice_libros) {
										errorLibros(2);
										sc.nextLine();
									}else { //Mostramos la lista de los libros al usuario
										int j=0;
										System.out.println("Lista de libros:");
										for(Libro i:libros) {
											System.out.println("Posicion del libro: "+j);
											i.infoLibro();
											j++;
										}
										sc.nextLine();
										
										System.out.println("Usuario dime la posicion del libro a modificar:");
										j=sc.nextInt();
										System.out.println("¿Quieres modificar este libro? (si/no): ");
										libros.get(j).infoLibro();
										sc.nextLine();
										String respuesta;
										respuesta=sc.nextLine();
										if(respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("Si")) {
											System.out.println("Usuario dime el nuevo id del libro: ");
											int id_libro=sc.nextInt();
											System.out.println("Usuario dime el nuevo id de la editorial del libro: ");
											int id_editorial=sc.nextInt();
											System.out.println("Usuario dime el nuevo id del autor del libro: ");
											int id_autor=sc.nextInt();
											sc.nextLine(); //Limpiamos buffer
											System.out.println("Usuario dime el titulo del libro: ");
											String titulo_libro=sc.nextLine();
											System.out.println("Usuario dime el isbn del libro:");
											String isbn_libro=sc.nextLine();
											System.out.println("Usuario dime cuantas paginas tiene el libro:");
											int paginas_libro=sc.nextInt();
											libros.get(j).setId_libro(id_libro);
											libros.get(j).setId_editorial(id_editorial);
											libros.get(j).setId_autor(id_autor);
											libros.get(j).setTitulo_libro(titulo_libro);
											libros.get(j).setIsbn_libro(isbn_libro);
											libros.get(j).setPaginas_libro(paginas_libro);
											
											System.out.println("Libro modificado con exito!!");
											System.out.println("Pulsa intro para continuar...");
											sc.nextLine();
											sc.nextLine();
										}
									}
									break;
								}
							case 4:{
								if(!indice_libros) {
									errorLibros(2);
									sc.nextLine();
								}else {
									//Eliminar libro
									//Mostramos la lista de los libros al usuario
									int j=0;
									System.out.println("Lista de libros:");
									for(Libro i:libros) {
										System.out.println("Posicion del libro: "+j);
										i.infoLibro();
										j++;
									}
									
									System.out.println("Dime la posicion del libro a eliminar: ");
									j=sc.nextInt();
									sc.nextLine();
									System.out.println("Quieres eliminar este libro? (si/no):");
									libros.get(j).infoLibro();  //Recordatorio:  array normal=> libros[j] // ArrayList=> libros.get(j)
									String respuesta;
									respuesta=sc.nextLine();
									if(respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("Si")) {
										libros.remove(j);
										System.out.println("Libro eliminado exitosamente!!!");
										System.out.println("Pulsa intro para continuar...");
										sc.nextLine();
										sc.nextLine();
									}
								}
								break;
							}
							case 5:{
								//No hacemos nada es el caso de salida
								break;
							}
							default:{
								errorLibros(1);
								sc.nextLine();
								break;
							}
						}
					}while(opcion1!=5);
					break;
				}
				case 2:{
					//Autores
					do {
						opcion1=menuAutores();
						espaciado();
						switch(opcion1) {
							case 1:{
								//Insertamos autor en la lista
								System.out.println("Usuario dime el id del autor:");
								int id_autor=sc.nextInt();
								sc.nextLine();//Limpio buffer
								System.out.println("Usuario dime el nombre del autor:");
								String nombre_autor=sc.nextLine();
								System.out.println("Usuario dime los apellidos del autor:"); 
								String apellidos_autor=sc.nextLine();
								System.out.println("Usuario dime la nacionalidad del autor:");
								String nacionalidad=sc.nextLine();
								System.out.println("Usuario dime la fecha de nacimiento del autor:");
								String fecha_autor=sc.nextLine();
								Autor autor=new Autor(id_autor,nombre_autor,apellidos_autor,nacionalidad,fecha_autor);
								autores.add(autor);
								indice_autores=true;
								System.out.println("Autor insertado con exito!");
								System.out.println("Pulsa intro para continuar...");
								sc.nextLine();
								espaciado();
								
								break;
							}
							case 2:{
								//Listamos los autores insertados
								
								if(!indice_autores) {
									errorAutor(2);
									sc.nextLine();
								}else {
									System.out.println("Lista de autores:");
									for(Autor i:autores) {
										i.infoAutor();
									}
									System.out.println("Pulsa intro para continuar...");
									sc.nextLine();
									sc.nextLine();
									espaciado();
								}
								break;
							}
							case 3:{
								//Modificamos el autor que elijamos
								
								if(!indice_autores) {
									errorAutor(2);
									sc.nextLine();
								}else {
									int j=0;
									System.out.println("Lista de autores:");
									for(Autor i:autores) {
										System.out.println("Posicion del autor: "+j);
										i.infoAutor();
										j++;
									}
									espaciado();
									
									System.out.println("Usuario dime la posicion del autor a modificar:");
									j=sc.nextInt();
									sc.nextLine();
									String respuesta;
									System.out.println("Seguro que quieres modificar este autor?: (si/no):");
									autores.get(j).infoAutor();
									respuesta=sc.nextLine();
									if(respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("si")) {
										System.out.println("Usuario dime el id del autor:");
										int id_autor=sc.nextInt();
										sc.nextLine();//Limpio buffer
										System.out.println("Usuario dime el nombre del autor:");
										String nombre_autor=sc.nextLine();
										System.out.println("Usuario dime los apellidos del autor:"); 
										String apellidos_autor=sc.nextLine();
										System.out.println("Usuario dime la nacionalidad del autor:");
										String nacionalidad=sc.nextLine();
										System.out.println("Usuario dime la fecha de nacimiento del autor:");
										String fecha_autor=sc.nextLine();
										autores.get(j).setId_autor(id_autor);
										autores.get(j).setNombre_autor(nombre_autor);
										autores.get(j).setApellidos_autor(apellidos_autor);
										autores.get(j).setNacionalidad(nacionalidad);
										autores.get(j).setFecha_autor(fecha_autor);
										
										System.out.println("Autor modificado con exito!");
										System.out.println("Pulsa intro para continuar...");
										sc.nextLine();
									}
								}
								
								break;
							}
							case 4:{
									if(!indice_autores) {
										errorAutor(2);
										sc.nextLine();
									}else {
										int j=0;
										System.out.println("Lista de autores:");
										for(Autor i:autores) {
											System.out.println("Posicion del autor: "+j);
											i.infoAutor();
											j++;
										}
										sc.nextLine();
										espaciado();
										
										System.out.println("Usuario dime la posicion del autor a eliminar:");
										j=sc.nextInt();
										sc.nextLine();
										String respuesta;
										System.out.println("Seguro que quieres eliminar este autor?: (si/no):");
										autores.get(j).infoAutor();
										respuesta=sc.nextLine();
										if(respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("si")) {
											autores.remove(j);
											System.out.println("Autor eliminado con exito!");
											System.out.println("Pulsa intro para continuar...");
											sc.nextLine();
										}
									}	
								break;
							}
							case 5:{
								//Caso de salida del menu de autores
								break;
							}
							default:{
								errorAutor(1);
								sc.nextLine();
								break;
							}
						}
						
					}while(opcion1!=5);
					break;
				}
				case 3:{
					//Editoriales
					do {
						opcion1=menuEditoriales();
						espaciado();
						switch(opcion1) {
						case 1:{
							//Insertamos editorial
							System.out.println("Usuario dime el id de la editorial:");
							int id_editorial=sc.nextInt();
							sc.nextLine(); //Limpiamos buffer
							System.out.println("Dime el nombre de la editorial:");
							String nombre=sc.nextLine();
							System.out.println("Dime la nacionalidad de la editorial:");
							String nacionalidad=sc.nextLine();
							Editorial editorial=new Editorial(id_editorial, nombre, nacionalidad);
							editoriales.add(editorial);
							indice_editoriales=true;
							System.out.println("Editorial insertada con exito!");
							System.out.println("Pulsa intro para continuar");
							sc.nextLine();
							break;
						}
						case 2:{
							if(!indice_editoriales) {
								errorEditorial(2);
								sc.nextLine();
							}else {
								System.out.println("Lista de editoriales:");
								for(Editorial i: editoriales) {
									i.infoEditorial();
								}
								System.out.println("Pulsa intro para continuar...");
								sc.nextLine();
								sc.nextLine();
								espaciado();
							}
							break;
						}
						case 3:{
							//Modificar libro
							if(!indice_editoriales) {
								errorEditorial(2);
								sc.nextLine();
							}else {
								int j=0;
								System.out.println("Lista de editoriales:");
								for(Editorial i: editoriales) {
									System.out.println("Posicion: "+j);
									i.infoEditorial();
									j++;
								}
								System.out.println("Dime la posicion de la editorial a modificar:");
								j=sc.nextInt();
								sc.nextLine();//Limpio buffer
								System.out.println("¿Quieres modificar esta editorial? (si/no)");
								editoriales.get(j).infoEditorial();
								String respuesta=sc.nextLine();
								if(respuesta.equals("SI") || respuesta.equals("si") || respuesta.equals("Si")) {
									System.out.println("Usuario dime el id de la editorial:");
									int id_editorial=sc.nextInt();
									sc.nextLine(); //Limpiamos buffer
									System.out.println("Dime el nombre de la editorial:");
									String nombre=sc.nextLine();
									System.out.println("Dime la nacionalidad de la editorial:");
									String nacionalidad=sc.nextLine();
									editoriales.get(j).setId_editorial(id_editorial);
									editoriales.get(j).setNombre(nombre);
									editoriales.get(j).setNacionalidad(nacionalidad);
									
									System.out.println("Editorial modificada correctamente!");
									System.out.println("Pulsa intro para continuar...");
									sc.nextLine();
								}
							}
							break;
						}
						case 4:{
							//Eliminar editorial
							if(!indice_editoriales) {
								errorEditorial(2);
								sc.nextLine();
							}else {
								int j=0;
								System.out.println("Lista de editoriales:");
								for(Editorial i: editoriales) {
									System.out.println("Posicion: "+j);
									i.infoEditorial();
									j++;
								}
								System.out.println("Dime la posicion de la editorial a eliminar:");
								j=sc.nextInt();
								sc.nextLine();//Limpio buffer
								System.out.println("¿Quieres eliminar esta editorial? (si/no)");
								editoriales.get(j).infoEditorial();
								String respuesta=sc.nextLine();
								if(respuesta.equals("SI") || respuesta.equals("si") || respuesta.equals("Si")) {
									editoriales.remove(j);
									System.out.println("Editorial eliminada correctamente!");
									System.out.println("Pulsa intro para continuar...");
									sc.nextLine();
								}
							}
							break;
						}
						case 5:{
							//caso de salida
							break;
						}
						default:{
							errorEditorial(1);
							sc.nextLine();
							break;
						}
						}
					}while(opcion1!=5);
					break;
				}
				case 4:{
					//No hacemos nada este el caso de salida
					break;
				}
				default:{
					System.out.println("Introduzca un valor valido del 1 al 4");
					System.out.println("Pulsa intro para continuar...");
					sc.nextLine();
					sc.nextLine();
					break;
				}
			}
			
		}while(opcion!=4);
		

	}

}
