public class TekYonluBagliListe {
    Node head;
    int es;

    public TekYonluBagliListe(){
        head=null;
        es=0;
    }

    public void addInOrder(Node n){
        if(head==null){
            head=n;
        }else if(head.data>n.data){
            n.next=head;
            head=n;
        }
        else{
            Node tmp=head;
            while(tmp.next!=null && tmp.next.data<n.data ){
                tmp=tmp.next;
            }
            n.next=tmp.next;
            tmp.next=n;
        }
    }
    public void delete(int d){
        if(head==null){
            System.out.println("Liste bos");
        }
        else if(head.data==d){
            head=head.next;
        }
        else{
            Node tmp=head;
            while(tmp !=null){
                if(tmp.next.data==d){
                    tmp.next=tmp.next.next;
                }
                tmp=tmp.next;
            
            }

        }
    }
    public void add(Node n){
        if(head==null){
            head=n;

        }
        else{
            Node tmp=head;
            while(tmp.next !=null){
                tmp=tmp.next;
            }
            tmp.next=n;

        }
    }
    public void print(){
        Node tmp=head;
        while(tmp !=null){
            System.out.print(tmp.data+"-");
            tmp=tmp.next;
        }
        System.out.println();
    }




}

