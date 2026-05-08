import java.util.ArrayList;
import java.util.List;

public class Usuari {
    //Propietats
    private String id;
    private String correu;
    private String nom;
    private List<Llibre> llibresPrestats;

    //Constructors
    public Usuari(String id, String correu, String nom) {
    this.id = id;
    this.correu = correu;
    this.nom = nom;
    this.llibresPrestats = new ArrayList<>();
}

//Getters i Setters
public String getId() { return id; }
public String getCorreu() { return correu; }
public String getNom() { return nom; }
public List<Llibre> LlibresPrestats() { return llibresPrestats; }

public void setCorreu(String correu) { this.correu = correu; }
public void setNom(String nom) { this.nom = nom; }

public void afegirLlibre(Llibre llibre) { 
    llibresPrestats.add(llibre); 
}
public void retornarLlibre(Llibre llibre) { 
    llibresPrestats.remove(llibre); 
}
}