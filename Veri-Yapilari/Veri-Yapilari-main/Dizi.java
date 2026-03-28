
public class Dizi {

    int[] dizi;
    int es;

    public Dizi(int boyut) {
        dizi=new int [boyut];
        es=0;

    }

    public void Ekle(int a){
        if(es>=dizi.length){
            System.out.println("Dizi dolu");
        }
        else{
            dizi[es++]=a;
        }
    }

    public int arama(int a){

        for(int i=0; i<es ;i++){
            if(dizi[i]== a){
            return i;
            }
        }
        return -1;
    }   

    public void Sil(int a){
        int indis =this.arama(a);

        if (indis== -1){
            System.out.println("Silmek istenilen sayı bulunamadı!");
        }
        else{

            for(int i=indis ; i < es-1 ; i++){
                dizi[i]=dizi[i+1];
            }
            dizi[--es]=0;


        }


    }
    public void guncelle(int eski,int yeni){
        int indis=this.arama(eski);

        if(indis==-1){
            System.out.println("Guncellemek istediginiz sayi bulunamadi");
        }
        else{
            dizi[indis]=yeni;
        }



    }


public void yazdir(){
    System.out.print("[");
    for(int i=0;i<dizi.length;i++){
        System.out.print(dizi[i] +",");
    }
    System.out.println("]");

}

}

