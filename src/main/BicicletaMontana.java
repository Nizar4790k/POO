package main;

public class BicicletaMontana extends  Bicicleta {

    private int suspencion;

    public void cambiarSuspencion(int suspencion){
        this.suspencion = suspencion;
    }

    public BicicletaMontana(int velocidadActual, int platoActual, int pinonActual, int suspencion) {
        super(velocidadActual, platoActual, pinonActual);
        this.suspencion = suspencion;
    }

    @Override
    public  void  acelerar(){
        super.acelerar(); // Accediendo al metodo acelerar de la clase Bicicleta
        setVelocidadActual(3*getVelocidadActual());
    }

}
