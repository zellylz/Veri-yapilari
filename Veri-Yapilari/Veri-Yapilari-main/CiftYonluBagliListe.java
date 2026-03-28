public class CiftYonluBagliListe {
    Node2 head;
    Node2 tail;
    int es;

    public CiftYonluBagliListe(){
        head=null;
        tail=null;
        es=0;
    }
    public void BasaEkle(Node2 n){
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            head.prev=n;
            n.next=head;
        }
        
    }
    public void SonaEkle(Node2 n){
        if(head==null){
            head=n;
            tail=n;
        }
        tail.next=n;
        n.prev=tail;
        tail=n;
    }
        public void BatanSil(){
            if(head==null){
                System.out.println( "Liste Bos");
            }
            if(head==tail){
                head=null;
                tail=null;
            }
            else{
                head.next.prev=null;
                head=head.next;
            }
        }
        public void SondanSil(){
            if(head==null){
                System.out.println("Liste Bos");
            }
            if(head==tail){
                head=null;
                tail=null;
            }
            else{
                tail.prev.next=null;
                tail=tail.prev;
            }
        }

}

