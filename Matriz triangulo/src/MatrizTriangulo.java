import javax.swing.JOptionPane;

public class MatrizTriangulo{

    public static int[][] crearTriangulo(int filas) {

        int[][] matriz = new int[filas][];

        for (int i = 0; i < filas; i++) {

            matriz[i] = new int[2 * i + 1];

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 1;
            }
        }

        return matriz;
    }

    public static void main(String[] args) {

        int filas = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el tamaño del triángulo"));

        int[][] matriz = crearTriangulo(filas);

        String mostrar = "";

        for (int i = 0; i < matriz.length; i++) {

            for (int k = 0; k < filas - i - 1; k++) {
                mostrar += " ";
            }

            for (int j = 0; j < matriz[i].length; j++) {
                mostrar += "*";
            }

            mostrar += "\n";
        }

        JOptionPane.showMessageDialog(null, mostrar);
    }
}