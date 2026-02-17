
import javax.swing.JOptionPane;

public class Matriz{


    public static boolean esSimetrica(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz.length; j++) {

                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de filas"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de columnas"));

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                matriz[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese valor en [" + i + "][" + j + "]"));
            }
        }

        String mostrar = "Matriz ingresada:\n";

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                mostrar += matriz[i][j] + " ";
            }
            mostrar += "\n";
        }

        JOptionPane.showMessageDialog(null, mostrar);

        if (filas != columnas) {
            JOptionPane.showMessageDialog(null, "La matriz NO puede ser simétrica porque no es cuadrada");
        } else {

            if (esSimetrica(matriz)) {
                JOptionPane.showMessageDialog(null, "La matriz ES simétrica");
            } else {
                JOptionPane.showMessageDialog(null, "La matriz NO es simétrica");
            }
        }
    }
}
