package umlProjet;

import java.util.Comparator;



public class OrdrePorteComparator extends Porte implements Comparator<Porte>{

	public OrdrePorteComparator(Integer numeroDePorte) {
		super(numeroDePorte);
		// TODO Auto-generated constructor stub
	}

	public int compare(Porte entree, Porte sortie) {
		return entree.numeroDePorte -entree.numeroDePorte;
	}
	
}
