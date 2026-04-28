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
    }
}