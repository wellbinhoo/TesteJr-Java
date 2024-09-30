package main;

public class Main {

    public static void main(String[] args) {

        int[][] notas = {{3 , 2},
                        {150 , 3},
                        {7 , -1},
                        {-2 , 5},
                        {50, 3}};


        for(int[] item:notas) {
            int x = item[0];
            int y = item[1];
            int z = calcular(x , y);

            String resultado = resultado(z);
            String format = "%3s%5d%3s%5d%3s%3d%10s%1s\n";

            System.out.format(format,"X: " ,x," | Y :" ,y," | Z: " ,z," | Resultado: ",resultado);

        }


        }



    public static int calcular (int x , int y ){

        return  x * y + 5;
    }


    public static String resultado(int z){

        return z <= 0 ? "A" : z <= 100 ? "B" : "C";

    }

}


