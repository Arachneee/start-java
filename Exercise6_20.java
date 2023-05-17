import java.util.*;
class Exercise6_20
{
    static int[] shuffle(int [] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int var = (int)(Math.random()*n);
            int temp = arr[var];
            arr[var] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }
}
