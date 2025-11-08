//En POO todo son Objetos
//Abstracción 
class Automovil{
    String marca;
    String modelo;
    int numeroPuertas;

    boolean Compara(Automovil a){
        return this.modelo == a.modelo && this.marca == a.marca && this.numeroPuertas == a.numeroPuertas;
    }
}

//Encapsulamiento
class Perro{
    String nombre;
    private int numeroPatas;

    public void setPatas(int numeroPatasParam){
        if(numeroPatasParam < 0)
            this.numeroPatas = 0;
        else if(numeroPatasParam > 4)
            this.numeroPatas = 4;
        else 
            this.numeroPatas = numeroPatasParam;
    }

    public int getPatas(){
        return this.numeroPatas;
    }
}
//Herencia
class FiguraGeometrica{
    private int alto;
    private int ancho;

    public void setAncho(int ancho){
        if(ancho >= 0)
            this.ancho = ancho;
        else this.ancho = 0;
    }

    public int getAncho(){
        return this.ancho;
    }

    public int getAlto(){
        return this.alto;
    }

    FiguraGeometrica(){
        this.alto = 1;
        this.ancho = 1;
    }

    FiguraGeometrica(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    public int calculateArea(){
        return this.alto * this.ancho;
    }

    public int calculatePerimetro(){
        return ((2 * this.alto) + (2 * this.ancho));
    }
}

class Triangulo extends FiguraGeometrica{
    public int calculateArea(){
        return ((this.getAlto() * this.getAncho())/2);
    }

    public String toString(){
        return "El tríangulo tiene un área de "+this.calculateArea();
    }
}

class Clases{
    public static void main(String[] args){
        Triangulo t = new Triangulo();
        System.out.println(t);


        /* FiguraGeometrica r1 = new FiguraGeometrica(4 ,5);
        FiguraGeometrica r2 = new FiguraGeometrica();
        System.out.println("El area de r1 es "+r1.calculateArea());
        System.out.println("El perímetro de r1 es "+r1.calculatePerimetro());
        System.out.println("El area de r2 es "+r2.calculateArea());
        System.out.println("El perímetro de r2 es "+r2.calculatePerimetro()); */

        /* Perro solobino = new Perro();
        solobino.nombre = "Solobino";
        solobino.setPatas(17);
        System.out.println("El "+solobino.nombre+" tiene "+solobino.getPatas()+" patas"); */



        /* Automovil miCarro = new Automovil();
        miCarro.marca = "Toyota";
        miCarro.modelo = "2025";
        miCarro.numeroPuertas = 4;

        Automovil vecinoCarro = new Automovil();
        vecinoCarro.marca = miCarro.marca;
        vecinoCarro.modelo = miCarro.modelo;
        vecinoCarro.numeroPuertas = miCarro.numeroPuertas;

        if(miCarro.Compara(vecinoCarro))
            System.out.println("El contenido de ambos carros es igual");
        if(miCarro == vecinoCarro)
            System.out.println("Los carros son el mismo");
        else
            System.out.println("Los carros son diferentes"); */

        /* if(miCarro.modelo == vecinoCarro.modelo){
            System.out.println("Los dos carros son del mismo modelo");
        }

        if(miCarro == vecinoCarro){
            System.out.println("Los carros son iguales");
        } else {
            System.out.println("Los carros son diferentes");
        }

        vecinoCarro.numeroPuertas = 3;
        System.out.println(miCarro.numeroPuertas); */
    }
}