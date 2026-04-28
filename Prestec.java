import java.time.LocalDate;

public class Prestec {
    // Atributs
    private Usuari usuari;
    private Llibre llibre;
    private LocalDate dataPrestec;
    private LocalDate dataRetorn;
    
    // Constructor

    public Prestec(Usuari usuari, Llibre llibre, LocalDate dataPrestec) {
        this.usuari = usuari;
        this.llibre = llibre;
        this.dataPrestec = dataPrestec;
        // L'enunciat suggereix que el retorn és automàticament en 2 setmanes 
        this.dataRetorn = dataPrestec.plusWeeks(2);
    }

    //Mètodes
    public Usuari getUsuari() { 
        return usuari;
     }
    public Llibre getLlibre() {
         return llibre;
         }
    public LocalDate getDataPrestec() {
         return dataPrestec;
         }
    public LocalDate getDataRetorn() {
         return dataRetorn;
         }

         
    public String getCategoriaPrestec() {
        return llibre.getCategoria();
    }

    @Override
    public String toString() {
        return "Préstec: " + llibre.getTitol() + " , Usuari: " + usuari.getNom() + 
               " , Inici: " + dataPrestec + " , Retorn: " + dataRetorn;
    }
}