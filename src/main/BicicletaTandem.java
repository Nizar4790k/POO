package main;

public class BicicletaTandem extends Bicicleta {

    private int numAsientos;

    public BicicletaTandem(int velocidadActual, int platoActual, int pinonActual, int numAsientos) {
        super(velocidadActual, platoActual, pinonActual);
        this.numAsientos = numAsientos;
    }

    @Override
    public  void  acelerar(){
        super.acelerar(); // Accediendo al metodo acelerar de la clase Bicicleta
        setVelocidadActual(4*getVelocidadActual());
    }
}
