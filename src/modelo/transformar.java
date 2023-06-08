package modelo;

public class transformar {
	
	/*TRANSFORMAR*/
	public static String transformarASQLPerfil(perfil miPerfil) {
		
		String sql;
		
		sql = "INSERT INTO perfil (idperfil, nombre, correoelectronico, contraseña, nombreusuario, biografia, detallescontacto, imagenperfilurl) "
				+ "VALUES (NULL,'" + miPerfil.getNombre()  + "', '" + miPerfil.getCorreoelectronico()  + "', '" + miPerfil.getContraseña()+ "', '" + miPerfil.getNombreusuario()    
				+ "', '" + miPerfil.getBiografia() + "', '" + miPerfil.getDetallescontacto() + "', '" + miPerfil.getImagenperfilurl()+ "')";

		return sql;
	}
	
	public static String transformarASQLPublicaciones(publicaciones miPublicaciones) {
		
		String sql;
		
		sql = "INSERT INTO publicaciones (idpublicaciones, fecha, hastags, contenidopublicacionurl) "
				+ "VALUES (NULL,'" + miPublicaciones.getFecha()  + "', '" + miPublicaciones.getHastags()  + "', '" + miPublicaciones.getContenidopublicacionurl() + "')";

		return sql;
	}
	
	public static String transformarASQLPerfilPublicaciones(publica miPublica) {
		
		String sql;
		
		sql = "INSERT INTO perfil_has_publicaciones (perfil_idperfil, publicaciones_idpublicaciones) "
				+ "VALUES ('" + miPublica.getPerfil_idperfil() + "', '" + miPublica.getPublicaciones_idpublicaciones()+ "')";

		return sql;
	}
	
	/*ELIMINAR*/
	public static String eliminarSQLPerfil1(int id) {
		
		String sql;
		
		sql = "DELETE FROM perfil_has_publicaciones WHERE perfil_idperfil = " + id +";";
		
		return sql;
	}

	public static String eliminarSQLPerfil(int id) {
		
		String sql;
		
		eliminarSQLPerfil1(id);
		
		sql = "DELETE FROM perfil WHERE idperfil = " + id +";";
		
		return sql;
	}
	
	
 	public static String eliminarSQLPublicaciones1(int id) {
		
	String sql;
	
	sql = "DELETE FROM perfil_has_publicaciones "
			+ "		WHERE publicaciones_idpublicaciones = " + id + ";";
	
	return sql;
	}

	public static String eliminarSQLPublicaciones(int id) {
		
		String sql;
			
		sql = "DELETE FROM publicaciones WHERE idpublicaciones = " + id +";";

		return sql;	
	}
	
	/*MODIFICAR*/
	public static String modificarSQLPerfil(perfil miPerfil) {
		
		String sql;
		
		sql = "UPDATE perfil SET"
				+ " nombre = '" + miPerfil.getNombre()
				+ "', correoelectronico = '" + miPerfil.getCorreoelectronico()
				+ "', contraseña = '" + miPerfil.getContraseña()
				+ "', nombreusuario = '" + miPerfil.getNombreusuario()
				+ "', biografia = '" + miPerfil.getBiografia()
				+ "', detallescontacto = '" + miPerfil.getDetallescontacto()
				+ "', imagenperfilurl = '" + miPerfil.getImagenperfilurl()
				+ "' WHERE idperfil = " + miPerfil.getIdperfil()+";";

		return sql;
	}
	
	public static String modificarSQLPublicaciones(publicaciones miPublicaciones) {
		
		String sql;
		
		sql = "UPDATE publicaciones SET"
				+ " fecha = '" + miPublicaciones.getFecha()
				+ "', hastags = '" + miPublicaciones.getHastags()
				+ "', contenidopublicacionurl	 = '" + miPublicaciones.getContenidopublicacionurl()
				+ "' WHERE idpublicaciones = " + miPublicaciones.getIdpublicaciones() +";";

		return sql;
	}

	/*QUERYS*/

	public static String insertarIDs(int idPerfil) {
		String sql;
		String ultimoIDPublicaciones;
		
		//sql = "SELECT * FROM publicaciones WHERE nombreusuario = '" + usuario + "';";
		ultimoIDPublicaciones = "SELECT max(idpublicaciones) FROM publicaciones;";
		
		sql = "INSERT INTO perfil_has_publicaciones VALUES (NULL, idPerfil,ultimoIDPublicaciones)";
		/*INSERT INTO tablat1t2 VALUES ()*/

		return sql;
	 }	 
	
	public static String ultimoIDPublicacion() {
		String ultimoIDPublicaciones;
		
		//sql = "SELECT * FROM publicaciones WHERE nombreusuario = '" + usuario + "';";
		ultimoIDPublicaciones = "SELECT max(idpublicaciones) FROM publicaciones;";
		
		/*INSERT INTO tablat1t2 VALUES ()*/

		return ultimoIDPublicaciones;	
	 }
	
	public static String ultimoIDPerfil() {
		String ultimoIDPerfil;
		
		//sql = "SELECT * FROM publicaciones WHERE nombreusuario = '" + usuario + "';";
		ultimoIDPerfil = "SELECT max(idperfil) FROM perfil;";
		
		/*INSERT INTO tablat1t2 VALUES ()*/

		return ultimoIDPerfil;	
	 }	
	
	public static String mostrarDatosPerfil() {
		String sql;
		
		//sql = "SELECT * FROM publicaciones WHERE nombreusuario = '" + usuario + "';";
		sql = "SELECT * FROM perfil;";

		return sql;
	}
	
	public static String mostrarDatosPublicaciones() {
		String sql;
		
		//sql = "SELECT * FROM publicaciones WHERE nombreusuario = '" + usuario + "';";
		sql = "SELECT * FROM publicaciones;";

		return sql;
	}
	
	public static String buscarNombreUsuario(String usuario) {
		String sql;
		
		//sql = "SELECT * FROM publicaciones WHERE nombreusuario = '" + usuario + "';";
		sql = "SELECT * FROM publicaciones WHERE idpublicaciones IN (SELECT publicaciones_idpublicaciones FROM perfil_has_publicaciones "
				+ "WHERE perfil_idperfil IN "
				+ "(SELECT idperfil FROM perfil "
				+ "WHERE nombreusuario = '" + usuario + "'));";

		return sql;
	}

	public static String buscarFechaPublicacion(String fecha) {
		String sql;
		
		//sql = "SELECT * FROM publicaciones WHERE nombreusuario = '" + usuario + "';";
		sql = "SELECT * FROM perfil WHERE idperfil IN (SELECT perfil_idperfil FROM perfil_has_publicaciones "
				+ "WHERE publicaciones_idpublicaciones IN "
				+ "(SELECT idpublicaciones FROM publicaciones "
				+ "WHERE fecha = '" + fecha + "'));";

		return sql;
	}
	
	public static String cantidaPerfiles() {
		String sql;
		
		//sql = "SELECT * FROM publicaciones WHERE nombreusuario = '" + usuario + "';";
		sql = "SELECT count(*) FROM perfil";

		return sql;
	}

	public static String hastagMasUsado() {
		String sql;
		
		//sql = "SELECT * FROM publicaciones WHERE nombreusuario = '" + usuario + "';";
		sql = "SELECT hastags FROM publicaciones GROUP BY hastags ORDER BY count(hastags) DESC; ";

		return sql;
		
	}
		
	public static String perfilesSinPublicacion() {
		String sql;
		
		//sql = "SELECT * FROM publicaciones WHERE nombreusuario = '" + usuario + "';";
		sql = "SELECT * FROM perfil "
				+ "LEFT JOIN perfil_has_publicaciones ON perfil.idperfil = perfil_has_publicaciones.perfil_idperfil "
				+ "WHERE perfil_has_publicaciones.perfil_idperfil IS  NULL;";

		return sql;
		
	}
	
}
