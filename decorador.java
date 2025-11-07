//Decorador
class Helado{
    int getPrecio(){
        return 3 + t.getPrecio();
    }

    Helado(){}

    Topping t;
}

abstract class Topping{
    Topping t;

    public Topping(Topping t){
        this.t = t;
    }

    public Topping(){
        this.t = null;
    }

    int getPrecio(){
        return this.t.getPrecio();
    }
}

class Chocolate extends Topping{
    public Chocolate(Topping t){
        this.t = t;
    }

    public Chocolate(){
        this.t = null;
    }
    int getPrecio(){
        if(this.t != null)
            return this.t.getPrecio() + 1;
        return 1;
    }
}

class Galletas extends Topping{
    public Galletas(Topping t){
        this.t = t;
    }

    public Galletas(){
        this.t = null;
    }
    int getPrecio(){
        if(this.t != null)
            return this.t.getPrecio() + 2;
        return 2;
    }
}

//Open Closed Principle
//El software debería estar cerrado para la modificación y abierto para la extensión

class Cajeta extends Topping{
    public Cajeta(Topping t){
        this.t = t;
    }

    public Cajeta(){
        this.t = null;
    }
    int getPrecio(){
        if(this.t != null)
            return this.t.getPrecio() + 7;
        return 7;
    }
}

//Principios SOLID | clean code
//Patrones de arquitectura de software MVC

//23 Patrones de diseño

class Hola{
    public static void main(String[] args){
        Helado h = new Helado();
        h.t = new Chocolate(new Chocolate(new Galletas(new Cajeta())));
        System.out.println(h.getPrecio());
    }
}