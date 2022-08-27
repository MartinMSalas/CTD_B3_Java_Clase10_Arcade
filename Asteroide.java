package CTD_B3_Java_Clase10_Ejercicio;

public class Asteroide extends Objeto{
    private int lesion;

    public Asteroide(int posX, int posY, char direccion, int lesion) {
        super(posX, posY, direccion);
        this.lesion = lesion;
        System.out.println("Haz creado un nuevo asteroide");
    }

    @Override
    public void irA(int x, int y, char direccion) {
        super.irA(x, y, direccion);
        // implementar q se mueva en direccion fija con vel random
        System.out.println("Soy una aburridisima teletransportacion ");
        System.out.println("Mi posicion ahora es x: "+x+" y: "+y);
    }

    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }
}
