import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {
    private List<Prestec> prestecs;

    public GestorBiblioteca() {
        this.prestecs = new ArrayList<>();
    }

    public void prestarLlibre(Usuari usuari, Llibre llibre) {
        if (!llibre.esPrestat()) {
            llibre.prestar();
            Prestec prestec = new Prestec(usuari, llibre, LocalDate.now());
            prestecs.add(prestec);
            usuari.afegirLlibre(llibre);
            System.out.println(usuari.getNom() + " ha agafat el llibre: " + llibre.getTitol());
        } else {
            System.out.println("Aquest llibre ja està prestat.");
        }
    }

    public void consultarHistorialUsuari(Usuari usuari) {
        System.out.println("Historial de " + usuari.getNom() + ":");
        boolean tePrestecs = false;
        
        for (Prestec p : prestecs) {
            if (p.getUsuari().getNom().equals(usuari.getNom())) {
                System.out.println("- " + p.getLlibre().getTitol() + " (Retornar el: " + p.getDataRetorn() + ")");
                tePrestecs = true;
            }
        }
        
        if (!tePrestecs) {
            System.out.println("Aquest usuari no té cap préstec registrat.");
        }
    } // Clau de tancament del mètode corregida

    public void mostrarEstadistiques() {
        System.out.println("--- ESTADÍSTIQUES DE LA BIBLIOTECA ---");
        System.out.println("Total de préstecs realitzats: " + prestecs.size());

        if (prestecs.isEmpty()) {
            System.out.println("No hi ha dades suficients per generar informes.");
            return;
        }

        mostrarLlibreMesPrestat();
    }

    private void mostrarLlibreMesPrestat() {
        String llibreMesPrestat = "";
        int maxPrestecs = 0;

        for (Prestec p1 : prestecs) {
            int comptador = 0;
            for (Prestec p2 : prestecs) {
                if (p1.getLlibre().getTitol().equals(p2.getLlibre().getTitol())) {
                    comptador++;
                }
            }
            if (comptador > maxPrestecs) {
                maxPrestecs = comptador; 
                llibreMesPrestat = p1.getLlibre().getTitol();
            }
        }
        System.out.println("Llibre més prestat: " + llibreMesPrestat + " (" + maxPrestecs + " vegades)");
    }
}