import java.io.IOException;

public class Strings {
    public static void main(String[] args) throws IOException, InterruptedException{
        for(String a : args){
            System.out.println("Creando capeta "+a);
            Runtime r = Runtime.getRuntime();
            Process p = r.exec("mkdir "+a);
            p.waitFor();
        }

        Clase c = new Clase(3);
        Clase d = new Clase(3);
        float a = 3;
        float b = 3;
        if(c.equals(d))
            System.out.println("Son iguales");
        else
            System.out.println("Son diferentes");
        //Comparación de strings en java
        String s  = "Hola";
        String t = "mundo";
        char x = 'a';
        char y = 'b';
        if(s == t)
            System.out.println("Los strings son iguales");
        if(x < y)
            System.out.println("A < B");
        //Array r = new Array();
        float[] r = {2, 3, 4, 5};
        System.out.println(r[2]);
        char[] cr = {'H', 'o', 'l', 'a'};
        System.out.println(cr);
        //Concatenación
        String cat = s +" "+ t;
        System.out.println("[+]La variable cat contiene: "+ cat);
        //ToString
        //Object ob = new Clase(3);
        out.println("Hola mundo"); //Si llega un string
        out.println(true);
        out.println(new Clase(3)); //Si llega un object
        out.println(new Pato()); //Si llega un object
        //Parsing
        Clase cl = new Clase(3);
        System.out.println(cl.f + cl.f);
        String clString = cl.toString();
        System.out.println(clString + clString);
        //A boleano
        boolean b1 = 3 != 0;
        //A entero
        int i1 = (int)3.14f;
        i1 = (int)3.14;
        i1 = Integer.parseInt("3");
        //A flotante
        float f1 = (int)3;
        f1 = (float)5.6;
        f1 = Float.parseFloat("3.14");
        //A string
        String s1 = 3.14+"";
        s1 = cl.toString();
        //String.format("El valor de la variable es %s %s %i", s1, s1, i1);
        String.valueOf(i1);
        s1 = "Hola Java esto es un texto";
        //Métodos de string
        System.out.println(s1.length());
        String[] as = s1.split(" ");
        for (String st1 : as) {
            System.out.println(st1);
        }
        String dias = "Lunes,Martes,Mercoles,Jueves,Viernes,Sabado,Domingo";
        for(String d1 : dias.split(","))
            System.out.println(d1);
        
    }
}

class out{
    public static void println(String s){
        System.out.println("Ejecutando con strings");
        System.out.println(s);
    }

    public static void println(boolean b){
        System.out.println("Ejecutando con boolean");
        System.out.println(b);
    }

    public static void println(Object o){
        System.out.println("Ejecutando con object");
        System.out.println(o.toString());
    }
}

class Pato{
    @Override
    public String toString(){
        return("Soy un pato");
    }

    public static Pato toPato(Object o){
        return new Pato();
    }
}

class Clase extends Object{
    float f;
    Clase(float f){
        this.f = f;
    }

    @Override
    public String toString(){
        return f+"";
    }

    boolean equals(Clase a){
        return this.f == a.f;
    }
}