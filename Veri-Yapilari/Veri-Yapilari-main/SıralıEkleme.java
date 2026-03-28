public class SıralıEkleme {

        int [] dizi;
        int es;

        public SıralıEkleme (int boyut){
            
            dizi =new int[boyut];
            es=0;

        }
            public void Ekle(int a){
            if(es>=dizi.length){
                System.out.println("Dizi Dolu");
            }
            else{
                int i=0;
                for(i=(es-1); i>=0 && dizi[i]>a;i--){
                    dizi[i+1]=dizi[i];
                }
                dizi[i+1]=a;
                es++;
            }



        }
        public void yazdir(){
            System.out.print("[");

            for(int i=0; i<dizi.length;i++ ){
                System.out.print(dizi[i]+",");
            }

            System.out.println("]");
        }


    
}



