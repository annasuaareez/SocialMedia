package modelo;

public class publica {
	
	private int perfil_idperfil;
	private int publicaciones_idpublicaciones;
	
	public publica(int perfil_idperfil, int publicaciones_idpublicaciones) {
		super();
		this.perfil_idperfil = perfil_idperfil;
		this.publicaciones_idpublicaciones = publicaciones_idpublicaciones;
	}
	public int getPerfil_idperfil() {
		return perfil_idperfil;
	}
	public void setPerfil_idperfil(int perfil_idperfil) {
		this.perfil_idperfil = perfil_idperfil;
	}
	public int getPublicaciones_idpublicaciones() {
		return publicaciones_idpublicaciones;
	}
	public void setPublicaciones_idpublicaciones(int publicaciones_idpublicaciones) {
		this.publicaciones_idpublicaciones = publicaciones_idpublicaciones;
	}
	@Override
	public String toString() {
		return "publica [perfil_idperfil=" + perfil_idperfil + ", publicaciones_idpublicaciones="
				+ publicaciones_idpublicaciones + "]";
	}
	
}
