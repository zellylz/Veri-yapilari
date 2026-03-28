public class CiftUcluBagliListe {
    Node head;
    Node tail;
    int es;
    public CiftUcluBagliListe(){
        head=null;
        tail=null;
        es=0;

    }
    public void BasaEkle(Node n){
        if(head==null){
            head=n;
            tail=null;

        }
        else{
            n.next=head;
            head=n;
        }
    }
    public void SonaEkle(Node n){
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            Node tmp=head;
            while(tmp.next !=tail){
                tmp=tmp.next;
            }
            tmp.next=n;
            tail=n;
        }
    }
    public void BastanSil(){
        if(head==null){
            System.out.println("Liste Bos");
        }
        if(head==tail){
            head=null;
            tail=null;

        }
        else{
           head= head.next;
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
            Node tmp=head;
            while(tmp.next!=tail){
                tmp=tmp.next;
            }
            tmp.next=null;
            tail=tmp;
        }
    }



}
