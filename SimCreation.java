public class SimCreation {
    public static void main(String[] args) {
        // Creazione di una nuova SIM con numero di telefono 1234567890
        Sim sim = new Sim(1234567890);

        // Aggiunta di chiamate
        sim.aggiungiChiamata(10, "123456789");
        sim.aggiungiChiamata(15, "123456788");
        sim.aggiungiChiamata(16, "123456777");
        sim.aggiungiChiamata(8, "1234566543");
        sim.aggiungiChiamata(12, "1233211234");

        // Stampa dei dati della SIM
        sim.stampaDatiSim();
    }
}
