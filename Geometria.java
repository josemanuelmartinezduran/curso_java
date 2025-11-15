public class Geometria {
    public static void main(String args[]){
        CuerpoGeometrico g = new Esfera(2);
        System.out.println("El volumen es "+g.getVolumen());
    }
}

class CuerpoGeometrico{
    void CuerpoGeometrico(){

    }

    float getVolumen(){
        return 0.0f;
    }

    float getArea(){
        return 0.0f;
    }

    float getPerimetro(){
        return 0.0f;
    }
}

class Constantes{
    public static final float PI = 3.14f;
}

// Realizar
// 1 Un constructor
// Heredar el método getVolumen
class Esfera extends CuerpoGeometrico{
    private float radio;

    Esfera(float radio){
        this.radio = radio;
    }

    float getVolumen(){
        return (float)(((4/3)*Constantes.PI)*Math.pow(radio, 3));
    }
}

class Cubo extends CuerpoGeometrico{
    private float lado;//Encapsular variable

    Cubo(float lado){
        super();
        this.lado = lado;
    }

    float getVolumen() {
        return (float) Math.pow(lado, 3);
    }

    float getLado(){
        return this.lado;
    }

}
