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
        if (x != getPosX()){
            System.out.println("Tengo q buscar mi posicion en x ! estoy en x: "+getPosX()+" y necesito ir a x: "+x);
            if (x > getPosX()){
                girar('E');
            }else {
                girar('O');
            }
            System.out.println("Mi direccion es: "+getDireccion()+" ahora comienza la aproximacion");
            aproximarseEnUnaDireccion(x,this.getDireccion());
            System.out.println("Llegue a mi posicion en x !! pos: "+getPosX()+" destino: "+x);
        }
        if (y != getPosY()){
            System.out.println("Tengo q buscar mi posicion en y ! estoy en y: "+getPosY()+" y necesito ir a y: "+y);
            if (y > getPosY()){
                girar('N');
            }else {
                girar('S');
            }
            System.out.println("Mi direccion es: "+getDireccion()+" ahora comienza la aproximacion");
            aproximarseEnUnaDireccion(y,this.getDireccion());
            System.out.println("Llegue a mi posicion en y !! pos: "+getPosY()+" destino: "+x);
        }
        System.out.println("Llegue a destino !! x: "+getPosX()+" y: "+getPosY());
        girar(direccion);




    }

    public void aproximarseEnUnaDireccion(int destino,char direccion){
        if (direccion == 'E' || direccion == 'O') {
            while (getPosX() != destino) {
                // tengo q chequear estar lo suficientemente lejos del destino para no saltarlo
                if((destino-getPosX())<velocidad){
                    break;
                }
                switch (direccion) {
                    case 'E':
                        setPosX(getPosX() + (int) velocidad);
                        break;
                    case 'O':
                        setPosX(getPosX() - (int) velocidad);
                        break;
                }
                System.out.println("Mi nueva posicion en x: "+getPosX()+" y: "+getPosY());

            }
            System.out.println("Desacelerando motores...");
            while (getPosX() != destino) {
                // tengo q chequear estar lo suficientemente lejos del destino para no saltarlo
                if((destino-getPosX())<velocidad){
                    break;
                }
                switch (direccion) {
                    case 'E':
                        setPosX(getPosX() + 1);
                        break;
                    case 'O':
                        setPosX(getPosX() - 1);
                        break;
                }
                System.out.println("Mi nueva posicion en x: "+getPosX()+" y: "+getPosY());
            }

        }else if (direccion == 'N' || direccion == 'S'){
            while (getPosY() != destino){
                if((destino-getPosY())<velocidad){
                    break;
                }
                switch (direccion){
                    case 'N':
                        setPosY(getPosY()+(int)velocidad);
                        break;
                    case 'S':
                        setPosY(getPosY()-(int)velocidad);
                        break;
                }
                System.out.println("Mi nueva posicion en x: "+getPosX()+" y: "+getPosY());
            }
            System.out.println("Desacelerando....");
            while (getPosY() != destino){
                switch (direccion){
                    case 'N':
                        setPosY(getPosY()+1);
                        break;
                    case 'S':
                        setPosY(getPosY()-1);
                        break;
                }
                System.out.println("Mi nueva posicion en x: "+getPosX()+" y: "+getPosY());
            }
        }

    }


    public void girar(char direccion){
        setDireccion(direccion);

    }

    public void restaVida(int valor){
        vida -= valor;
    }
}
