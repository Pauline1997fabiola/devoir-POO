package umlProjet;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Tarif extends Porte {
	
	 public Tarif(Integer numeroDePorte) {
		super(numeroDePorte);
		// TODO Auto-generated constructor stub
	}


	Porte entree;
		
		public Porte sortie;
		
		public LocalDateTime dateValidite;
		
		public BigDecimal prix;
		public void setEntree(Porte entree) {
			this.entree = entree;
		}
		
		public Porte getEntree() {
			return entree;
		}
		
		public void setdateValidite(LocalDateTime dateValidite) {
			this.dateValidite = dateValidite;
		}
		
		public Porte getdateValidite() {
			return entree;
		}
		
		public void setprix(BigDecimal prix) {
			this.prix = prix;
		}
		
		public Porte getprix() {
			return entree;
		}
		
		public void setSortie( Porte sortie) {
			this.sortie = sortie;
		}

		public Porte getSortie() {
			return sortie;
		}
	
	public String toString() {
		return "";
	}
	
	
}
