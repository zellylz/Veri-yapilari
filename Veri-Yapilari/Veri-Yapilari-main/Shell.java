import java.util.Arrays;

public class Shell {

    public static void main(String [] args){
       
       int [] d={5,9,1,8,4,2,7,3,6};
       System.out.println(Arrays.toString(d));
       Shell.shellSort(d);
       System.out.println(Arrays.toString(d));
       
    }
       public static void shellSort(int []d){
        int tmp=0;
        int i=0;
        int j=0;
        int gap=0 ;
        for ( gap = d.length/2; 0 < gap; gap/=2) {
            for(i=gap;i<d.length;i+=gap){
                tmp=d[i];
                for(j=i;j>0&& d[j-gap]>tmp;j-=gap){
                    d[j]=d[j-gap];
                }
                d[j]=tmp;
            }
            
        }
    }    
}
/*Shell sort — adım adım (verdiğin kod ve örnek dizi üzerinden, ayrıntılı)
Verdiğin dizi:
[5, 9, 1, 8, 4, 2, 7, 3, 6] (indeksler 0..8)
Kodunda kullanılan mantık:
Başlangıç gap = d.length / 2 → 9/2 = 4.
Dış döngü: for (gap = n/2; gap > 0; gap /= 2) → gap sırasıyla 4, 2, 1 olur.
İç döngü: for (i = gap; i < n; i += gap) — (normal Shell sort’ta genelde i++ kullanılır; senin kodunda i+=gap kullanılmış; bu hâlâ doğru çalışır ama tipik implementasyonlarda i++ ile her eleman kontrol edilir ve içte j-=gap ile gap’li karşılaştırmalar yapılır. Senin versiyonunda aynı aralıklar kontrol ediliyor: i = gap, gap+gap, gap+2*gap ...)
Aşağıda her gap adımı için tüm önemli karşılaştırma/taşıma adımlarını ve dizinin ara durumlarını gösteriyorum.
Başlangıç
Dizi:
[5, 9, 1, 8, 4, 2, 7, 3, 6]
1) gap = 4
İç döngü i = 4, 8
i = 4
tmp = d[4] = 4
j = 4 → kontrol: j > 0 && d[j-gap] > tmp → d[0] = 5 > 4 doğru
d[4] = d[0] → d becomes [5, 9, 1, 8, 5, 2, 7, 3, 6]
j -= gap → j = 0
artık j > 0 değil → d[0] = tmp → d[0] = 4
Ara durum:
[4, 9, 1, 8, 5, 2, 7, 3, 6]
i = 8
tmp = d[8] = 6
j = 8 → d[4] = 5 > 6 yanlış → hiç kaydırma yok
d[8] = tmp (değişmedi)
Ara durum (gap=4 sonu):
[4, 9, 1, 8, 5, 2, 7, 3, 6]
2) gap = 2
İç döngü i = 2, 4, 6, 8
i = 2
tmp = d[2] = 1
j = 2 → d[0] = 4 > 1 doğru → d[2] = d[0] → [4,9,4,8,5,2,7,3,6]
j = 0 → d[0] = tmp → d[0] = 1
Ara: [1, 9, 4, 8, 5, 2, 7, 3, 6]
i = 4
tmp = d[4] = 5
j = 4 → d[2] = 4 > 5 yanlış → hiç kaydırma
Ara: [1, 9, 4, 8, 5, 2, 7, 3, 6]
i = 6
tmp = d[6] = 7
j = 6 → d[4] = 5 > 7 yanlış → hiç kaydırma
Ara: [1, 9, 4, 8, 5, 2, 7, 3, 6]
i = 8
tmp = d[8] = 6
j = 8 → d[6] = 7 > 6 doğru → d[8] = d[6] → [1,9,4,8,5,2,7,3,7]
j = 6 → şimdi d[4] = 5 > 6 yanlış → d[6] = tmp → d[6] = 6
Ara (gap=2 sonu):
[1, 9, 4, 8, 5, 2, 6, 3, 7]
3) gap = 1 (bu adım normal insertion sort ile aynı)
İç döngü i = 1,2,3,4,5,6,7,8 (her eleman için j-- kullanılır ama senin iç mantığınla j-=gap aynı iş)
Başlangıç: [1, 9, 4, 8, 5, 2, 6, 3, 7]
i = 1
tmp = 9, d[0]=1 > 9 değil → değişiklik yok
Ara: [1, 9, 4, 8, 5, 2, 6, 3, 7]
i = 2
tmp = 4
d[1] = 9 > 4 → kaydır: d[2]=9 → [1,9,9,8,5,2,6,3,7]
d[0] = 1 > 4 değil → d[1]=4
Ara: [1, 4, 9, 8, 5, 2, 6, 3, 7]
i = 3
tmp = 8
d[2] = 9 > 8 → d[3] = 9 → [1,4,9,9,5,2,6,3,7]
d[1] = 4 > 8 değil → d[2] = 8
Ara: [1, 4, 8, 9, 5, 2, 6, 3, 7]
i = 4
tmp = 5
d[3] = 9 > 5 → d[4] = 9
d[2] = 8 > 5 → d[3] = 8
d[1] = 4 > 5 değil → d[2] = 5
Ara: [1, 4, 5, 8, 9, 2, 6, 3, 7]
i = 5
tmp = 2
d[4] = 9 > 2 → d[5] = 9
d[3] = 8 > 2 → d[4] = 8
d[2] = 5 > 2 → d[3] = 5
d[1] = 4 > 2 → d[2] = 4
d[0] = 1 > 2 değil → d[1] = 2
Ara: [1, 2, 4, 5, 8, 9, 6, 3, 7]
i = 6
tmp = 6
d[5] = 9 > 6 → d[6] = 9
d[4] = 8 > 6 → d[5] = 8
d[3] = 5 > 6 değil → d[4] = 6
Ara: [1, 2, 4, 5, 6, 8, 9, 3, 7]
i = 7
tmp = 3
d[6] = 9 > 3 → d[7] = 9
d[5] = 8 > 3 → d[6] = 8
d[4] = 6 > 3 → d[5] = 6
d[3] = 5 > 3 → d[4] = 5
d[2] = 4 > 3 → d[3] = 4
d[1] = 2 > 3 değil → d[2] = 3
Ara: [1, 2, 3, 4, 5, 6, 8, 9, 7]
i = 8
tmp = 7
d[7] = 9 > 7 → d[8] = 9
d[6] = 8 > 7 → d[7] = 8
d[5] = 6 > 7 değil → d[6] = 7
Ara (gap=1 sonu): [1, 2, 3, 4, 5, 6, 7, 8, 9]
Sonuç
Final (sorted): [1, 2, 3, 4, 5, 6, 7, 8, 9]
Program çıktı olarak önce orijinal, sonra sıralanmış diziyi yazdırır.
Ek açıklamalar — neden böyle çalışıyor, karmaşıklık, stabilite vs.
Temel fikir: Shell sort, insertion sort’un geliştirilmiş hali: önce uzak (gap kadar uzak) öğeleri karşılaştırıp kısmi olarak sıralar, gap küçüldükçe dizideki öğeler zaten büyük oranda yerli yerine oturmuş olur; son adımda gap=1 olduğunda insertion sort neredeyse lineer çalışır.
Gap dizileri: Senin kod gap /= 2 (n/2, n/4, ...) kullanıyor — klasik fakat optimal değil. Daha iyi performans için Knuth, Sedgewick vb. tarafından önerilen gap dizileri var.
Zaman karmaşıklığı: En kötü durumda genelde O(n^2) (ancak iyi gap seçimiyle ortalama çok daha iyi olur). Ortalama karmaşıklık gap dizisine bağlıdır.
Bellek: In-place — ekstra O(1) bellek.
Stabilite: Shell sort genelde kararsızdir (eşit elemanların göreli sırası değişebilir), çünkü uzak öğelerin yer değiştirmesi stabiliteyi bozabilir.
Senin koduna not: İç döngüde for (i = gap; i < d.length; i += gap) kullanılmış — bu hala çalışır fakat tipik uygulamada i++ kullanılır; i+=gap ile, gap kadar atlayarak i’lar kontrol ediliyor. Bu da örnek dizi için doğru sonuç verdi.*/
