package main;

public class Main {

    public static void main(String[] args) {

        Bicicleta miBicicleta = new Bicicleta(2,1,1);
        Bicicleta tuBicicleta = new Bicicleta(3,1,2);

        BicicletaMontana bicicletaMontana = new BicicletaMontana(2,1,1,1);
        BicicletaTandem bicicletaTandem = new BicicletaTandem(2,1,1,2);

        bicicletaMontana.acelerar();
        bicicletaTandem.acelerar();

        System.out.println("Velocidad actual bicicleta montana: "+bicicletaMontana.getVelocidadActual());
        System.out.println("Velocidad actual bicicleta tandem: "+bicicletaTandem.getVelocidadActual());
    }

}
