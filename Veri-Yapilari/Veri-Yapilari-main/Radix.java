import java.util.Arrays;

public class Radix {
    public static void main(String[] args){
        int[] d={178,12,9,19,54,17,23,453,1,70,20,30};
        System.out.println(Arrays.toString(d));
        Radix.radixSort(d);
        System.out.println(Arrays.toString(d));

    }
    public static void countSort(int [] d, int e){
        int n=d.length;
        int [] t=new int[n];
        int [] c= new int[10];
        int i=0;
        for(i=0;i<n;i++){
            c[(d[i]/e)%10]++;
        }
        for(i=1;i<10;i++){
            c[i]+=c[i-1];
        }
        for(i=n-1;i>=0;i--){
            t[c[(d[i]/e)%10]-1]=d[i];
             c[(d[i]/e)%10]--;
            
        }
        for(i=0;i<n;i++){
            d[i]=t[i];
        }
    }

    public static void radixSort(int[]d){
        int max=Radix.findMax(d);
        for(int e=1; (max/e)>0;e*=10){
            Radix.countSort(d, e);
        }
    }
    public static int findMax(int [] d){
        int max=d[0];
        for(int i=1;i<d.length;i++){
            if(d[i]>max) max=d[i];
        }
        return max;
    }



}
