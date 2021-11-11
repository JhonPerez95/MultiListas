package multilistas;

//import javafx.scene.Node;
import javax.swing.JOptionPane;
import org.w3c.dom.Node;

/**
 *
 * @author jhonperez
 */
public class Listaenlazadasimple {

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
        JOptionPane.showMessageDialog(null,
                "El estudiante que mas paga es:\n"
                + "- Nombre: " + mayormatricula.nombre + "\n"
                + "- Numero Carnet: " + mayormatricula.carnet
        );
    }

    private void printTotal(Nodo aux) {

        JOptionPane.showMessageDialog(null,
                "Estudiante:"
                + "\n-Nombre del Estudiante: " + aux.nombre
                + "\n-Numero del carnet: " + aux.carnet
                + "\n-Credito: " + aux.credito
                + "\n-Descuento: " + aux.descuento
                + "\n-Matricula que debe pagar: " + aux.vMatricula
        );
    }

    public Node head = null;
    public Node tail = null;
}
