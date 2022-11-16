package konsekrowani;

import konsekrowani.service.KonsekrowaniService;

import java.util.Scanner;

import static konsekrowani.Konsekrowany.*;

public class Main {

    private static KonsekrowaniService service;

    public static void main(String[] args) {

        service = new KonsekrowaniService();
        wyswietlMenu();
        Scanner scanner = new Scanner(System.in);
        // krotkaInstukcjaDoProgramuGlownego();
                int numer = scanner.nextInt();
        if (numer == 0) {
            System.out.println("Wciskajac 0 opuszczasz program");
        }

            switch (numer) {
                case 1:

                    System.out.println("Opca 1");
                    service.wyswietlWszystkichKonsekrowanych();
                    break;

                case 2:
                    System.out.println("Opcja 2");
                    break;

                case 3:
                    System.out.println("Opcja 3");
                    service.znajdzUrodziny();
                    break;

                case 4:
                    System.out.println("Opcja 4");
                    break;

                case 5:
                    System.out.println("Opcja 5");
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
                    wyswietlMenu();
            }
        }



    private static void wyswietlMenu() {
        System.out.println("1. Wyswietl wszystkich konsekrowanych");
        System.out.println("2. Znajdz wydarzenie po dacie");
        System.out.println("3. czy dzisiaj ktoś ma urodziny?");
        System.out.println("4. Konsekrowani z tej samej oazy");
        System.out.println("5. ile dni minelo od wejscia do slubow wieczystych");
        System.out.println("0. Wyjście z programu");
        System.out.println("----------------------------------");
        System.out.println("Wybierz opcje 1-5 lub 0 aby wyjść");

    }
}
