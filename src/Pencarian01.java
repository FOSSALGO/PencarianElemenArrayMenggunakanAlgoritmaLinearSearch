
import java.util.Arrays;
import java.util.Scanner;


public class Pencarian01 {

    public static void main(String[] args) {
        int[] data = {1, 4, 5, 6, 8, 3, 4, 9};
        System.out.println(Arrays.toString(data));
        System.out.print("Masukkan elemen yang akan dicari: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        
        int pos = -1;
        for(int i=0;i<data.length;i++){
            if(data[i]==key){
                pos = i;
                System.out.println("key: "+key+" ditemukan di index-"+pos);
                break;
            }
        }
        if(pos==-1){
            System.out.println("Key "+key+" Tidak Ditemukan di dalam array data");
        }
    }
}
