public class Rettangolo {
    double height;
    double width;

    public Rettangolo(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double area() {
        return height * width;
    }

    public double perimetro() {
        return (height + width) * 2;
    }

    public void stampaRettangolo() {
        System.out.println("Area rettangolo: " + area() + "Perimetro rettangolo: " + perimetro());
    }

    public static void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2) {
        System.out.println("Area 1: " + rett1.area() + " " + "Perimetro 1: " + rett1.perimetro());
        System.out.println("Area 2: " + rett2.area() + " " + "Perimetro 2: " + rett2.perimetro());
        System.out.println("Somma delle aree: " + (rett1.area() + rett2.area()));
        System.out.println("Somma dei perimetri: " + (rett1.perimetro() + rett2.perimetro()));
    }

    public static void main(String[] args) {
        Rettangolo rett1 = new Rettangolo(5, 10);
        Rettangolo rett2 = new Rettangolo(3, 7);

        rett1.stampaRettangolo();
        rett2.stampaRettangolo();

        stampaDueRettangoli(rett1, rett2);
    }
}
