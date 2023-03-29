import java.time.LocalDate;

public class publicaciones {
	
	private int idpublicaciones;
	private LocalDate fecha;
	private String hastags;
	private String contenidopublicacionurl;
	
	public publicaciones(int idpublicaciones, LocalDate fecha, String hastags, String contenidopublicacionurl) {
		super();
		this.idpublicaciones = idpublicaciones;
		this.fecha = fecha;
		this.hastags = hastags;
		this.contenidopublicacionurl = contenidopublicacionurl;
	}

	public int getIdpublicaciones() {
		return idpublicaciones;
	}

	public void setIdpublicaciones(int idpublicaciones) {
		this.idpublicaciones = idpublicaciones;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getHastags() {
		return hastags;
	}

	public void setHastags(String hastags) {
		this.hastags = hastags;
	}

	public String getContenidopublicacionurl() {
		return contenidopublicacionurl;
	}

	public void setContenidopublicacionurl(String contenidopublicacionurl) {
		this.contenidopublicacionurl = contenidopublicacionurl;
	}

	@Override
	public String toString() {
		return "publicaciones [idpublicaciones=" + idpublicaciones + ", fecha=" + fecha + ", hastags=" + hastags
				+ ", contenidopublicacionurl=" + contenidopublicacionurl + "]";
	}	
	
}
