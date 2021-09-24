import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,6};
        int[] b=new int[]{3,5,7,8,9,19};
        int i = 0, j = 0, k = 0;
        int n =a.length+b.length;
        int[] c = new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) {
                c[k] = a[i];
                i++;
            }
            else{
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if(i == a.length){
            while(k<n){
               c[k] = b[j];
               j++;
               k++;
            }
        }
        else if(j == b.length){
            while (k<n){
                c[k] = a[i];
                i++;
                k++;
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
