import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        int [] array = {10, 5, 87, 190, 55, 1, 274};
        System.out.println(Arrays.toString(array));
        for (int i=array.length - 1; i > 0; i--){
            for ( ;i >= 0;i++){
                if (array[i] < array[i - 1]) {
                    change(array, i, i - 1);
                }
                else {
                break;}
            }
        }
        System.out.println(Arrays.toString(array));
    }
    private static void change(int [] array, int x, int y){
       int p = array[x];
       array[x] = array [y];
       array [y] = p;


    }

}
