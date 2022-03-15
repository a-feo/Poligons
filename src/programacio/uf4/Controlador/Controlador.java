package programacio.uf4.Controlador;

import programacio.uf4.Model.*;

import java.util.Scanner;

public class Controlador {
    static Scanner scan = new Scanner(System.in);

    public static void mainMenu() {
        int option;

        do {
            System.out.println("\n1. Afegir polígon regular");
            System.out.println("2. Afegir quadrat");
            System.out.println("3. Afegir rectangle");
            System.out.println("4. Afegir triangle");
            System.out.println("5. Afegir trapezi");
            System.out.println("6. Afegir rombe");
            System.out.println("7. Mostrar tots els polígons");
            System.out.println("8. Ordenar llista");
            System.out.println("9. Netejar llista");
            System.out.print("0. Sortir\n> ");

            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 0 -> System.out.println("\nSortint...");
                case 1 -> afegirPoligonRegular();
                case 2 -> afegirQuadrat();
                case 3 -> afegirRectangle();
                case 4 -> afegirTriangle();
                case 5 -> afegirTrapezi();
                case 6 -> afegirRombe();
                case 7 -> showLlista();
                case 8 -> ordenarLlista();
                case 9 -> clearLlista();
                default -> System.out.println("\nAquesta opció no existeix");
            }

        } while (option != 0);

        System.exit(0);
    }

    public static void afegirPoligonRegular() {
        String nom;
        int nCostats;
        float lCostat, apotema;

        // Introducció de dades per teclat
        System.out.print("\nIntrodueix el nom > ");
        nom = scan.nextLine();
        System.out.print("Introdueix el nombre de costats > ");
        nCostats = scan.nextInt();
        scan.nextLine();
        System.out.print("Introdueix la longitud dels costats > ");
        lCostat = scan.nextFloat();
        scan.nextLine();
        System.out.print("Introdueix l'apotema > ");
        apotema = scan.nextFloat();
        scan.nextLine();

        // Crear nou polígon regular i afegir-lo a la llista de polígons
        LlistaPoligons.llista.add(new PoligonRegular(nom, nCostats, lCostat, apotema));
    }

    public static void afegirQuadrat() {
        float lCostat;

        // Introducció de dades per teclat
        System.out.print("\nIntrodueix la longitud dels costats > ");
        lCostat = scan.nextFloat();
        scan.nextLine();

        // Crear nou quadrat i afegir-lo a la llista de polígons
        LlistaPoligons.llista.add(new Quadrat(lCostat));
    }

    public static void afegirRectangle() {
        float base, altura;

        // Introducció de dades per teclat
        System.out.print("\nIntrodueix la base > ");
        base = scan.nextInt();
        scan.nextLine();
        System.out.print("Introdueix l'altura > ");
        altura = scan.nextFloat();
        scan.nextLine();

        // Crear nou rectangle i afegir-lo a la llista de polígons
        LlistaPoligons.llista.add(new Rectangle(base, altura));
    }

    public static void afegirTriangle() {
        float base, altura;

        // Introducció de dades per teclat
        System.out.print("\nIntrodueix la base > ");
        base = scan.nextInt();
        scan.nextLine();
        System.out.print("Introdueix l'altura > ");
        altura = scan.nextFloat();
        scan.nextLine();

        // Crear nou triangle i afegir-lo a la llista de polígons
        LlistaPoligons.llista.add(new Triangle(base, altura));
    }

    public static void afegirTrapezi() {
        float bMajor, bMenor, altura;

        // Introducció de dades per teclat
        System.out.print("Introdueix la base menor > ");
        bMenor = scan.nextInt();
        scan.nextLine();
        System.out.print("Introdueix la base major > ");
        bMajor = scan.nextFloat();
        scan.nextLine();
        System.out.print("Introdueix l'altura > ");
        altura = scan.nextFloat();
        scan.nextLine();

        // Crear nou trapezi i afegir-lo a la llista de polígons
        LlistaPoligons.llista.add(new Trapezi(bMajor, bMenor, altura));
    }

    public static void afegirRombe() {
        float dMenor, dMajor;

        // Introducció de dades per teclat
        System.out.print("Introdueix la base menor > ");
        dMenor = scan.nextInt();
        scan.nextLine();
        System.out.print("Introdueix la base major > ");
        dMajor = scan.nextFloat();
        scan.nextLine();

        // Crear nou rombe i afegir-lo a la llista de polígons
        LlistaPoligons.llista.add(new Rombe(dMajor, dMenor));
    }

    public static void showLlista() {
        if (llistaEstaBuida()) return;
        System.out.println("\nLlistat de polígons:");
        for (Poligon poligon : LlistaPoligons.llista) {
            System.out.println(poligon);
        }
    }

    public static void ordenarLlista() {
        if (llistaEstaBuida()) return;
        LlistaPoligons.llista.sort(Poligon::compareTo);
    }

    public static void clearLlista() {
        if (llistaEstaBuida()) return;
        LlistaPoligons.llista.clear();
    }

    public static boolean llistaEstaBuida() {
        if (LlistaPoligons.llista.isEmpty()) {
            System.out.println("\nLa llista de polígons està buida");
            return true;
        }
        return false;
    }
}
