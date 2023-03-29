
public class perfil {
	
	private int idperfil;
	private String nombre;
	private String correoelectronico;
	private String contraseña;
	private String nombreusuario;
	private String biografia;
	private String detallescontacto;
	private String imagenperfilurl;
	
	public perfil(int idperfil, String nombre, String correoelectronico, String contraseña, String nombreusuario,
			String biografia, String detallescontacto, String imagenperfilurl) {
		super();
		this.idperfil = idperfil;
		this.nombre = nombre;
		this.correoelectronico = correoelectronico;
		this.contraseña = contraseña;
		this.nombreusuario = nombreusuario;
		this.biografia = biografia;
		this.detallescontacto = detallescontacto;
		this.imagenperfilurl = imagenperfilurl;
	}
	public int getIdperfil() {
		return idperfil;
	}
	public void setIdperfil(int idperfil) {
		this.idperfil = idperfil;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreoelectronico() {
		return correoelectronico;
	}
	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getNombreusuario() {
		return nombreusuario;
	}
	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}
	public String getBiografia() {
		return biografia;
	}
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	public String getDetallescontacto() {
		return detallescontacto;
	}
	public void setDetallescontacto(String detallescontacto) {
		this.detallescontacto = detallescontacto;
	}
	public String getImagenperfilurl() {
		return imagenperfilurl;
	}
	public void setImagenperfilurl(String imagenperfilurl) {
		this.imagenperfilurl = imagenperfilurl;
	}
	@Override
	public String toString() {
		return "perfil [idperfil=" + idperfil + ", nombre=" + nombre + ", correoelectronico=" + correoelectronico
				+ ", contraseña=" + contraseña + ", nombreusuario=" + nombreusuario + ", biografia=" + biografia
				+ ", detallescontacto=" + detallescontacto + ", imagenperfilurl=" + imagenperfilurl + "]";
	}
	
	
}
