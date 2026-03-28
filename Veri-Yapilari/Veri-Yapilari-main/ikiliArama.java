public class ikiliArama {
    Node3 root;
    public ikiliArama(){
        root=null;
    }

    public void add(int a){
        root=addRecursive(root,a);
    }




    public Node3 addRecursive(Node3 current,int a){
        if(current==null){
            current=new Node3(a);
            return current;
        }
        else if(current.data>a){
            current.lc=addRecursive(current.lc, a);
            
        }
        else if(current.data<a){
            current.rc=addRecursive(current.rc, a);
        }
        return current;
    }





    public Node3 search(int a){
        return searchRecursive(root,a);
    }

    public Node3 searchRecursive(Node3 current,int s){
        if(current==null || current.data==s ){
            return current;
        }
        if(current.data<s){
            return searchRecursive(current.rc, s);
        }
        return searchRecursive(current.lc, s);
    }




    public void delete(int a){
        deleteRecursive(root,a);
    }
    private Node3 deleteRecursive(Node3 current ,int a){
        if(current==null){
            return current;
        }
        if(current.data>a){
            current.lc=deleteRecursive(current.lc, a);
        }
        if(current.data<a){
            current.rc=deleteRecursive(current.rc, a);
        }
        else{
            if(current.lc==null){ return current.rc;
            }
            if(current.rc==null) {return current.lc;
            }
            int leftMax=findMax(current.lc);
            current.data=leftMax;
            current.lc=deleteRecursive(current.lc, leftMax);
            }
            return current;
        }
    
    public int findMax(Node3 current){
        int max=current.data;
        while(current.rc!=null){
            max=current.rc.data;
            current=current.rc;
        }
        return max;

    }



    public void preOrder(){
        preOrderRecursive(root);
    }

    public void preOrderRecursive(Node3 current){
        if(current!=null){
            System.out.print(current.data+" ");
            preOrderRecursive(current.lc);
            preOrderRecursive(current.rc);
        }
    }




     public void ineOrder(){
        inOrderRecursive(root);
    }

    public void inOrderRecursive(Node3 current){
        if(current!=null){
            inOrderRecursive(current.lc);
            System.out.print(current.data+" ");
            inOrderRecursive(current.rc);
        }
    }
    





     public void postOrder(){
        postOrderRecursive(root);
    }

    public void postOrderRecursive(Node3 current){
        if(current!=null){
            preOrderRecursive(current.lc);
            preOrderRecursive(current.rc);
            System.out.print(current.data+" ");
    
        }
    }




    public void print(){
        printRecursive(root,"");
    }
    public void printRecursive(Node3 current,String indent){
        System.out.println(indent+current.data);
        if(current.lc!=null){
            printRecursive(current.lc, indent+"     ");
        }
          if(current.rc!=null){
            printRecursive(current.rc, indent+"     ");
        }







    }

}
