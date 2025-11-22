import java.lang.ArithmeticException;

public class Exceptions {
    
    public static void main(String[] args){
        System.out.println("[+] Inicio de proyecto");
        int a = 3;
        try {
            String[] p = {"Hola", "Mundo"};
            System.out.println(p[4]);
            a = 4/0;
            Cucaracha c = new Cucaracha();
            c.setPatas(400);
        } catch (ArithmeticException e) {
            a = 0;
            System.out.println("[+] Hay una excepción de tipo aritmética "+e.getMessage());
        } catch (CucarachaException e) {
            a = 0;
            System.out.println("[*] Hay una excepción de cucaracha???? "+e.getMessage());
        } 
        catch (Exception e) {
            a = -2;
            System.out.println("[-] Hay una excepción "+e.getMessage());
        } finally {
            System.out.println("[+] Finalmente el valor de a "+a);
        }
    }
}

class CucarachaException extends Exception{
    public CucarachaException(String message){
        super("La cucaracha dice: "+message);
    }
}

class Cucaracha{
    int patas = 6;

    public void setPatas(int patas)throws CucarachaException{
        if(patas < 0){
            throw new CucarachaException("No existen las patas de antimateria ponle por lo menos 0 patas");
        } else if(patas > 6){
            throw new CucarachaException("En este programa no se permiten las cucarachas mutantes tiene muchas patas!!");
        }
        this.patas = patas;
    }
}

class MiClase{

}