/*Prueba Técnica Sofka Technologhies
     Lis Dayanara Rojas Guzmán
      Ingeniera Electrónica*/

import javax.swing.*;

public class Prueba {

    private static String[][] matriz;
    private static String back = " ";
    private static String vert = "|";
    private static int col;
    private static int fila;

    public static void main(String[] args) {
        //try {
        int tamaño = 0;
        String finalizar;
        String[] cadena = new String[100];
        String[] numero;
        String num;
        boolean terminar = false;
        ImpresorNumeros impresor = new ImpresorNumeros();


        JOptionPane.showMessageDialog(null, "Bienvenido, a continuación ingrese dos numeros separados por una ',' El primero representa el tamaño de la impresión, el segundo el número a imprimir. Digite 0,0 para finalizar.");
        do {
            cadena[tamaño] = JOptionPane.showInputDialog("Ingrese los números así: número,número. Luego 0,0 para finalizar");
            finalizar = cadena[tamaño];
            tamaño++;
            if (finalizar.equals("0,0")) {
                terminar = true;
            }
        } while (!terminar);

        int i = 0;
        String[] size_String = new String[tamaño];
        String[] mostrarNum = new String[tamaño];

        int[] size = new int[tamaño];
        int[] num_mostrar = new int[tamaño];
        int num_lim;
        while (i != tamaño) {
            num = cadena[i];
            numero = num.split(",");
            size_String[i] = numero[0];
            mostrarNum[i] = numero[1];
            size[i] = Integer.parseInt(size_String[i]);
            num_mostrar[i] = Integer.parseInt(mostrarNum[i]);
            i++;
            System.out.println();
        }
        int siz = 0;
        char[] nums;


        int col_ini, fil_ini = 0;
        for (i = 0; i < tamaño - 1; i++) {
            col = 0;
            col_ini = 0;
            num_lim = (size[i] * 2) + 3;
            matriz = new String[num_lim][1000];
            for (int x = 0; x < matriz.length; x++) {
                for (int y = 0; y < matriz[x].length; y++) {
                    matriz[x][y] = back;
                }
            }
            siz = size[i];
            nums = mostrarNum[i].toCharArray();
            impresor.imprimirNumeros(nums, matriz, siz);
        }
    }

}
