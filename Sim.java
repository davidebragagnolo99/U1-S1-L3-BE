import java.util.ArrayList;

public class Sim {
    int numeroTelefono;
    double credito;
    ArrayList<Chiamata> listaChiamate;

    public Sim(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0;
        this.listaChiamate = new ArrayList<Chiamata>();
    }

    // Funzioni di stampa e aggiungi chiamata
    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " €");
        System.out.println();
        System.out.println("Ultime chiamate effettuate: ");
        for (Chiamata chiamata : listaChiamate) {
            System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() + ", durata: " + chiamata.getDurata() + " minuti");
        }
    }
    public void aggiungiChiamata(int durata, String numeroChiamato) {
        Chiamata chiamata = new Chiamata(numeroChiamato, durata);
        listaChiamate.add(chiamata);
    }
}
