package umlProjet;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import umlProjet.Porte;



public class CompagnieAutoroute{

	public List<Route> routes= new ArrayList<Route>();
	public List<Tarif> tarifs = new ArrayList<Tarif>();
	//List<Tarif> tarifs=new ArrayList<Tarif>();
	

	/*public BigDecimal ObtenirTarif(Porte entree,Porte sortie) {
		BigDecimal a;
		return a;
	}*/

	private Tarif getTarifCalcule(Porte entree,Porte sortie) {
		Tarif result = new Tarif(entree.numeroDePorte);
	    ListIterator<Tarif> it = tarifs.listIterator();
	    it.set(result);
	     for(int i=entree.numeroDePorte;i<=sortie.numeroDePorte;i++) {
	    	 
	    	 result.prix = result.prix.add(it.next().prix);
	     }
	     return result;
	}

	private Tarif getTarifExacte(Porte entree,Porte sortie) {
		Tarif a=new Tarif(0);
			return a;
		}
	
	public void ajouter(Tarif tarif) {
		tarifs.add(tarif);
	}
	
	public void ajouterRoute(Route a) {
		
	}
}
