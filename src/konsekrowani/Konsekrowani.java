package konsekrowani;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import static konsekrowani.Konsekrowany.*;


public class Konsekrowani {
    static int miesiac;
    static int rok;
    static int dzien;
    static int rok1;
    static int miesiac1;
    static int dzien1;

    /*
    Poczatek Programu daje uzytkownikowi albo wejsc w menu glowne,  wyjsc z programu, albo ponownie wybrac jedna z dwoch opcji w przypadku wyboru zlej
     */
    public static void main(String[] args) {
        poczatekProgramu();
    }

    public static void programGlowny() {
        Scanner scanner = new Scanner(System.in);
        // krotkaInstukcjaDoProgramuGlownego();
        System.out.println("Podaj numer (1-5)");
        String numer1 = "Wyswietl wszystkich konsekrowanych";
        String numer2 = "znajdz wydarzenie po dacie";
        String numer3 = "czy dzisiaj ktoś ma urodziny?";
        String numer4 = "Konsekrowani z tej samej oazy ";
        String numer5 = "ile dni minelo od wejscia do slubow wieczystych";
        int numer = scanner.nextInt();
        if (numer == 0) {
            System.out.println("Wciskajac 0 opuszczasz program");
            coChceszZrobic();
        }
        if (numer > 5) {
            do {
                krotkaInstukcjaDoProgramuGlownego();
                if (numer == 0) {
                    coChceszZrobic();
                } else {
                    programGlowny();
                }
                numer = scanner.nextInt();
            } while (numer > 5);
        } else {

            switch (numer) {
                case 1:
                    System.out.println(numer1);
                    wyswietlWszystkichKonsekrowanych();
                    coChceszZrobic();
                    break;

                case 2:
                    System.out.println(numer2);
                    znajdzWydarzeniePoDacie();
                    coChceszZrobic();
                    break;

                case 3:
                    System.out.println(numer3);
                    czyDzisiajKtosMaUrodziny();
                    coChceszZrobic();
                    break;

                case 4:
                    System.out.println(numer4);
                    ktoJestZTejSamejOazy();
                    coChceszZrobic();
                    break;

                case 5:
                    System.out.println(numer5);
                    ileDniMineloOdWejsciaDoSlubowWieczystych();
                    coChceszZrobic();
            }
        }
    }

    private static void krotkaInstukcjaDoProgramuGlownego() {
        System.out.println("Za chwile zostaniesz poproszony o wpisanie liczby z zakresu od 1 do 5 w przypadku wpisania innego znaku niz liczba program zakonczy sie" +
                " wpisujac zero bedziesz mogl wyjsc z programu ");
    }

    public static void zamykanieProgramu() {
        Scanner scanner = new Scanner(System.in);
        String dostepnaOpcja;
        System.out.println("Wybierajac 0 opuszczasz program");
        System.out.println("Czy na pewno chcesz wyjsc (T/N)");
        String odpowiedz = scanner.nextLine();
        if (odpowiedz.equals("T")) {
            System.exit(Integer.parseInt("0"));
            if (odpowiedz.equals("N")) {
                programGlowny();
            }
        }
    }

    public static void wejdzDoMenu() {
        System.out.println("Witaj w Menu Glownym");
        System.out.println("Wcisnij 1 - Wyswietl wszystkich konsekrowanych");
        System.out.println("Wcisnij 2 - znajdz wydarzenie po dacie");
        System.out.println("Wcisnij 3 - czy dzisiaj ktoś ma urodziny?");
        System.out.println("Wcisnij 4 - Konsekrowani z tej samej oazy ");
        System.out.println("Wcisnij 5 - ile dni minelo od wejscia do slubow wieczystych");
    }

    public static void coChceszZrobic() {
        Scanner scanner = new Scanner(System.in);
        String dostepnaOpcja;
        System.out.println("Czy na pewno chcesz wyjsc (T/N)");
        String odpowiedz = scanner.nextLine();
        if (odpowiedz.equals("T")) {
            System.exit(Integer.parseInt("0"));
        }
        if (odpowiedz.equals("N")) {
            wejdzDoMenu();
            programGlowny();
        } else {
            do {
                System.out.println("Odpowiedz mozliwa to T lub N podaj wlasciwa");
                odpowiedz = scanner.nextLine();

            } while (!odpowiedz.equals("T") && (!odpowiedz.equals("N")));
        }
        if (odpowiedz.equals("T")) {
            System.exit(Integer.parseInt("0"));
        }
        if (odpowiedz.equals("N")) {
            wejdzDoMenu();
            programGlowny();

        }
    }

    public static void ileDniMineloOdWejsciaDoSlubowWieczystych() {
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

        EtapWspolnotowy entrata1 = konsekrowany1.listaEtapowWspolnotowych.get(0);
        System.out.println(entrata1);
        EtapWspolnotowy perpetui1 = konsekrowany1.listaEtapowWspolnotowych.get(4);
        System.out.println(perpetui1);
        System.out.println("******************");
        System.out.println("KOnsekrowany 2 = Anna Maria");
        EtapWspolnotowy entrata2 = konsekrowany2.listaEtapowWspolnotowych.get(0);
        System.out.println(entrata2);
        EtapWspolnotowy perpetui2 = konsekrowany2.listaEtapowWspolnotowych.get(4);
        System.out.println(perpetui2);
        System.out.println("***********************");
        System.out.println("KOnsekrowany 3 = Pablo Garcia");
        EtapWspolnotowy entrata3 = konsekrowany3.listaEtapowWspolnotowych.get(0);
        System.out.println(entrata3);
        EtapWspolnotowy perpetui3 = konsekrowany3.listaEtapowWspolnotowych.get(4);
        System.out.println(perpetui3);
        System.out.println("*****************");
        System.out.println("KOnsekrowany 4 = Francesca Gagliardi");
        EtapWspolnotowy entrata4 = konsekrowany4.listaEtapowWspolnotowych.get(0);
        System.out.println(entrata4);
        EtapWspolnotowy perpetui4 = konsekrowany4.listaEtapowWspolnotowych.get(4);
        System.out.println(perpetui4);
        System.out.println("******************");
        podpowiedz();
        ObliczIloscDniMiedzyEtapami();
    }


    public static void czyDzisiajKtosMaUrodziny() {
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
            if (!LocalDate.of(rok, miesiac, dzien).equals(konsekrowany.getBirthday())) {
                System.out.println("Tego dnia nikt nie ma urodzin ");
                System.out.println("Mozesz kontynuowac albo wyjsc");
                coChceszZrobic();
            }
            if (LocalDate.of(rok, miesiac, dzien).equals(konsekrowany.getBirthday())) {
                System.out.println(" dnia " + konsekrowany.getBirthday() + " " + konsekrowany.getFirstName() +
                        " " + konsekrowany.getLastName() + " ma urodziny ");
            }
            break;
        }
    }


    public static void ObliczIloscDniMiedzyEtapami() {
        pobierzDateWydarzenia();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj date wydarzenia 2 ");
        System.out.println("rok : ");
        rok1 = scanner1.nextInt();
        System.out.println("Miesiac : ");
        miesiac1 = scanner1.nextInt();
        System.out.println("dzien");
        dzien1 = scanner1.nextInt();

        LocalDate data1 = LocalDate.of(rok, miesiac, dzien);
        LocalDate data2 = LocalDate.of(rok1, miesiac1, dzien1);

        long period = ChronoUnit.DAYS.between(data1, data2);
        int liczbaDniWRoku = 365;
        long liczbaLat = (period / liczbaDniWRoku);
        System.out.println(" Liczba dni ktora minela od wejscia to " + period);
        System.out.println(" Jest to " + " " + " okolo " + " " + liczbaLat + " " + " lat ");

    }


    public static void podpowiedz() {
        System.out.println("SKorzystaj z podpowiedzi sa to informacje o datach konsekrowanych poszczegolnych etapow ");
        System.out.println("wpisz te daty by dowiedziec sie ile lat zajela osobie formacja od entraty do slubow wieczystych ");
        System.out.println("jako pierwsze wpisz rok dzien i miesiac daty entraty jako drugie date slubow wieczystych ");

    }

    public static void poczatekProgramu() {
        Scanner scanner = new Scanner(System.in);
        String dostepnaOpcja;
        System.out.println("Wcisnij 1 aby wejsc do Menu Glownego /wcisnij 0 by zakonczyc");
        dostepnaOpcja = scanner.nextLine();

        if (dostepnaOpcja.equals("0")) {
            zamykanieProgramu();
        }
        if (dostepnaOpcja.equals("1")) {
            wejdzDoMenu();
            programGlowny();
        } else
            do {
                System.out.println("Nie ma takiej opcji");
                coChceszZrobic();
            } while (!dostepnaOpcja.equals("0") && (!dostepnaOpcja.equals("1")));
    }

}
























