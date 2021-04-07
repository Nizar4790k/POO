package main;

public class Main {

    public static void main(String[] args) {

        Bicicleta [] bicicletas =
                {new BicicletaMontana(2,2,2,2),
                 new Bicicleta(2,3,2),
                new BicicletaTandem(4,3,2,1)};


        for (Bicicleta bicicleta:bicicletas){
            bicicleta.acelerar();
        }

    }

}
