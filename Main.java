import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        GestorBiblioteca gestor = new GestorBiblioteca();

        biblioteca.afegirLlibre(new Llibre("1984", "George Orwell"));
        biblioteca.afegirLlibre(new Llibre("El petit príncep", "Antoine de Saint-Exupéry"));

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
                // Demanem les dades per crear un Llibre
                System.out.print("Títol del llibre: ");
                String titol = teclat.nextLine();
                System.out.print("Autor del llibre: ");
                String autor = teclat.nextLine();
                
                Llibre nouLlibre = new Llibre(titol, autor);
                biblioteca.afegirLlibre(nouLlibre); 
                System.out.println("Llibre afegit correctament.");

            } else if (opcio.equals("2")) {
                // Recorrer llista de llibres i imprimir-ho un per un
                System.out.println("Llibres a la biblioteca:");
                for (Llibre l : biblioteca.getLlibres()) { 
                    System.out.println("- " + l.toString()); 
                }

            } else if (opcio.equals("3")) {
                // Préstec a un usuari
                System.out.print("Nom de l'usuari: ");
                String nomUsuari = teclat.nextLine();
                Usuari usuari = new Usuari(nomUsuari); 
                
                System.out.print("Títol del llibre a prestar: ");
                String titolLlibre = teclat.nextLine();
                Llibre llibreABuscar = biblioteca.buscarLlibre(titolLlibre); 

                // Comprovar si el llibre existeix
                if (llibreABuscar != null) {
                    gestor.prestarLlibre(usuari, llibreABuscar); 
                } else {
                    System.out.println("El llibre no s'ha trobat.");
                }

            } else if (opcio.equals("4")) {
                 
                System.out.println("Total de llibres: " + biblioteca.getLlibres().size());

            } else if (opcio.equals("0")) {
                System.out.println("Fins la pròxima, Adéuuuu!");
            } else {
                System.out.println("Opció no vàlida.");
            }
        }
        teclat.close();
    }
}