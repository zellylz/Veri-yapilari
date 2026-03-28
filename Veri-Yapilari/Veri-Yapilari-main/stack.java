public class stack {
   int [] s;
   int es;
   
   public stack(int boyut){
    s =new int[boyut];
    es=0;
   }
   public void push(int a){
    if(es>=s.length) System.out.println("stack dolu!");

    else{
    s[es++]=a;
    }
   }
   public int pop(){
    int r=s[es-1];
    s[--es]=0;
    return r;
   }

   public void yazdir(){
    int i=0;
    for(i=0;i<s.length;i++){
        System.out.println(s[i]);
    }
   }

}
