public class Chiamata {
    String numeroChiamato;
    int durata;

    public Chiamata (String numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }
        public String getNumeroChiamato() {
            return this.numeroChiamato;
        }
        public int getDurata() {
        return this.durata;
    }
}
