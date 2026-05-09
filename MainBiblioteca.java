import java.util.Scanner;

public class MainBiblioteca {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        biblioteca biblioteca = new biblioteca();
        GestorBiblioteca gestor = new GestorBiblioteca();

        biblioteca.afegirLlibre(new LlibreBiblioteca("1984", "George Orwell"));
        biblioteca.afegirLlibre(new LlibreBiblioteca("El petit príncep", "Antoine de Saint-Exupéry"));

        String opcio = "";

        while (!opcio.equals("0")) {
            System.out.println("-- MENÚ DE LA BIBLIOTECA --");
            System.out.println("1. Afegir llibre");
            System.out.println("2. Llistar llibres");
            System.out.println("3. Prestar llibre");
            System.out.println("4. Estadístiques");
            System.out.println("0. Sortir");
            System.out.print("Selecciona una opció: ");
            opcio = teclat.nextLine();

            if (opcio.equals("1")) {
                System.out.print("Títol del llibre: ");
                String titol = teclat.nextLine();
                System.out.print("Autor del llibre: ");
                String autor = teclat.nextLine();
                
                LlibreBiblioteca nouLlibre = new LlibreBiblioteca(titol, autor, null);
                biblioteca.afegirLlibre(nouLlibre); 
                System.out.println("Llibre afegit correctament.");

            } else if (opcio.equals("2")) {
                System.out.println("Llibres a la biblioteca:");
                for (LlibreBiblioteca l : biblioteca.getLlibres()) { 
                    System.out.println("- " + l.toString()); 
                }

            } else if (opcio.equals("3")) {
                System.out.print("Nom de l'usuari: ");
                String nomUsuari = teclat.nextLine();
                System.out.print("ID de l'usuari: ");
                String idUsuari = teclat.nextLine();
                System.out.print("Correu de l'usuari: ");
                String correuUsuari = teclat.nextLine();

                
                UsuariBiblioteca usuari = new UsuariBiblioteca(idUsuari, correuUsuari, nomUsuari);

                System.out.print("Títol del llibre a prestar: ");
                String titolLlibre = teclat.nextLine();

                
                LlibreBiblioteca llibreABuscar = biblioteca.buscarLlibre(titolLlibre);

                if (llibreABuscar != null) {
                    gestor.prestarLlibre(usuari, llibreABuscar);
                } else {
                    System.out.println("El llibre no s'ha trobat.");
                }

            } else if (opcio.equals("4")) {
               
                gestor.mostrarEstadistiques();

            } else if (opcio.equals("0")) {
                System.out.println("Fins la pròxima, Adéuuuu!");
            } else {
                System.out.println("Opció no vàlida.");
            }
        }
        teclat.close();
    }
}