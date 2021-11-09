package multilistas;


/**
 *
 * @author jhonperez
 */
public class ListaEnlazadaSimple {

    private static Nodo raiz;

    public void agregar(Nodo elemento) {
        if (raiz == null) {
            raiz = new Nodo();
            raiz = elemento;

        } else {
            Nodo aux = raiz;
            while (aux.sig != null) {
                aux = aux.sig;

            }
            aux.sig = elemento;

        }
    }

    public void imprimir() {
        Nodo aux = raiz;
        while (aux != null) {
            printTotal(aux);

            aux = aux.sig;
        }
    }

    public void printMayorMatricula() {
        Nodo aux = raiz;
        Nodo mayormatricula = aux;
        while (aux != null) {

            if (mayormatricula.vMatricula < aux.vMatricula) {
                mayormatricula = aux;
            }

            aux = aux.sig;
        }
        System.out.println("El carnet del estudiante que mas paga es: " + mayormatricula.carnet);
    }

    private void printTotal(Nodo aux) {
        System.out.println("____________________________");

        System.out.println("Nombre del Estudiante: " + aux.nombre);

        System.out.println("Numero del carnet: " + aux.carnet);

        System.out.println("Credito: " + aux.credito);

        System.out.println("Descuento: " + aux.descuento);

        System.out.println("Matricula que debe pagar: " + aux.vMatricula);

    }

    public Node head = null;
    public Node tail = null;

    public void maxNodo() {
        Node Nodo = null;
        Node current = Nodo;
        int max;

        if (Nodo == null) {
            System.out.println("La lista esta vacia");
        } else {

        }
    }

}
