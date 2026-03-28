public class QueueImp {
    
    public static void main(String[] args){
        Queue q=new Queue(5);


        q.push(5);
           q.push(6);

              q.push(4);
                 q.push(3);
                    q.push(22);
        q.yazdir();
        q.pop();
        q.yazdir();
        q.pop();
        q.yazdir();

    }
    

}
