package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import umlProjet.OrdrePorteComparator;
import umlProjet.Porte;
import umlProjet.PorteEntree;
import umlProjet.PorteSortie;

public class OrdrePorteComparatorTest {

	@Test
    void testCompare() {
        List<Porte> list = new ArrayList<Porte>();
        Porte p1 = new PorteEntree(1), p2 = new PorteSortie(2), p3 = new PorteEntree(3), p4 = new PorteSortie(4);

        list.add(p4);
        list.add(p3);
        list.add(p1);
        list.add(p2);

        Collections.sort(list, new OrdrePorteComparator(0));

        assertEquals("Vérification des items de la liste", 1, list.get(0).getnumeroDePorte());
        assertEquals("Vérification des items de la liste", Integer.valueOf(2), list.get(1).getnumeroDePorte());
        assertEquals("Vérification des items de la liste", Integer.valueOf(3), list.get(2).getnumeroDePorte());
        assertEquals("Vérification des items de la liste", Integer.valueOf(4), list.get(3).getnumeroDePorte());
    }

}
