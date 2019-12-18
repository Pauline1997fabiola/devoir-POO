package umlProjet;

public class Porte {
	Integer numeroDePorte;

	public Porte(Integer numeroDePorte) {
		this.numeroDePorte=numeroDePorte;
	}
	
	public String toString() {
		return (""+numeroDePorte);
	}
	
	public Integer getnumeroDePorte() {
		return numeroDePorte;
	}
	public void setnumeroDePorte(Integer numeroDePorte) {
		this.numeroDePorte =numeroDePorte ;
	}
}
