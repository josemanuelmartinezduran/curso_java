import java.util.*;

public class Algoritmos {
    public static void main(String[] args){
        //Recu.RecurSerie(10);
        Recu.RecurPrimos(2, true);
    }
}

class Recu{
    //Solo es divisible por si  mismo y por la unidad
    //Enteros positivos mayores a 1
       
    
    public static void GeneraPrimos(int n) {
        if(n<2)
            return;
        n--;
        System.out.println(2);
        for(int i=0;n>0;i++){
            boolean es_primo=true;
            for(int j=0; j<i; j--){
                if(i%j==0){//C1
                    es_primo = false;
                    break;
                }
            }
            if(es_primo){
                System.out.println(i);
            }
        }
    }

    public static void RecurPrimos(int n, boolean es_primo){ 
        // Paso 1 definir condición de paro
        if(n<2)
            return;
        if(n==2){
            System.out.println(n);
            return;
        }
        
    }


    public static void RecurSerie(int n){
        if(n==0)
            System.out.println(n);
        else{
            System.out.println(n);
            Recu.RecurSerie(n-1);
        }
    }

    public static void Serie(int n){
        for(int i=0; i<n; i++)
            System.out.println(i);
    }

    public static List<Integer> Finbonacci(int n){
        List<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(1);
        for(int i=0; i<(n-2); i++)
            l.add(l.get(l.size()-1)+l.get(l.size()-2));
        return l;
    }
//Hacer un programa que imprima los 'n' primeros números pares
        //int cantidad_pares = 100;
        //Hacer los primeros n números de la serie de Fibonacci
        //0,1,1,2,3,5,8,13,21,33
        /* List<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(1);
        for(int i=0; i<(10-2); i++)
            l.add(l.get(l.size()-1)+l.get(l.size()-2));
        System.out.println(l); */
    
}