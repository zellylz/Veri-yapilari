import java.util.Arrays;

public class Karınca {

    public static void main(String[] args){

        int [] d={2,45,32,22,1,11,23,57,123};
        System.out.println(Arrays.toString(d));
        Karınca.quickSort(d,0,d.length-1);
        System.out.println(Arrays.toString(d));
    }
        public static void quickSort(int[] d,int l,int r){
            if(l<r){
                int pi=partititon(d,l,r);
                quickSort(d,l,pi);
                quickSort(d,pi+1,r);
            }

        }

        public static int partititon(int []d ,int l,int r){
            int pi=l+(r-l)/2;
            int  i=0;
            int j=pi-1;
            do{
                while(d[i] <d[pi] && i<r)i++;
                while(d[j] >d[pi] && j>0)j--;
                if(i<j) swap(d,i,j);
            }
            while(i<j); swap(d,i,pi);


            return i;

        }
        public static void swap(int [] d,int i,int j){
            int tmp=d[i];
            d[i]=d[j];
            d[j]=tmp;
        }

    }
    

