package CTD_B3_Java_Clase10_Ejercicio;

public class Nave extends Objeto{
    private double velocidad;
    private int vida=100;

    public Nave(int posX, int posY, char direccion, double velocidad) {
        super(posX, posY, direccion);
        this.velocidad = velocidad;

    }

    @Override
    public void irA(int x, int y, char direccion) {

    }

    public void girar(char direccion){
        setDireccion(direccion);

    }

    public void restaVida(int valor){
        vida -= valor;
    }
}
