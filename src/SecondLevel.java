
public class SecondLevel {
    public static void main(String[] args) {

        //Task1 in SecondLevel
        QueueTwoStack queue = new QueueTwoStack();
        queue.add(20.0);
        queue.add(30.0);
        queue.add(40.0);
        queue.add(50.0);

       while(!queue.isEmpty()){
            System.out.println(queue.delete());
       }

        queue.add(60.0);
        //System.out.println(queue.delete());
       // System.out.println(queue.isEmpty());

        //Task2 in Secondlevel (Anton, I didn't complete Deque to the end, but I will make it later and send you)

        //Deque deque = new Deque();
        //deque.addFront(0.0);
        //deque.addFront(10.0);
        //deque.addFront(20.0);


        //deque.getFront();
        //deque.getBack();








    }
}
