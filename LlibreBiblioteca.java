public class LlibreBiblioteca {
    private String titol;
    private String autor;
    private String categoria; 
    private boolean prestat;

    // Constructor actualitzat amb categoria
    public Llibre(String titol, String autor, String categoria) {
        this.titol = titol;
        this.autor = autor;
        this.categoria = categoria;
        this.prestat = false;
    }

    // Getters originals
    public String getTitol() {
         return titol;
         }
    public String getAutor() { 
        return autor;
     }
    public boolean esPrestat() { 
        return prestat; 
    }

    // Getter i Setter per categoria  
    public String getCategoria() {
         return categoria; 
        }
    public void setCategoria(String categoria) {
         this.categoria = categoria; 
        }

    // Mètodes per modificar llibre  
    public void setTitol(String titol) { 
        this.titol = titol; 
        }
    public void setAutor(String autor) {
         this.autor = autor; 
        }

    public void prestar() {
         prestat = true; 
        }
    public void retornar() {
         prestat = false; 
        }

    @Override
    public String toString() {
        return titol + " de " + autor + 
               " [" + categoria + "]" +          
               (prestat ? " (En préstec)" : " (Disponible)");