package main;

public class Bicicleta extends Vehiculo
{

    private int velocidadActual;
    private int platoActual;
    private int pinonActual;

    public Bicicleta(int velocidadActual, int platoActual, int pinonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }

    public Bicicleta(){
        this.velocidadActual = 0;
        this.platoActual = 1;
        this.pinonActual = 1;
    }

    @Override
    public void acelerar()
    {

        velocidadActual *= 2;
    }

    @Override
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

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public int getPinonActual() {
        return pinonActual;
    }

    public void setPinonActual(int pinonActual) {
        this.pinonActual = pinonActual;
    }
}
