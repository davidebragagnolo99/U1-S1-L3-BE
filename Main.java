public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(0, "Davide", "Bragagnolo", "davibraga@", "04/10/23");
        Articolo articolo = new Articolo(123, "MacBookAir", 879.99,2);
        Carrello carrello = new Carrello("cliente N°0", "MacBookAir", 880);

        System.out.println("Il cliente " + " " + cliente.codiceCliente + " " + cliente.nome + " " + cliente.cognome);
        System.out.println("Cliente dal " + cliente.data);
        System.out.println("Ha acquistato un " + articolo.descrizione + " " + "id: " + articolo.codice + " " + "prezzo: " + articolo.prezzo + " €");
        System.out.println("Riepilogo del Carrello: -Totale Carrello: " + carrello.costoArticoli + " €" + " " + "Articoli: " + carrello.elenco);
    }
}
