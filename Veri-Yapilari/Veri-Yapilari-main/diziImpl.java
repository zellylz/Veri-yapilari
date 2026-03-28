public class diziImpl {
    
    public static void main( String[] args){

        Dizi d =new Dizi(10);

        d.yazdir();
        d.Ekle(3);
        d.Ekle(5);
        d.Ekle(6);
        d.Ekle(12);
        d.Ekle(33);
        d.Ekle(45);
        d.Ekle(22);
        d.Ekle(23);
        d.Ekle(56);
        d.Ekle(32);

        d.yazdir();

        d.Sil(12);

        d.yazdir();

        d.guncelle(45, 20);

        d.yazdir();

    }



}
