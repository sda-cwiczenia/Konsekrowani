package konsekrowani.dao;

import konsekrowani.Etap;
import konsekrowani.EtapWspolnotowy;
import konsekrowani.Konsekrowany;

import java.util.ArrayList;
import java.util.List;

public class BazaDanych {

    private List<Konsekrowany> listaKonsekrowanych = new ArrayList<>();

    public BazaDanych() {
        Konsekrowany konsekrowany1 = new Konsekrowany("Tomek", "Parzecki", "Puebla", 1992, 12, 25);
        Konsekrowany konsekrowany2 = new Konsekrowany("Anna", "Maria", "Roma", 2022, 11, 16);
        Konsekrowany konsekrowany3 = new Konsekrowany("Pablo", "Garcia", "Nowy Radzic", 1980, 6, 13);
        Konsekrowany konsekrowany4 = new Konsekrowany("Franceska", "Gagliardi", "Roma", 1965, 5, 17);

        konsekrowany1.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.ENTRATA, 1992, 5, 25));
        konsekrowany1.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RICHIESTA, 1992, 7, 25));
        konsekrowany1.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.PRIMIVOTI, 1994, 6, 20));
        konsekrowany1.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RINNOVO, 1997, 6, 20));
        konsekrowany1.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.VOTI_PERPETUI, 2000, 5, 14));

        konsekrowany2.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.ENTRATA, 1995, 3, 14));
        konsekrowany2.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RICHIESTA, 1995, 5, 14));
        konsekrowany2.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.PRIMIVOTI, 1997, 6, 20));
        konsekrowany2.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RINNOVO, 2000, 7, 24));
        konsekrowany2.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.VOTI_PERPETUI, 2003, 8, 15));

        konsekrowany3.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.ENTRATA, 1998, 1, 1));
        konsekrowany3.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RICHIESTA, 1998, 3, 13));
        konsekrowany3.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.PRIMIVOTI, 2000, 5, 23));
        konsekrowany3.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RINNOVO, 2003, 5, 18));
        konsekrowany3.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.VOTI_PERPETUI, 2006, 8, 15));

        konsekrowany4.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.ENTRATA, 1985, 07, 20));
        konsekrowany4.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RICHIESTA, 1985, 10, 29));
        konsekrowany4.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.PRIMIVOTI, 1986, 8, 5));
        konsekrowany4.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RINNOVO, 1989, 9, 14));
        konsekrowany4.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.VOTI_PERPETUI, 1992, 8, 15));

        listaKonsekrowanych.add(konsekrowany1);
        listaKonsekrowanych.add(konsekrowany2);
        listaKonsekrowanych.add(konsekrowany3);
        listaKonsekrowanych.add(konsekrowany4);
    }

    public List<Konsekrowany> findAll() {
        return listaKonsekrowanych;
    }
}
