public class Patos {
    public static void main(String[] a){
        Pato lucas = new RedHead();
        Pato donald = new MallardDuck();
        Pato.hazTodo(lucas);
        Pato.hazTodo(donald);
    }
}

interface Flyable{
    String fly();
}

abstract class Pato{
    String cuack(){
        return "Cuack";
    }

    static void hazTodo(Pato p){
        System.out.println(p.cuack());
    }

}

class PatitoDeHule extends Pato{
    String cuack(){
        return "Squeack";
    }
}

class MallardDuck extends Pato implements Flyable{
    public String fly(){
        return "Vuelo";
    }
}

class RedHead extends Pato implements Flyable{
    String cuack(){
        return "Kuack";
    }

    public String fly(){
        return "Vuelo";
    }
}

