package main;

public class Bicicleta
{

    private int velocidadActual;
    private int platoActual;
    private int pinonActual;

    public Bicicleta(int velocidadActual, int platoActual, int pinonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }

    public void acelerar()
    {

        velocidadActual *= 2;
    }

    public void frenar()
    {
        velocidadActual  *= 0.5;
    }

    public void cambiarPlato(int plato)
    {
        this.platoActual = plato;
    }

    public void cambiarPinon(int pinon)
    {
        this.pinonActual = pinon;
    }

    public void cambiarPlato()
    {
        this.platoActual = 1;
    }

    public void cambiarPinon(){
        this.pinonActual = 1;
    }
}
