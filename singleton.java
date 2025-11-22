class Database{
  private static Database a = new Database();

    private Database(){}
    
    public static Database getInstance(){
        return Database.a;
    }
// ================================================
    public float f = 0.0f;
    public void ejecutaSelect(){
        System.out.println("Ejecutado");
    }
}

//SOLID
//Single Responsibility Principle
//Una clase solo debe tener una razón para cambiar

public class singleton {
    public static void main(String[] args){
        Database a = Database.getInstance();
        Database b = Database.getInstance();
        System.out.println(a.f);
        a.f = 3.14f;
        System.out.println(b.f);//3.14
        Database c = Database.getInstance();
        System.out.println(c.f);//3.14
    }
}
