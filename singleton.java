class Database{
    private static Database a = new Database();
    
    private Database(){}

    public static Database getInstance(){
        return Database.a;
    }

    public void ejecutaSelect(){
        System.out.println("Ejecutado");
    }
}

//SOLID
//Single Responsability Principle
//Una clase solo debe tener una razon para cambiar

public class singleton {
    public static void main(String[] args){
        Database d = Database.getInstance();
        d.ejecutaSelect();
        Database e = Database.getInstance();
        e.ejecutaSelect();
        System.out.println(d == e);
    }
}
