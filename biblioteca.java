import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<LlibreBiblioteca> llibres;

    public Biblioteca() {
        this.llibres = new ArrayList<>();
    }

    public void afegirLlibre(LlibreBiblioteca llibre) { 
        llibres.add(llibre); 
    }

    public LlibreBiblioteca buscarLlibre(String titol) {
        for (LlibreBiblioteca llibre : llibres) {
            if (llibre.getTitol().equalsIgnoreCase(titol)) {
                return llibre;
            }
        }
        return null;
    }

    public void comprovarDisponibilitat(String titol) {
        LlibreBiblioteca llibre = buscarLlibre(titol);
        if (llibre != null) {
            if (llibre.esPrestat()) {
                System.out.println("El llibre '" + titol + "' no està disponible.");
            } else {
                System.out.println("El llibre '" + titol + "' està disponible.");
            }
        } else {
            System.out.println("El llibre no existeix a la biblioteca.");
        }
    }

    public List<LlibreBiblioteca> getLlibres() { 
        return llibres; 
    }
    
}