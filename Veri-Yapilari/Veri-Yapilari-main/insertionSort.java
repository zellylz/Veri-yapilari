public class insertionSort {
    int dizi[];

        public insertionSort(int boyut){
            dizi=new int[boyut];
        }
        public void insertionSort(){
            int i=0,j=0,t=0;
            for(i=0;i<dizi.length;i++){
                t=dizi[i];
                for(j=i;j>0 &&dizi[j]>t;j--){
                    dizi[j]=dizi[j-1];
                }
                dizi[j]=t;

            }

        }
        public void SelectionSort(){
            int i=0,j=0;
            int tmp=0;
            for(i=0;i<dizi.length;i++){
                int min=i;
                for(j=i+1;j<dizi.length;j++){
                        if(dizi[j]<dizi[min]){
                            min=j;
                        }

                }
                if(dizi[min]!=dizi[i]){
                    tmp=dizi[min];
                    dizi[min]=dizi[i];
                    dizi[i]=dizi[tmp];
                }
            }
        }
}
