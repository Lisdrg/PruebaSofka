public class ImpresorNumeros {
    private String back = " ";
    private String vert = "|";
    int col_ini = 0;
    int col = 0;
    int fila = 0;
    String[][] matriz;


    public void imprimirNumeros(char[] nums, String[][] matriz, int size) {

        int fil_ini = 0;
        this.matriz = matriz;
        for (char c : nums) {
            int j, k;
            switch (c) {
                case '0':
                    imprimirCero(size);
                    break;

                case '1':
                    imprimirUno(size);
                    break;

                case '2':
                    imprimirDos(size);
                    break;

                case '3':
                    imprimirTres(size);
                    break;
                case '4':
                    imprimirCuatro(size);
                    break;

                case '5':
                    imprimirCinco(size);
                    break;

                case '6':
                    imprimirSeis(size);
                    break;

                case '7':
                    imprimirSiete(size);
                    break;

                case '8':
                   imprimirOcho(size);
                    break;

                case '9':
                    imprimirNueve(size);
                    break;

                default:
                    break;
            }
        }
        imprimir_display(matriz);

    }
    private void imprimirCero(int siz) {
        inicializarImpresorNumeros(false, siz);
        for (int j = 0; j < ((2 * siz) - 1); j++) {
            col++;
            matriz[fila][col] = vert;
            col = espacio_display(siz, fila, col, matriz);
            col++;
            matriz[fila][col] = vert;
            col = col_ini;
            fila++;
        }
        col++;
        matriz[fila][col] = vert;
        col = columna_display(siz, fila, col, matriz);
        col++;
        matriz[fila][col] = vert;
        col_ini = col + 2;
    }

    private void imprimirUno(int siz) {
        inicializarImpresorNumeros(true, siz);
        for (int j = 0; j < ((2 * siz) - 1); j++) {
            col++;
            matriz[fila][col] = back;
            col = espacio_display(siz, fila, col, matriz);
            col++;
            matriz[fila][col] = vert;
            col = col_ini;
            fila++;
        }
        col++;
        matriz[fila][col] = back;
        col = espacio_display(siz, fila, col, matriz);
        col++;
        matriz[fila][col] = vert;
        col_ini = col + 2;
    }

    private void imprimirDos(int siz) {
        inicializarImpresorNumeros(false, siz);
        for (int j = 0; j < ((2 * siz) - 1); j++) {
            col++;
            if (j <= siz - 1) {
                matriz[fila][col] = back;
            } else {
                matriz[fila][col] = vert;
            }
            if (j == siz - 1) {
                col = columna_display(siz, fila, col, matriz);
            } else {
                col = espacio_display(siz, fila, col, matriz);
            }
            col++;
            if (j <= siz - 1) {
                matriz[fila][col] = vert;
            }
            col++;
            matriz[fila][col] = back;
            col = col_ini;
            fila++;
        }
        col++;
        matriz[fila][col] = vert;
        col = columna_display(siz, fila, col, matriz);
        col++;
        matriz[fila][col] = back;
        col_ini = col + 2;
        col++;
    }

    private void imprimirTres(int siz) {
        inicializarImpresorNumeros(false, siz);
        for (int j = 0; j < ((2 * siz) - 1); j++) {
            col++;
            matriz[fila][col] = back;
            if (j == siz - 1) {
                col = columna_display(siz, fila, col, matriz);
            } else {
                col = espacio_display(siz, fila, col, matriz);
            }
            col++;
            matriz[fila][col] = vert;
            col = col_ini;
            fila++;
        }
        col++;
        matriz[fila][col] = back;
        col = columna_display(siz, fila, col, matriz);
        col++;
        matriz[fila][col] = vert;
        col_ini = col + 2;
    }

    private void imprimirCuatro(int siz) {
        inicializarImpresorNumeros(true, siz);
        for (int j = 0; j < ((2 * siz) - 1); j++) {
            col++;
            if (j > siz - 1) {
                matriz[fila][col] = back;
            } else {
                matriz[fila][col] = vert;
            }
            if (j == siz - 1) {
                col = columna_display(siz, fila, col, matriz);
            } else {
                col = espacio_display(siz, fila, col, matriz);
            }
            col++;
            matriz[fila][col] = vert;
            col++;
            matriz[fila][col] = back;
            col = col_ini;
            fila++;
        }
        col++;
        matriz[fila][col] = back;
        col = espacio_display(siz, fila, col, matriz);
        col++;
        matriz[fila][col] = vert;
        col_ini = col + 2;
        col++;
    }

    private void imprimirCinco(int size){
        inicializarImpresorNumeros(false,size);
        for (int j = 0; j < ((2 * size) - 1); j++) {
            col++;
            if (j > size - 1) {
                matriz[fila][col] = back;
            } else {
                matriz[fila][col] = vert;
            }

            if (j == size - 1) {
                col = columna_display(size, fila, col, matriz);
            } else {
                col = espacio_display(size, fila, col, matriz);
            }
            col++;
            if (j > size - 1) {
                matriz[fila][col] = vert;
            }
            col++;
            matriz[fila][col] = back;
            col = col_ini;
            fila++;
        }
        col++;
        matriz[fila][col] = back;
        col = columna_display(size, fila, col, matriz);
        col++;
        matriz[fila][col] = vert;
        col_ini = col + 2;
        col++;
    }

    private void imprimirSeis(int size){
        inicializarImpresorNumeros(false,size);
        for (int j = 0; j < ((2 * size) - 1); j++) {
            col++;
            matriz[fila][col] = vert;
            if (j == size - 1) {
                col = columna_display(size, fila, col, matriz);
            } else {
                col = espacio_display(size, fila, col, matriz);
            }
            col++;
            if (j > size - 1) {
                matriz[fila][col] = vert;
            }
            col++;
            matriz[fila][col] = back;
            col = col_ini;
            fila++;
        }
        col++;
        matriz[fila][col] = vert;
        col = columna_display(size, fila, col, matriz);
        col++;
        matriz[fila][col] = vert;
        col_ini = col + 2;
        col++;
    }

    private void imprimirSiete(int size){
        inicializarImpresorNumeros(false,size);
        for (int j = 0; j < ((2 * size) - 1); j++) {
            col++;
            matriz[fila][col] = back;
            col = espacio_display(size, fila, col, matriz);
            col++;
            matriz[fila][col] = vert;
            col = col_ini;
            fila++;
        }
        col++;
        matriz[fila][col] = back;
        col = espacio_display(size, fila, col, matriz);
        col++;
        matriz[fila][col] = vert;
        col_ini = col + 2;
    }

    private void imprimirOcho(int size){
        inicializarImpresorNumeros(false,size);

        for (int j = 0; j < ((2 * size) - 1); j++) {
            col++;
            matriz[fila][col] = vert;
            if (j == size - 1) {
                col = columna_display(size, fila, col, matriz);
            } else {
                col = espacio_display(size, fila, col, matriz);
            }
            col++;
            matriz[fila][col] = vert;
            col = col_ini;
            fila++;
        }
        col++;
        matriz[fila][col] = vert;
        col = columna_display(size, fila, col, matriz);
        col++;
        matriz[fila][col] = vert;
        col_ini = col + 2;
    }

    private void imprimirNueve(int size){
        inicializarImpresorNumeros(false,size);

        for (int j = 0; j < ((2 * size) - 1); j++) {
            col++;
            if (j > size - 1) {
                matriz[fila][col] = back;
            } else {
                matriz[fila][col] = vert;
            }
            if (j == size - 1) {
                col = columna_display(size, fila, col, matriz);
            } else {
                col = espacio_display(size, fila, col, matriz);
            }
            col++;
            matriz[fila][col] = vert;
            col++;
            matriz[fila][col] = back;
            col = col_ini;
            fila++;
        }
        col++;
        matriz[fila][col] = back;
        col = columna_display(size, fila, col, matriz);
        col++;
        matriz[fila][col] = vert;
        col_ini = col + 2;
        col++;
    }

    private void inicializarImpresorNumeros(boolean esEspacio, int siz) {
        int fil_ini = 0;
        col = col_ini;
        fila = fil_ini;
        matriz[fila][col] = back;
        col++;
        if (esEspacio) {
            col = espacio_display(siz, fila, col, matriz);
        } else {
            col = columna_display(siz, fila, col, matriz);
        }
        col++;
        matriz[fila][col] = back;
        col = col_ini;
        fila++;
    }

    int columna_display(int siz, int fila, int col, String matriz[][]) {
        for (int i = 0; i < siz - 1; i++) {
            col++;
            matriz[fila][col] = "_";
            col++;
            matriz[fila][col] = back;
        }
        col++;
        matriz[fila][col] = "_";
        return col;
    }

    int espacio_display(int siz, int fila, int col, String matriz[][]) {
        for (int i = 0; i < siz - 1; i++) {
            col++;
            matriz[fila][col] = back;
            col++;
            matriz[fila][col] = back;
        }
        col++;
        matriz[fila][col] = back;
        return col;
    }

    void imprimir_display(String matriz[][]) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]);
            }
            System.out.println();
        }
    }


}
