/**
 * @Nombre: EstructurasDeDatos.java
 * @Descripción: Demostración de las estructuras de datos fundamentales
 * del Java Collections Framework: List, Set, Map y Queue.
 * @Autor: Gemini (asistente de IA)
 * @Fecha: Noviembre 2025
 */

import java.util.ArrayList; // Implementación común de List
import java.util.HashSet;   // Implementación común de Set
import java.util.HashMap;   // Implementación común de Map
import java.util.LinkedList; // Puede usarse como List o Queue

public class EstructurasDeDatos {

    public static void main(String[] args) {
        
        // -------------------------------------------------------------------
        // 1. LIST (ArrayList) 📋 - Colección ORDENADA que permite DUPLICADOS
        // -------------------------------------------------------------------
        System.out.println("=== 1. LIST (ArrayList) ===");
        
        // Un ArrayList es dinámico y usa un arreglo (array) interno.
        ArrayList<String> lenguajes = new ArrayList<>();
        
        // A. Agregar elementos (se mantiene el orden de inserción)
        lenguajes.add("Python");
        lenguajes.add("Java");
        lenguajes.add("Dart");
        lenguajes.add("Python"); // Duplicado permitido
        
        // B. Acceder por índice (posición)
        System.out.println("Primer lenguaje (índice 0): " + lenguajes.get(0));
        
        // C. Tamaño y eliminación
        System.out.println("Tamaño inicial: " + lenguajes.size());
        lenguajes.remove("Python"); // Elimina la primera ocurrencia
        System.out.println("Tamaño después de remover: " + lenguajes.size());
        
        // D. Recorrer la lista
        System.out.print("Contenido final de la lista: ");
        for (String lang : lenguajes) {
            System.out.print(lang + " | ");
        }
        System.out.println("\n");
        
        // -------------------------------------------------------------------
        // 2. SET (HashSet) 🧩 - Colección SIN ORDEN y NO permite DUPLICADOS
        // -------------------------------------------------------------------
        System.out.println("=== 2. SET (HashSet) ===");
        
        // Un HashSet usa una tabla hash para un acceso rápido (O(1)).
        HashSet<String> devOpsSkills = new HashSet<>();
        
        // A. Agregar elementos
        devOpsSkills.add("Docker");
        devOpsSkills.add("Kubernetes");
        devOpsSkills.add("Bash");
        devOpsSkills.add("Docker"); // Este duplicado es ignorado por el Set
        
        // B. Verificar existencia
        System.out.println("¿Contiene 'Kubernetes'? " + devOpsSkills.contains("Kubernetes"));
        
        // C. Recorrer el Set (el orden no está garantizado)
        System.out.print("Skills en el Set: ");
        for (String skill : devOpsSkills) {
            System.out.print(skill + " | ");
        }
        System.out.println("\n");
        
        // -------------------------------------------------------------------
        // 3. MAP (HashMap) 🗺️ - Almacena pares Clave-Valor. Las CLAVES son ÚNICAS
        // -------------------------------------------------------------------
        System.out.println("=== 3. MAP (HashMap) ===");
        
        // Clave (Integer) -> Valor (String)
        HashMap<Integer, String> herramientas = new HashMap<>();
        
        // A. Agregar pares (put)
        herramientas.put(3018, "Router CNC Genmitsu");
        herramientas.put(10, "Grabador Láser ATOMSTACK");
        herramientas.put(3, "Impresora 3D Creality");
        
        // B. Obtener un valor a partir de su clave (get)
        System.out.println("Herramienta con clave 10: " + herramientas.get(10));
        
        // C. Sustituir un valor (si la clave ya existe, se sobrescribe)
        herramientas.put(3, "Ender S3 V2 (Sustituida)");
        System.out.println("Clave 3 después de sobrescribir: " + herramientas.get(3));
        
        // D. Iterar sobre las claves y valores
        System.out.println("Pares Clave-Valor:");
        for (Integer clave : herramientas.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + herramientas.get(clave));
        }
        System.out.println();
        
        // -------------------------------------------------------------------
        // 4. QUEUE (LinkedList) ⏳ - Usada para procesamiento FIFO (First In, First Out)
        // -------------------------------------------------------------------
        System.out.println("=== 4. QUEUE (LinkedList) ===");
        
        // LinkedList implementa la interfaz Queue y usa una lista doblemente enlazada.
        LinkedList<String> colaDeImpresion = new LinkedList<>();
        
        // A. Agregar elementos a la cola (offer/add)
        colaDeImpresion.offer("Tesis Doctoral (P1)"); // Primer elemento en entrar
        colaDeImpresion.offer("Artículo Conferencia (P2)");
        colaDeImpresion.offer("Gráficos Plotly (P3)"); // Último elemento en entrar
        
        // B. Consultar el elemento en cabeza sin eliminarlo (peek)
        System.out.println("Elemento en cabeza (sin eliminar): " + colaDeImpresion.peek());
        
        // C. Eliminar y obtener el elemento en cabeza (poll)
        String trabajoAtendido = colaDeImpresion.poll();
        System.out.println("Trabajo atendido (eliminado): " + trabajoAtendido);
        
        // D. El siguiente elemento en la cola
        System.out.println("Siguiente en la cola: " + colaDeImpresion.peek());

    } // Fin del main
} // Fin de la clase EstructurasDeDatos