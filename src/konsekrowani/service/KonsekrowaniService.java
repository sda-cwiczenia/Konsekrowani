package konsekrowani.service;

import konsekrowani.EtapWspolnotowy;
import konsekrowani.Konsekrowany;
import konsekrowani.dao.BazaDanych;

import java.time.LocalDate;

public class KonsekrowaniService {

    private static BazaDanych bazaDanych;

    public KonsekrowaniService() {
        bazaDanych = new BazaDanych();
    }

    public void wyswietlWszystkichKonsekrowanych() {
        System.out.println("Lidat konekrowanych:");
        System.out.println("***********************");
        for(Konsekrowany konsekrowany : bazaDanych.findAll()) {
            System.out.println(konsekrowany.getFirstName() + " " +konsekrowany.getLastName() +
                    " Oaza "+konsekrowany.getOasis());
            for(EtapWspolnotowy etapWspolnotowy: konsekrowany.getListaEtapowWspolnotowych()) {
                System.out.println(etapWspolnotowy.getNazwaEtapu()+ " " + etapWspolnotowy.getDataEtapu());
            }
        }
    }

    public void znajdzUrodziny() {
        System.out.println("Dziś mają urodziny: ");
        LocalDate dzisiejszaData = LocalDate.now();
        boolean ktosMaDzisUrodziny = false;

        for (Konsekrowany konsekrowany: bazaDanych.findAll()) {
            if (konsekrowany.getBirthday().equals(dzisiejszaData)) {
                System.out.println(konsekrowany.getFirstName()+" "+konsekrowany.getLastName()+ "ma dziś urodziny");
                ktosMaDzisUrodziny = true;
            }
        }
        if (!ktosMaDzisUrodziny) {
            System.out.println("Dziś nikt nie ma urodzin");
        }
    }
}
