import java.time.LocalDate;

public class PrestecBiblioteca {
    // Atributs
   
	private UsuariBiblioteca UsuariBiblioteca;
	private LlibreBiblioteca LlibreBiblioteca;
	private LocalDate LocalDate;
	private java.time.LocalDate dataRetorn;
    
    // Constructor

    public PrestecBiblioteca(UsuariBiblioteca usuari, LlibreBiblioteca llibre, LocalDate dataPrestec) {
        this.UsuariBiblioteca = usuari;
        this.LlibreBiblioteca = llibre;
        this.LocalDate = dataPrestec;
        // L'enunciat suggereix que el retorn és automàticament en 2 setmanes 
        this.dataRetorn = dataPrestec.plusWeeks(2);
    }

    //Mètodes
    public UsuariBiblioteca getUsuari() { 
        return getUsuari();
     }
    public LlibreBiblioteca getLlibre() {
         return getLlibre();
         }
    public LocalDate getDataPrestec() {
         return getDataPrestec();
         }
    public LocalDate getDataRetorn() {
         return getDataRetorn();
         }

         
    public String getCategoriaPrestec() {
        LlibreBiblioteca llibre = null;
		return llibre.getCategoria();
    }

    @Override
    public String toString() {
        String dataPrestec = null;
		LlibreBiblioteca llibre;
		String dataRetorn = null;
		return getNom() + " , Inici: " + dataPrestec + " , Retorn: " + dataRetorn + ("Préstec: " + llibre.getTitol() + " , Usuari: ");
    }

	private String getNom() {
		// TODO Auto-generated method stub
		return null;
	}
}

