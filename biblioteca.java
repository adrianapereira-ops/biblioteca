import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Llibre> llibres;

    public Biblioteca() {
        this.llibres = new ArrayList<>();
    }

    public void afegirLlibre(Llibre llibre) { 
        llibres.add(llibre); 
    }

    public Llibre buscarLlibre(String titol) {
        for (Llibre llibre : llibres) {
            if (llibre.getTitol().equalsIgnoreCase(titol)) {
                return llibre;
            }
        }
        return null;
    }

    public void comprovarDisponibilitat(String titol) {
        Llibre llibre = buscarLlibre(titol);
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

    public List<Llibre> getLlibres() { 
        return llibres; 
    }
}