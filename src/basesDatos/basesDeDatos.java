package basesDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.publica;

public class basesDeDatos {
	
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_BLUE = "\033[34m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	/*SUBIR A LA BASE DE DATOS*/
	public static void subirABase(String sql){
		
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int resultado=0;
		int propietario = 1;
		

		try {
			// conectar con la base de datos
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja10", "root", "");// proporcionamos
																										// la
																										// dirección, el
																										// administrador
																										// y
																										// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			
			//sql = "INSERT INTO `propietarios` (`idpropietario`, `nombre`) VALUES (NULL, '" + nombrePropietario + "')";
			//sql = "INSERT INTO `pisos` (`idpiso`, `fidpropietario`, `direccion`, `m2`) VALUES (NULL, '"+nPropietario+"', '"+calle+"', '"+m2+"')";
			
			// System.out.println(sql);

			resultado = sentenciaSQL.executeUpdate(sql);

			if (resultado >= 1) {
				//System.out.println("Se ha insertado bien.");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//System.out.println("Conectado/desconectado");

	}

	/*ELIMINAR DE LA BASE DE DATOS*/
	public static void eliminarBases(String sql) {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int resultado=0;
		int propietario = 1;

		try {
			// conectar con la base de datos
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja10", "root", "");// proporcionamos
																										// la
																										// dirección, el
																										// administrador
																										// y
																										// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			
			//sql = "INSERT INTO `propietarios` (`idpropietario`, `nombre`) VALUES (NULL, '" + nombrePropietario + "')";
			//sql = "INSERT INTO `pisos` (`idpiso`, `fidpropietario`, `direccion`, `m2`) VALUES (NULL, '"+nPropietario+"', '"+calle+"', '"+m2+"')";
			
			// System.out.println(sql);

			resultado = sentenciaSQL.executeUpdate(sql);

			if (resultado >= 1) {
				System.out.println();
				//System.out.println("Se ha eliminado correctamente");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//System.out.println("Conectado/desconectado");

	}

	/*MODIFICAR LA BASE DE DATOS*/
	public static void modificarBase(String sql) {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int resultado=0;
		int propietario = 1;

		try {
			// conectar con la base de datos
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja10", "root", "");// proporcionamos
																										// la
																										// dirección, el
																										// administrador
																										// y
																										// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			
			//sql = "INSERT INTO `propietarios` (`idpropietario`, `nombre`) VALUES (NULL, '" + nombrePropietario + "')";
			//sql = "INSERT INTO `pisos` (`idpiso`, `fidpropietario`, `direccion`, `m2`) VALUES (NULL, '"+nPropietario+"', '"+calle+"', '"+m2+"')";
			
			// System.out.println(sql);

			resultado = sentenciaSQL.executeUpdate(sql);

			if (resultado >= 1) {
				System.out.println();
				//System.out.println("Se ha insertado bien.");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//System.out.println("Conectado/desconectado");

	}

	/*MOSTRAR TABLAS*/
	public static void mostrarTablaPublicaciones(String sql){

		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int propietario = 1;
		

		try {
			// conectar con la base de datos
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja10", "root", "");// proporcionamos la
																									// dirección, el
																									// administrador y
																									// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			//sql = "SELECT * FROM peliculas";
			// System.out.println(sql);

			rs = sentenciaSQL.executeQuery(sql);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			while (rs.next()) {
				// Si hay resultados obtengo el valor.

				System.out.println(ANSI_BLUE+"ID: "+ ANSI_RESET + rs.getString("idpublicaciones") +ANSI_BLUE+" 	Fecha: "+ ANSI_RESET + rs.getString("fecha") +"       "+ ANSI_BLUE + " Hastags: " + ANSI_RESET + rs.getString("hastags") + ANSI_BLUE + " 	Fotografia: " + ANSI_RESET + rs.getString("contenidopublicacionurl"));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//System.out.println("Conectado/desconectado");
		
	}
	
	public static void mostrarTablaPerfil(String sql){

		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int propietario = 1;
		

		try {
			// conectar con la base de datos
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja10", "root", "");// proporcionamos la
																									// dirección, el
																									// administrador y
																									// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			//sql = "SELECT * FROM peliculas";
			// System.out.println(sql);

			rs = sentenciaSQL.executeQuery(sql);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			while (rs.next()) {
				// Si hay resultados obtengo el valor.

				System.out.println(ANSI_BLUE+"ID: "+ ANSI_RESET + rs.getString("idperfil") +ANSI_BLUE+" 	Nombre: "+ ANSI_RESET + rs.getString("nombre") +"      	 "+ ANSI_BLUE + " Nombre usuario: " + ANSI_RESET + rs.getString("nombreusuario"));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//System.out.println("Conectado/desconectado");
		
	}
	
	/*QUERYS*/
	public static void cantidadPerfiles(String sql){
		Connection conexion=null;
		Statement sentenciaSQL = null;
		int numero=0;
		
		try {
			//conectar con la base de datos
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja10",
					"root", "");// proporcionamos la dirección, el administrador y la clave
			
			//creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();
			
			//almaceno el resultado de la sql en un resulset (conjunto de registros)
			ResultSet rs  = sentenciaSQL.executeQuery(sql);
		     // chequeo que el result set no sea vacío, moviendo el cursor a la 
		     // primer fila. (El cursor inicia antes de la primer fila)
		     if(rs.next()) {
		       //Si hay resultados obtengo el valor. 
		        numero= rs.getInt(1);
		        System.out.println("Hay un total de "+numero+" perfiles");
		     }
			
		} catch (SQLException ex) {
			ex.printStackTrace();
			//System.out.println("Error");
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//System.out.println("Conectado/desconectado");
	}

	public static void mostrarNombreHastag(String sql) {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int propietario = 1;
		

		try {
			// conectar con la base de datos
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja10", "root", "");// proporcionamos la
																									// dirección, el
																									// administrador y
																									// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			//sql = "SELECT * FROM peliculas";
			// System.out.println(sql);

			rs = sentenciaSQL.executeQuery(sql);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			System.out.println("Hastags ordenados de mayor a menor");
			System.out.println();
			while (rs.next()) {
				// Si hay resultados obtengo el valor.
				System.out.println( ANSI_BLUE + "Hastags: " + ANSI_RESET + rs.getString("hastags"));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//System.out.println("Conectado/desconectado");
	}
	
	public static int ultimoID(String sql) {
		Connection conexion=null;
		Statement sentenciaSQL = null;
		int numero=0;
		
		try {
			//conectar con la base de datos
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja10",
					"root", "");// proporcionamos la dirección, el administrador y la clave
			
			//creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();
			
			//almaceno el resultado de la sql en un resulset (conjunto de registros)
			ResultSet rs  = sentenciaSQL.executeQuery(sql);
		     // chequeo que el result set no sea vacío, moviendo el cursor a la 
		     // primer fila. (El cursor inicia antes de la primer fila)
		     if(rs.next()) {
		       //Si hay resultados obtengo el valor. 
		        numero= rs.getInt(1);
		        //System.out.println("Hay un total de "+numero+" perfiles");
		     }
			
		} catch (SQLException ex) {
			ex.printStackTrace();
			//System.out.println("Error");
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return numero;
	}
}
