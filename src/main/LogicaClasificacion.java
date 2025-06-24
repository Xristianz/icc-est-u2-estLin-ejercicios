package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte una cadena de texto utilizando una pila (Stack).
     *
     * @param texto Cadena original a invertir.
     * @return Cadena invertida.
     *
     *         Ejemplo:
     *         Entrada: "Hola Mundo"
     *         Salida: "odnuM aloH"
     */
    public String invertirCadena(String texto) {
        Stack<Character> pila = new Stack<>();
        for (int i=0; i<texto.length();i++){
            pila.push(texto.charAt(i));
        }
        StringBuilder invertir = new StringBuilder();
        while(!pila.isEmpty()){
            invertir.append(pila.pop());
        }
        return invertir.toString();
    }

    /**
     * Verifica si los símbolos de paréntesis, corchetes y llaves están bien
     * balanceados.
     *
     * @param expresion Cadena con símbolos.
     * @return true si está balanceada, false en caso contrario.
     *
     *         Ejemplo:
     *         Entrada: "{[()]}"
     *         Salida: true
     */
    public boolean validarSimbolos(String expresion) {
        Stack<Character> pila = new Stack<>();
        for(int i=0; i<expresion.length(); i++){
            char c = expresion.charAt(i);
            if(c=='['|| c=='{' || c=='('){
                pila.push(c);
            }else{
                if(pila.isEmpty()) return false;
                char cabeza = (char) pila.pop();
                if((c=='}' && cabeza=='{')||
                    (c==')' && cabeza=='(')||
                    (c==']' && cabeza=='[')){
                    return true;

                }
            }
            
        }
        return false;
    }

    /**
     * Ordena una pila de enteros en orden ascendente usando otra pila auxiliar.
     *
     * @return Lista ordenada.
     *
     *         Ejemplo:
     *         Entrada: [3, 1, 4, 2]
     *         Salida: [1, 2, 3, 4]
     */
    public List<Integer> ordenarPila(Stack<Integer> pila) {
        Stack<Integer> pilaAux = new Stack<>();
        while(!pila.isEmpty()){
            int aux = pila.pop();
            while(pilaAux.peek()>aux){
                pila.push(pilaAux.pop());

            }
            pilaAux.push(aux);
        }
        while(){
            
        }

        return new ArrayList<>();
    }

    /**
     * Clasifica una lista de enteros separando pares e impares.
     * Usa LinkedList para mantener el orden de inserción.
     *
     * @return Lista con pares primero, luego impares.
     *
     *         Ejemplo:
     *         Entrada: [1, 2, 3, 4, 5, 6]
     *         Salida: [2, 4, 6, 1, 3, 5]
     */
    public List<Integer> clasificarPorParidad(LinkedList<Integer> original) {
        List<Integer> fin = new  LinkedList<>();
        for(int numero : original){
            if(numero%2==0){
                fin.add(numero);
            }
        }
        for(int numero: original){
            if(numero%2!=0){
                fin.add(numero);
            }
        }

        return new ArrayList<>(fin);
    }
}
