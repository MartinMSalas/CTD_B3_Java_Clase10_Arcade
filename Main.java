package CTD_B3_Java_Clase10_Ejercicio;

public class Main {
    public static void main(String[] args) {
        Nave acorazadoLibertad = new Nave(-100,-50,'N',20.0);
        acorazadoLibertad.irA(25,75,'N');
        Asteroide roca1 = new Asteroide(0,0,'E',20);
        roca1.irA(10,10,'N');

    }

}
