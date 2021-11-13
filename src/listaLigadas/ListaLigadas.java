package listaLigadas;

import javax.swing.JOptionPane;

public class ListaLigadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double i = 0;

        Listaenlazadasimple lista = new Listaenlazadasimple();

        while (true) {

            // Atrapamos el valor que el usuario digite
            String menuMessage = JOptionPane.showInputDialog(null,
                    "------------MATRICULA-----------\n"
                    + "1. Ingresar estudiantes\n"
                    + "2. Mostrar los estudiantes y su descuento\n"
                    + "3. Ver el estudiante que mas debe pagar\n"
                    + "- Cualquier otra tecla para cerrar!\n"
            );

            switch (menuMessage) {
                case "1":
                    System.out.println("La opcion digitada por el usuario: " + menuMessage);

                    // Atrapamos valores de los inpunt del flujo
                    String nombre = JOptionPane.showInputDialog("Nombre del Estudiante ?");
                    int carnet = Integer.parseInt(JOptionPane.showInputDialog("Numero del Carnet ?"));
                    int credito = Integer.parseInt(JOptionPane.showInputDialog("Numero de Creditos ?"));
                    int vCredito = Integer.parseInt(JOptionPane.showInputDialog("Valor de Credito ?"));
                    int descuento = Integer.parseInt(JOptionPane.showInputDialog("Procentaje Descuento ?"));

                    // ESTRUCTURA DE LOS DATOS PERTENECIENTES AL NODO
                    Nodo aux = new Nodo();
                    aux.nombre = nombre;
                    aux.carnet = carnet;
                    aux.credito = credito;
                    aux.vCredito = vCredito;
                    aux.descuento = descuento;
                    i = (credito * vCredito) * descuento / 100;
                    aux.vMatricula = (int) ((credito * vCredito) - i);

                    lista.agregar(aux);
                    break;
                case "2":
                    System.out.println("La opcion digitada por el usuario: " + menuMessage);
                    lista.imprimir();

                    break;
                case "3":
                    System.out.println("La opcion digitada por el usuario: " + menuMessage);
                    lista.printMayorMatricula();
                    break;
                default:
                    System.out.println("Cierre de la aplicacion");
                    JOptionPane.showMessageDialog(null, "Vuela pronto!");
                    System.exit(0);
            }
        }
    }

}
