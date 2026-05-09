import java.time.LocalDate;


public class PrestecBiblioteca {
    private UsuariBiblioteca usuari;
    private LlibreBiblioteca llibre;
    private LocalDate dataPrestec;
    private LocalDate dataRetorn;

    public PrestecBiblioteca(UsuariBiblioteca usuari, LlibreBiblioteca llibre, LocalDate dataPrestec) {
        this.usuari = usuari;
        this.llibre = llibre;
        this.dataPrestec = dataPrestec;
        this.dataRetorn = dataPrestec.plusWeeks(2);
    }

    public UsuariBiblioteca getUsuari() { return usuari; }
    public LlibreBiblioteca getLlibre() { return llibre; }
    public LocalDate getDataPrestec() { return dataPrestec; }
    public LocalDate getDataRetorn() { return dataRetorn; }

    public String getCategoriaPrestec() {
        return llibre.getCategoria();
    }

    @Override
    public String toString() {
        return usuari.getNom() + " , Inici: " + dataPrestec + 
               " , Retorn: " + dataRetorn + 
               " , Préstec: " + llibre.getTitol();
    }
}

