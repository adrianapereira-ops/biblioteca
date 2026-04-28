public class Llibre {

    //atributs
    private String titol;
    private String autor;
    private String categoria; 
    private boolean prestat;
    private int copsPrestat;  
    //constructor
    public Llibre(String titol, String autor, String categoria) {
        this.titol = titol;
        this.autor = autor;
        this.categoria = categoria;
        this.prestat = false;
        this.copsPrestat = 0;
    }
    //Mètodes

    public String getTitol() { 
        return titol;
     }
    public String getAutor() {
         return autor;
         }
    public String getCategoria() {
         return categoria; 
        }
    public boolean esPrestat() {
         return prestat; 
        }
    public int getCopsPrestat() { 
        return copsPrestat;
     }

    public void prestar() { 
        this.prestat = true; 
        this.copsPrestat++; 
    }
    
    public void retornar() {
         this.prestat = false;
         }
        
    @Override
    public String toString() {
        return titol + " de " + autor + " ," + categoria + "," + (prestat ? " (En préstec)" : " (Disponible)");
    }
}