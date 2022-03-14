
import java.util.Scanner;

public class Pencarian03 {

    public static void main(String[] args) {
        int[][] data = {
            {2, 3, 4, 1, 7},
            {25, 6, 7, 8, 8},
            {8, 7, 12, 4, 6},
            {2, 3, 4, 1, 7},
            {25, 6, 7, 8, 8},
            {8, 7, 12, 4, 6}
        };
        System.out.println("--------------------------------------");
        System.out.println("Array Data");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
        System.out.print("Masukkan elemen yang akan dicari: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        //algoritma pencarian
        int posX = -1;
        int posY = -1;
        loop1:
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == key) {
                    posX = i;
                    posY = j;
                    System.out.println("key: " + key + " ditemukan di titik(" + posX+","+posY+")");
                    //break loop1;
                }
            }
        }
        
        if(posX==-1&&posY==-1){
            System.out.println("Key "+key+" Tidak Ditemukan di dalam array data");
        }
    }
}
