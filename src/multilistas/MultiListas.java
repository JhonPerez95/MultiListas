package multilistas;

import javax.swing.JOptionPane;

public class MultiListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        while (true) {

            // Atrapamos el valor que el usuario digite
            String menuMessage = JOptionPane.showInputDialog(null,
                    "------------MATRICULA-----------\n"
                    + "1. Ingresar estudiantes\n"
                    + "2. Mostrar los estudiantes y su descuento\n"
                    + "3. Ver el estudiante que mas debe pagar\n"
                    + "- Cualquier otra tecla para cerrar!\n",
                    "Ingrese una opcion");

            switch (menuMessage) {
                case "1":
                    System.out.println("La opcion digitada por el usuario: " + menuMessage);
                    break;
                case "2":
                    System.out.println("La opcion digitada por el usuario: " + menuMessage);

                    break;
                case "3":
                    System.out.println("La opcion digitada por el usuario: " + menuMessage);

                    break;
                default:
                    System.out.println("La opcion digitada por el usuario: " + menuMessage);
                    JOptionPane.showMessageDialog(null, "Vuela pronto!");
                    System.exit(0);
            }
        }
    }

}
