/**
 * @Nombre: PrincipiosPOO.java
 * @Descripción: Demostración de los conceptos fundamentales de la Programación
 * Orientada a Objetos (POO) en Java: Abstracción, Encapsulamiento,
 * Herencia, Polimorfismo, Interfaces y Clases Estáticas.
 */

// -------------------------------------------------------------------
// 1. ABSTRACCIÓN: Clase abstracta que define el contrato base
// -------------------------------------------------------------------
abstract class InstrumentoMusical {
    // Atributo final: una constante que no puede cambiar su valor
    public static final String TIPO_SONIDO = "Armónico";

    // Atributo encapsulado (privado)
    private String nombre;

    // Constructor
    public InstrumentoMusical(String nombre) {
        this.nombre = nombre;
        System.out.println("-> Creando un instrumento: " + this.nombre);
    }

    // 2. ENCAPSULAMIENTO: Métodos públicos (getters/setters) para acceder/modificar
    // atributos privados
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: Obliga a las subclases a implementarlo. Es la esencia
    // de la abstracción.
    public abstract void tocar();

    // Método concreto (ya implementado)
    public void afinar() {
        System.out.println(nombre + " se está afinando.");
    }
}

// -------------------------------------------------------------------
// 3. INTERFACE: Define un contrato de funcionalidad que cualquier clase puede
// implementar, sin relación de herencia.
// -------------------------------------------------------------------
interface PuedeGrabar {
    void grabarAudio(int duracionSegundos);
}

// -------------------------------------------------------------------
// 4. HERENCIA: La clase Cuerda hereda de InstrumentoMusical.
// -------------------------------------------------------------------
class InstrumentoDeCuerda extends InstrumentoMusical implements PuedeGrabar {
    private int numCuerdas; // Atributo específico de la subclase

    public InstrumentoDeCuerda(String nombre, int numCuerdas) {
        // Llama al constructor de la superclase (InstrumentoMusical)
        super(nombre);
        this.numCuerdas = numCuerdas;
    }

    // Implementación obligatoria del método abstracto 'tocar' (Abstracción)
    @Override
    public void tocar() {
        System.out.println(getNombre() + " está vibrando " + numCuerdas + " cuerdas.");
    }

    // Implementación del método de la interfaz
    @Override
    public void grabarAudio(int duracionSegundos) {
        System.out.println("Grabando audio de " + getNombre() + " por " + duracionSegundos + " segundos.");
    }
}

// Clase Hija que hereda de la clase abstracta (hereda tocar() y afinar())
class Percusion extends InstrumentoMusical {
    public Percusion(String nombre) {
        super(nombre);
    }

    // Implementación obligatoria del método abstracto 'tocar'
    @Override
    public void tocar() {
        System.out.println(getNombre() + " está siendo golpeado rítmicamente.");
    }
}

// -------------------------------------------------------------------
// 5. CLASE ESTÁTICA (Ejemplo de utilidad)
// -------------------------------------------------------------------
// No es una 'clase estática' en el sentido estricto de Java, pero se
// usa una clase con solo métodos y atributos estáticos para simularla.
class UtilidadesMusica {
    // Atributo estático: Pertenece a la clase, no a una instancia.
    public static int contadorInstrumentos = 0;

    // Método estático: Se puede llamar sin crear una instancia de UtilidadesMusica.
    public static void incrementarContador() {
        contadorInstrumentos++;
    }
}


// -------------------------------------------------------------------
// CLASE PRINCIPAL para la ejecución
// -------------------------------------------------------------------
public class PrincipiosPOO {

    public static void main(String[] args) {
        System.out.println("--- DEMOSTRACIÓN DE POO ---");
        
        // Uso de Clase Estática y Atributo Final
        System.out.println("Tipo de Sonido Base (Constante FINAL): " + InstrumentoMusical.TIPO_SONIDO);

        // Creación de objetos usando el polimorfismo implícito
        // La variable es del tipo de la clase abstracta (padre), pero el objeto
        // es de la clase hija.
        InstrumentoMusical guitarra = new InstrumentoDeCuerda("Guitarra Eléctrica", 6);
        UtilidadesMusica.incrementarContador(); // Uso de método estático
        
        InstrumentoMusical bateria = new Percusion("Batería Electrónica");
        UtilidadesMusica.incrementarContador();
        
        // Uso de una clase que implementa una interfaz
        InstrumentoDeCuerda violin = new InstrumentoDeCuerda("Violín Acústico", 4);
        UtilidadesMusica.incrementarContador();

        System.out.println("\n--- HERENCIA Y ABSTRACCIÓN ---");
        
        // Ambos objetos pueden llamar a 'afinar' (método heredado)
        guitarra.afinar();
        bateria.afinar();

        System.out.println("\n--- POLIMORFISMO ---");
        
        // 4. POLIMORFISMO (múltiples formas): El mismo método 'tocar()' se 
        // comporta de manera diferente según el tipo real de objeto.
        guitarra.tocar(); // Llama a la implementación de InstrumentoDeCuerda
        bateria.tocar();  // Llama a la implementación de Percusion
        
        System.out.println("\n--- ENCAPSULAMIENTO ---");
        // El atributo 'nombre' es privado, usamos el getter
        System.out.println("Nombre actual: " + guitarra.getNombre());
        // Usamos el setter para modificar el valor privado
        guitarra.setNombre("Guitarra de 7 Cuerdas");
        System.out.println("Nuevo nombre: " + guitarra.getNombre());
        
        System.out.println("\n--- INTERFACES ---");
        violin.grabarAudio(60); // Método implementado de la interfaz PuedeGrabar
        
        System.out.println("\n--- ESTADÍSTICAS ---");
        System.out.println("Total de instrumentos creados (atributo estático): " + UtilidadesMusica.contadorInstrumentos);

    } // Fin del main
} // Fin de la clase PrincipiosPOO