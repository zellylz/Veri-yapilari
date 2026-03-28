public class Node3 {
    int data;
    Node3 lc;
    Node3 rc;

    public Node3(int a){
        data=a;
        lc=null;
        rc=null;
    }
    @Override
    public String toString(){
        return "Node{"+
        "data="+data+
        ",lc="+lc+
        ",rc="+rc+
        '}';
    }
}
