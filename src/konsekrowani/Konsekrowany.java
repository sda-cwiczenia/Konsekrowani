package konsekrowani;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static konsekrowani.Konsekrowani.*;

public class Konsekrowany {
    private String firstName;
    private String lastName;
    private String oasis;
    private LocalDate birthday;
    List<EtapWspolnotowy> listaEtapowWspolnotowych;


    public Konsekrowany(String firstName, String lastname, String oasis, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.oasis = oasis;
        this.birthday = LocalDate.of(year, month, day);
        listaEtapowWspolnotowych = new ArrayList<>();//stworz mi pusta liste i przypisz do zmiennej

    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getOasis() {
        return oasis;
    }


    public void dodajEtapWspolnotowy(EtapWspolnotowy etapWspolnotowy) {//deklaruje ,,pole,, w metodzie jej argument przekazywany
        listaEtapowWspolnotowych.add(etapWspolnotowy);


    }

    public List<EtapWspolnotowy> getListaEtapowWspolnotowych() {
        return listaEtapowWspolnotowych;
    }

    @Override
    public String toString() {
        return "Konsekrowany{" +
                "\nfirstName='" + firstName + '\'' +
                ", \nlastName='" + lastName + '\'' +
                ", \noasis='" + oasis + '\'' +
                ", \nbirthday=" + birthday +
                ", \nlistaEtapowWspolnotowych=" + listaEtapowWspolnotowych +
                '}';
    }

    static void pobierzDateWydarzenia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj date wydarzenia ");
        System.out.print("rok : ");
        rok = scanner.nextInt();
        System.out.print("miesiac ");
        miesiac = scanner.nextInt();
        System.out.print("dzien ");
        dzien = scanner.nextInt();
    }

    static void wyswietlWszystkichKonsekrowanych() {
        Konsekrowany konsekrowany1 = new Konsekrowany("Tomek", "Parzecki", "Puebla", 1992, 12, 25);
        Konsekrowany konsekrowany2 = new Konsekrowany("Anna", "Maria", "Roma", 1979, 5, 20);
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

        List<Konsekrowany> listaKonsekrowanych = new ArrayList<>();
        listaKonsekrowanych.add(konsekrowany1);
        listaKonsekrowanych.add(konsekrowany2);
        listaKonsekrowanych.add(konsekrowany3);
        listaKonsekrowanych.add(konsekrowany4);
        for (Konsekrowany konsekrowany : listaKonsekrowanych) {
            System.out.println(" MOj konsekrowany to " + " " + konsekrowany.getFirstName() + konsekrowany.getLastName() + " " + " przebywa w oazie " +
                    " " + konsekrowany.getOasis() + " " + " jego data urodzenia to  " + konsekrowany.getBirthday() + " " +
                    " a jego etapy wspolnotowe to " + " " + konsekrowany.listaEtapowWspolnotowych);
            System.out.println("***********");
        }
    }



    public static void ktoJestZTejSamejOazy() {
        Konsekrowany konsekrowany1 = new Konsekrowany("Tomek", "Parzecki", "Puebla", 1992, 12, 25);
        Konsekrowany konsekrowany2 = new Konsekrowany("Anna", "Maria", "Roma", 1979, 5, 20);
        Konsekrowany konsekrowany3 = new Konsekrowany("Pablo", "Garcia", "Nowy Radzic", 1980, 6, 13);
        Konsekrowany konsekrowany4 = new Konsekrowany("Franceska", "Gagliardi", "Roma", 1965, 5, 17);

        List<Konsekrowany> listaKonsekrowanych = new ArrayList<>();
        listaKonsekrowanych.add(konsekrowany1);
        listaKonsekrowanych.add(konsekrowany2);
        listaKonsekrowanych.add(konsekrowany3);
        listaKonsekrowanych.add(konsekrowany4);
        Scanner scanner = new Scanner(System.in);
        String nazwaOazy;
        System.out.println("Podaj nazwe Oazy");
        nazwaOazy = scanner.nextLine();

        for (Konsekrowany konsekrowany : listaKonsekrowanych) {
            if (nazwaOazy.equals(konsekrowany.getOasis())) {
                System.out.println(" z oazy " + nazwaOazy + " sa " + " " + konsekrowany.getFirstName() + " " + konsekrowany.getLastName());
                    }
                }
            }
    public static void znajdzWydarzeniePoDacie() {
        pobierzDateWydarzenia();
        Konsekrowany konsekrowany1 = new Konsekrowany("Tomek", "Parzecki", "Puebla", 1992, 12, 25);
        Konsekrowany konsekrowany2 = new Konsekrowany("Anna", "Maria", "Roma", 1979, 5, 20);
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

        List<Konsekrowany> listaKonsekrowanych = new ArrayList<>();
        listaKonsekrowanych.add(konsekrowany1);
        listaKonsekrowanych.add(konsekrowany2);
        listaKonsekrowanych.add(konsekrowany3);
        listaKonsekrowanych.add(konsekrowany4);

        for (Konsekrowany konsekrowany : listaKonsekrowanych) {
            for (EtapWspolnotowy etapWspolnotowy : konsekrowany.listaEtapowWspolnotowych) {
                if ((LocalDate.of(rok, miesiac, dzien).equals(etapWspolnotowy.getDataEtapu()))) {
                    System.out.println(" dnia " + etapWspolnotowy.getDataEtapu() + " " + konsekrowany.getFirstName() +
                            " " + konsekrowany.getLastName() + " ma wydarzenie jakim jest " + etapWspolnotowy.getNazwaEtapu());

                }

            }
        }
    }
        }








