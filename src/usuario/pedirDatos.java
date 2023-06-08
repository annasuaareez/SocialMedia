package usuario;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import basesDatos.basesDeDatos;
import modelo.perfil;
import modelo.publica;
import modelo.publicaciones;
import modelo.transformar;

public class pedirDatos {
	
	/*MENU*/
	public static void menuPrincipal() {
	
		int opcion = 0;
		int idPublicacion;
		int idPerfil;
		String nombreUsuario;
		String fecha;
		
		perfil miPerfil;
		publicaciones miPublicaciones;
		publica miPublica;
		
		String sql = null;
		
		Scanner lector = new Scanner(System.in);
		
		do {
			System.out.println("________________________________________________________________________________________");
			System.out.println("1. Insertar Datos");
			System.out.println("2. Eliminar Datos");
			System.out.println("3. Modificar Datos");
			System.out.println("4. Querys");
			System.out.println("5. Salir");
			System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
			System.out.print("Introduce una opción:");
			
			try {
				opcion = lector.nextInt();
				lector.nextLine();
				
				switch (opcion) {
				case 1: 
					do {
						System.out.println("________________________________________________________________________________________");
						System.out.println("                                INSERCIÓN DE DATOS");
						System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
						System.out.println("1. Tabla Perfil");
						System.out.println("2. Tabla Publicaciones");
						System.out.println("3. Salir");
						System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
						System.out.print("Introduce una opción:");
						try {
							opcion = lector.nextInt();
							lector.nextLine();
							switch (opcion) {
							case 1: 
								System.out.println("________________________________________________________________________________________");
								System.out.println("		                   INSERTAR DATOS PERFIL");
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								miPerfil = pedirDatosPerfil();
								
								sql = transformar.transformarASQLPerfil(miPerfil);
								
								basesDeDatos.subirABase(sql);
								
								enlazarPerfilConPublicacion();
								
								break;
							case 2: 
								System.out.println("________________________________________________________________________________________");
								System.out.println("	                    INSERTAR DATOS PUBLICACIONES");
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								
								miPublicaciones = pedirDatosPublicaciones();
								
								sql = transformar.transformarASQLPublicaciones(miPublicaciones);
								
								basesDeDatos.subirABase(sql);
								
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								sql = transformar.mostrarDatosPerfil();
								basesDeDatos.mostrarTablaPerfil(sql);
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");								
								
								miPublica = pedirDatosPublicaPerfil();
								
								sql = transformar.transformarASQLPerfilPublicaciones(miPublica);
								
								basesDeDatos.subirABase(sql);
								
								break;
							case 3:
								System.out.println("________________________________________________________________________________________");
								System.out.println("	                   SALISTE DE LA OPCION INSERTAR DATOS");
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								break;
							default:
								throw new IllegalArgumentException("Unexpected value: " + opcion);
							}
						} catch (InputMismatchException e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						} catch (NoSuchElementException e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						}catch (IllegalStateException e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						} catch (Exception e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						}
					} while (opcion != 3);
					break;
				case 2:
					do {
						System.out.println("________________________________________________________________________________________");
						System.out.println("                               ELIMINACIÓN DE DATOS");
						System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
						System.out.println("1. Tabla Perfil");
						System.out.println("2. Tabla Publicaciones");
						System.out.println("3. Salir");
						System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
						System.out.print("Introduce una opción:");
						try {
							opcion = lector.nextInt();
							lector.nextLine();
							switch (opcion) {
							case 1: 
								System.out.println("________________________________________________________________________________________");
								System.out.println("		                   ELIMINAR DATOS PERFIL");
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								sql = transformar.mostrarDatosPerfil();
								basesDeDatos.mostrarTablaPerfil(sql);
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");								
								
								idPerfil = pedirIDPerfil();
								
								sql = transformar.eliminarSQLPerfil1(idPerfil);
								
								basesDeDatos.eliminarBases(sql);
								
								sql = transformar.eliminarSQLPerfil(idPerfil);
								
								basesDeDatos.eliminarBases(sql);
								break;
							case 2: 
								System.out.println("________________________________________________________________________________________");
								System.out.println("	                    ELIMINAR DATOS PUBLICACIONES");
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								sql = transformar.mostrarDatosPublicaciones();
								basesDeDatos.mostrarTablaPublicaciones(sql);
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");								
								
								idPublicacion = pedirIDPublicacionBorrar();
								
								sql = transformar.eliminarSQLPublicaciones1(idPublicacion);
								
								basesDeDatos.eliminarBases(sql);
																
								sql = transformar.eliminarSQLPublicaciones(idPublicacion);
								
								basesDeDatos.eliminarBases(sql);
								
								break;
							case 3:
								System.out.println("________________________________________________________________________________________");
								System.out.println("	                   SALISTE DE LA OPCION ELIMINAR DATOS");
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								break;
							default:
								throw new IllegalArgumentException("Unexpected value: " + opcion);
							}
						} catch (InputMismatchException e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						} catch (NoSuchElementException e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						}catch (IllegalStateException e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						} catch (Exception e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						}
					} while (opcion != 3);
					break;
				case 3:
					do {
						System.out.println("________________________________________________________________________________________");
						System.out.println("                            MODIFICACIÓN DE DATOS");
						System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
						System.out.println("1. Tabla Perfil");
						System.out.println("2. Tabla Publicaciones");
						System.out.println("3. Salir");
						System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
						System.out.print("Introduce una opción:");
						try {
							opcion = lector.nextInt();
							lector.nextLine();
							switch (opcion) {
							case 1: 
								System.out.println("________________________________________________________________________________________");
								System.out.println("		                   MODIFICAR DATOS PERFIL");
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								sql = transformar.mostrarDatosPerfil();
								basesDeDatos.mostrarTablaPerfil(sql);
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								miPerfil = pedirIDPerfilModificar();
								
								sql = transformar.modificarSQLPerfil(miPerfil);
								
								basesDeDatos.modificarBase(sql);
								
								break;
							case 2: 
								System.out.println("________________________________________________________________________________________");
								System.out.println("	                    MODIFICAR DATOS PUBLICACIONES");
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								sql = transformar.mostrarDatosPublicaciones();
								basesDeDatos.mostrarTablaPublicaciones(sql);
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								miPublicaciones = pedirIDPublicacionModificar();
								
								sql = transformar.modificarSQLPublicaciones(miPublicaciones);
								
								basesDeDatos.subirABase(sql);
								
								break;
							case 3:
								System.out.println("________________________________________________________________________________________");
								System.out.println("	                   SALISTE DE LA OPCION MODIFICAR DATOS");
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								break;
							default:
								throw new IllegalArgumentException("Unexpected value: " + opcion);
							}
						} catch (InputMismatchException e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						} catch (NoSuchElementException e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						}catch (IllegalStateException e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						} catch (Exception e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						}
					} while (opcion != 3);
					break;
				case 4:
					do {
						System.out.println("________________________________________________________________________________________");
						System.out.println("                                 QUERYS");
						System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
						System.out.println("1. Mostrar publicaciones de un perfil");
						System.out.println("2. Mostrar perfiles que han subido una publicación en una fecha");
						System.out.println("3. Cantidad de perfiles registrados");
						System.out.println("4. Hastag más usado");
						System.out.println("5. Perfiles sin publicaciones");
						System.out.println("6. Salir");
						System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
						System.out.print("Introduce una opción:");
						try {
							opcion = lector.nextInt();
							lector.nextLine();
							switch (opcion) {
							case 1: 
								System.out.println("________________________________________________________________________________________");
								System.out.println("		              MOSTRAR PUBLICACIONES DE UN PERFIL");
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								sql = transformar.mostrarDatosPerfil();
								basesDeDatos.mostrarTablaPerfil(sql);
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								nombreUsuario = pedirUsuarioPerfil();
								
								sql = transformar.buscarNombreUsuario(nombreUsuario);
								
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								basesDeDatos.mostrarTablaPublicaciones(sql);
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								break;
							case 2: 
								System.out.println("________________________________________________________________________________________");
								System.out.println("	       MOSTRAR PERFILES QUE HAN SUBIDO UNA PUBLICACIÓN EN UNA FECHA");
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								sql = transformar.mostrarDatosPublicaciones();
								basesDeDatos.mostrarTablaPublicaciones(sql);
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								fecha = pedirFechaPublicaciones();
								
								sql = transformar.buscarFechaPublicacion(fecha);
								
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								basesDeDatos.mostrarTablaPerfil(sql);
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								break;
							case 3:
								System.out.println("________________________________________________________________________________________");
								System.out.println("	                   MOSTRAR CANTIDAD DE PERFILES");
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								sql = transformar.cantidaPerfiles();
								
								basesDeDatos.cantidadPerfiles(sql);
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								break;
							case 4:
								System.out.println("________________________________________________________________________________________");
								System.out.println("	                      HASTAG MÁS USADO");
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								sql = transformar.hastagMasUsado();
								
								basesDeDatos.mostrarNombreHastag(sql);
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								break;
							case 5:
								System.out.println("________________________________________________________________________________________");
								System.out.println("	                   PERFILES SIN NINGUNA PUBLICACIÓN");
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								sql  = transformar.perfilesSinPublicacion();
								
								basesDeDatos.mostrarTablaPerfil(sql);
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								break;
							case 6:
								System.out.println("________________________________________________________________________________________");
								System.out.println("	                   SALISTE DE LA OPCION DE MIRAR QUERYS");
								System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
								break;
							default:
								throw new IllegalArgumentException("Unexpected value: " + opcion);
							}
						} catch (InputMismatchException e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						} catch (NoSuchElementException e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						}catch (IllegalStateException e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						} catch (Exception e) {
							System.out.println();
							System.out.println("Error: " +e.getMessage());
						}
					} while (opcion != 6);
					break;
				case 5:
					System.out.println("________________________________________________________________________________________");
					System.out.println("                                   SALISTE DEL PROGRAMA");
					System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + opcion);
				}
			} catch (InputMismatchException e) {
				System.out.println();
				System.out.println("Error: " +e.getMessage());
			} catch (NoSuchElementException e) {
				System.out.println();
				System.out.println("Error: " +e.getMessage());
			}catch (IllegalStateException e) {
				System.out.println();
				System.out.println("Error: " +e.getMessage());
			} catch (Exception e) {
				System.out.println();
				System.out.println("Error: " +e.getMessage());
			}
		} while (opcion !=5);
		
		lector.close();
		
	}
	
	/*INSERTAR DATOS*/
	public static perfil pedirDatosPerfil() {
		
		String nombre;
		String correoelectronico;
		String contraseña;
		String nombreusuario;
		String biografia;
		String detallescontacto;
		String imagenperfilurl;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("________________________________________________________________________________________");
		do {
			System.out.print("Introduzca su nombre:");
			nombre = lector.nextLine();
		} while (nombre.isBlank());
		
		do {
			System.out.print("Introduzca el correo electronico:");
			correoelectronico = lector.nextLine();
		} while (correoelectronico.isBlank());
		
		do {
			System.out.print("Introduzca una contraseña:");
			contraseña = lector.nextLine();
		} while (contraseña.isBlank());
		
		do {
			System.out.print("Introduzca un nombre de usuario:");
			nombreusuario = lector.nextLine();
		} while (nombreusuario.isBlank());
		
		System.out.print("Introduzca una biografia (opcional):");
		biografia = lector.nextLine();
		
		System.out.print("Introduzca detalles de contacto (opcional):");
		detallescontacto = lector.nextLine();
		
		System.out.print("Introduzca una imagen de perfil (opcional):");
		imagenperfilurl = lector.nextLine();
		
		return new perfil(nombre, correoelectronico, contraseña, nombreusuario, biografia, detallescontacto, imagenperfilurl);
		
	}
	
	public static publicaciones pedirDatosPublicaciones() {
		
		String fecha;
		String hastag;
		String contenidoURL;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("________________________________________________________________________________________");
		do {
			System.out.print("Introduzca la fecha de la publicación(YYYY-MM-DD):");
			fecha = lector.nextLine();
		} while (fecha.isBlank());

		do {
			System.out.print("Introduzca el hastag que desea utilizar:");
			hastag = lector.nextLine();
		} while (hastag.isBlank());
		
		do {
			System.out.print("Introduzca el contenido en URL:");
			contenidoURL = lector.nextLine();
		} while (contenidoURL.isBlank());
		
		return new publicaciones(fecha, hastag, contenidoURL);
		
	}
	
	public static publica pedirDatosPublicaPerfil() {
		
		int idPerfil;
		int idPublicacion = 0;
		String idPublicacionSQL;
		String sql;
		
		idPerfil = pedirIDPerfilParaPublicacion();
		
		sql = transformar.insertarIDs(idPerfil);
		idPublicacionSQL = transformar.ultimoIDPublicacion();
		
		idPublicacion = basesDeDatos.ultimoID(idPublicacionSQL);
		
		return new publica(idPerfil, idPublicacion);
				
	}
	
	public static publica pedirDatosPublicaPublicaciones() {
		
		int idPerfil = 0;
		int idPublicacion ;
		String idPublicacionSQL;
		String sql;
		
		idPublicacion = pedirIDPublicacionParaPerfil();
		
		sql = transformar.insertarIDs(idPublicacion);
		idPublicacionSQL = transformar.ultimoIDPerfil();
		
		idPerfil = basesDeDatos.ultimoID(idPublicacionSQL);
		
		return new publica(idPerfil, idPublicacion);
				
	}

	public static int pedirIDPerfilParaPublicacion() {
		
		int idperfil = 0;
		
		Scanner lecScanner = new Scanner(System.in);
		
		try {
			System.out.println("________________________________________________________________________________________");
			System.out.print("Selecione el ID del perfil al que desea insertar la publicación:");
			idperfil = lecScanner.nextInt();
			lecScanner.nextLine();
		} catch (NoSuchElementException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}catch (IllegalStateException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		} catch (Exception e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}				
		return idperfil ;
		
	}
	
	public static int pedirIDPublicacionParaPerfil() {
		
		int idpublicacion = 0;
		
		Scanner lecScanner = new Scanner(System.in);
		
		try {
			System.out.println("________________________________________________________________________________________");
			System.out.print("Selecione el ID del perfil al que desea insertar la publicación:");
			idpublicacion = lecScanner.nextInt();
			lecScanner.nextLine();
		} catch (NoSuchElementException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}catch (IllegalStateException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		} catch (Exception e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}				
		return idpublicacion ;
		
	}
	
	public static void enlazarPerfilConPublicacion() {
		
		String sql;
		publica miPublica;
		
		Scanner scanner = new Scanner(System.in);
		
		   
		System.out.println("________________________________________________________________________________________");
		System.out.print("¿Desea enlazar su perfil con una publicación existente? (S/N):");
		String respuesta = scanner.nextLine();
		if (respuesta.equals("S")) {
			System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
			sql = transformar.mostrarDatosPublicaciones();

			basesDeDatos.mostrarTablaPublicaciones(sql);
			System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

			miPublica = pedirDatosPublicaPublicaciones();
			
			sql = transformar.transformarASQLPerfilPublicaciones(miPublica);
			
			basesDeDatos.subirABase(sql);
		}else if (respuesta.equals("N")){
			menuPrincipal();
		}

	}

	/*BORRAR DATOS*/
	public static int pedirIDPerfil() {
		
		int idperfil = 0;
		
		Scanner lecScanner = new Scanner(System.in);
		
		System.out.println("________________________________________________________________________________________");
		System.out.print("Selecione el ID del perfil que desea eliminar:");
		
		try {
			idperfil = lecScanner.nextInt();
			lecScanner.nextLine();
		} catch (NoSuchElementException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}catch (IllegalStateException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		} catch (Exception e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}
						
		return idperfil ;
		
	}
	
	public static int pedirIDPublicacionBorrar () {
		
		publicaciones miPublicaciones;
		int idPublicacion = 0;
		
		Scanner lecScanner = new Scanner(System.in);
		
		System.out.println("________________________________________________________________________________________");
		System.out.print("Selecione el ID de la publicacion que desea eliminar:");
		
		try {
			idPublicacion = lecScanner.nextInt();
			lecScanner.nextLine();
		} catch (NoSuchElementException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}catch (IllegalStateException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		} catch (Exception e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}
		
		return idPublicacion;
		
	}
	
	/*MODIFICAR DATOS*/
	public static perfil pedirIDPerfilModificar() {
		
		perfil miPerfil;
		int idperfil = 0;
		
		Scanner lecScanner = new Scanner(System.in);
		
		System.out.println("________________________________________________________________________________________");
		System.out.print("Selecione el ID del perfil a modificar:");
		
		try {
			idperfil = lecScanner.nextInt();
			lecScanner.nextLine();
		} catch (NoSuchElementException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}catch (IllegalStateException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		} catch (Exception e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}

		miPerfil = pedirDatosPerfil();
		miPerfil.setIdperfil(idperfil);
		
		return miPerfil;
	}

	public static publicaciones pedirIDPublicacionModificar() {
		
		publicaciones miPublicaciones;
		int idpublicacion = 0;
		
		Scanner lecScanner = new Scanner(System.in);
		
		System.out.println("________________________________________________________________________________________");
		System.out.print("Selecione el ID de la publicación a modificar:");
		
		try {
			idpublicacion = lecScanner.nextInt();
			lecScanner.nextLine();
		} catch (NoSuchElementException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}catch (IllegalStateException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		} catch (Exception e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}

		miPublicaciones = pedirDatosPublicaciones();
		miPublicaciones.setIdpublicaciones(idpublicacion);
		
		return miPublicaciones;
	}
	
	/*QUERYS*/
	public static String pedirUsuarioPerfil() {
		
		String usuarioPerfil = null;
		
		Scanner lecScanner = new Scanner(System.in);
		
		System.out.println("________________________________________________________________________________________");
		System.out.print("Selecione el nombre de usuario del perfil:");
		
		try {
			usuarioPerfil = lecScanner.nextLine();
		} catch (NoSuchElementException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}catch (IllegalStateException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		} catch (Exception e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}
		
		return usuarioPerfil;
		
	}
	
	public static String pedirFechaPublicaciones() {
		
		String fecha = null;
		
		Scanner lecScanner = new Scanner(System.in);
		
		System.out.println("________________________________________________________________________________________");
		System.out.print("Selecione la fecha de publicacion:");
		
		try {
			fecha = lecScanner.nextLine();
		} catch (NoSuchElementException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}catch (IllegalStateException e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		} catch (Exception e) {
			System.out.println();
			System.out.println("Error: " +e.getMessage());
		}
		
		return fecha;
		
	}

}
