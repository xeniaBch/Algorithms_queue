public class Deque {

    DequeItem front;
    DequeItem back;


    private class DequeItem{
        double value;
        DequeItem prev;
        DequeItem next;

    }

    public void addFront(double item){
        Deque.DequeItem temp = new Deque.DequeItem();
        temp.value = item;
        if (front == null) {
            back = temp;
        } else {
            temp.next = front;
            front.prev = temp;

        }
        front = temp;

    }
    public void addBack(double item){
        Deque.DequeItem temp = new Deque.DequeItem();
        temp.value = item;
        if (back == null) {
            front = temp;
        } else {
            back.next = temp;
            temp.prev = back;
        }
        back = temp;
    }

    public double deleteFront(){
           double a = front.value;
           if(front==back){
               front=back=null;
           } else{
               front = front.next;
               front.prev = null;
           }
           return a;
       }




    public double deleteBack(){
            double a = back.value;
            if(back==front){
                back=front=null;
            } else {
                back = back.prev;
                back.next = null;
            }
            return a;
        }


    public boolean isEmpty(){
        return (front == null);
    }

}
