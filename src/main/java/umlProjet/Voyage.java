package umlProjet;

import java.math.BigDecimal;

public class Voyage extends Porte{

	public Voyage(Integer numeroDePorte) {
		super(numeroDePorte);
		// TODO Auto-generated constructor stub
	}

	Porte entree;
	BigDecimal tarif;
	Porte sortie;
	CompagnieAutoroute autoroute;

	public Porte getEntree() {
		return entree;
	}

	public void setEntree(Porte entree) {
		this.entree = entree;
	}

	public Porte getSortie() {
		return sortie;
	}

	public void setSortie( Porte sortie) {
		this.sortie = sortie;
	}
	public CompagnieAutoroute getAutoroute() {
		return autoroute;
	}
		public BigDecimal getTarif() {
			return tarif;
		}
	public void setAutoroute(CompagnieAutoroute autoroute) {
		this.autoroute = autoroute;
	}

	public void Voyage(Porte entree,Porte sortie,CompagnieAutoroute autoroute) {
		
	}
}
