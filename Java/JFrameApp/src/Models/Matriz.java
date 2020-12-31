
package Models;

import java.util.Random;

public class Matriz {
    private int[][] valores;
    public Matriz(int filas, int columnas){
        valores = new int[filas][columnas];
        LlenarMatriz(9);
    }
    private void LlenarMatriz(int bound){
        Random r = new Random(System.currentTimeMillis());
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[0].length; j++) {
                valores[i][j] = r.nextInt(bound);
            }
        }
    }
    public int GetValue(int x, int y){
        return valores[x][y];
    }

}
