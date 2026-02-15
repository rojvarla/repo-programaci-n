import javax.swing.JOptionPane;

public class ArregloNotas {

    public static void main(String[] args) {

        int cantidadNotas = Integer.valueOf(JOptionPane.showInputDialog(null, "ingrese el numero de notas"));

        double [] notas = new double[cantidadNotas];

        for ( int i = 0; i < notas.length; i++){

            notas[i]= Double.valueOf(JOptionPane.showInputDialog("ingrese el valor de la nota: " + (i + 1)));
        }

        String situaciónCurso= determinarAprobacion(cantidadNotas);








        double notaDefinitiva = calcularNotaDefinitiva(notas);
        double mayor = obtenerMayor(notas);
        JOptionPane.showMessageDialog(null,
                "El promedio es: " + notaDefinitiva +
                        "\nEl número mayor es: " + obtenerMayor(notas) +
                        "\nEl número menor es: " + obtenerMenor(notas) +
                        "\nEstado: " + determinarAprobacion(notaDefinitiva) +
                        "\n\nNotas ordenadas:\n" +
                        java.util.Arrays.toString(ordenarBurbuja(notas))
        );



    }
    public static double calcularNotaDefinitiva(double [] notas){

        double notaDefinitiva= 0;

        double suma= 0;

        for(int i = 0; i < notas.length; i++){
            suma+=notas[i];
        }
        return notaDefinitiva= suma / notas.length;
    }
    public static double obtenerMayor(double[] notas){

        double mayor = notas[0];

        for(int i= 0 ; i < notas.length; i++){
            if(notas [i]> mayor){
                mayor= notas[i];
            }
        }
        return mayor;
    }
    public static double obtenerMenor(double[] notas){

        double menor = notas[0];

        for(int i= 0 ; i < notas.length; i++){
            if(notas [i] < menor){
                menor= notas[i];
            }
        }
        return menor ;
    }
    /*
     * tarea: hacer una nueva funcionalidad
     * metodo que por medio del promedio indica si aprobo, reprobo( sin posibilidad o con posibilidad de habilitar el curso)
     */
    public static String determinarAprobacion(double notaDefinitiva){

        if(notaDefinitiva < 2.5){
            return "Reprobó sin posibilidad de habilitar";
        }
        else if(notaDefinitiva < 3.0){
            return "Reprobó con derecho a habilitar";
        }
        else if(notaDefinitiva < 4.5){
            return "Aprobó";
        }
        else{
            return "Aprobó con excelencia";
        }
    }
    public static double [] ordenarBurbuja (double [] notas){

        double aux;
        boolean cambios = true;

        while (cambios) {
            cambios = false;
            for (int i = 1; i < notas.length; i++) {
                if (notas[i] < notas[i - 1]) {
                    aux = notas[i];
                    notas[i] = notas[i - 1];
                    notas[i - 1] = aux;
                    cambios = true;
                }
            }
        }
        return notas;

    }
}




