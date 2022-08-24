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
        if (isEmpty()) {
            front = temp;
            back = temp;
        } else {
            front.prev = temp;
            front = temp;
        }

    }
    public void addBack(double item){
        Deque.DequeItem temp = new Deque.DequeItem();
        temp.value = item;
        if (isEmpty()) {
            front = temp;
            back = temp;
        } else {
            back.next = temp;
            back = temp;
        }
    }

    public double deleteFront(){
        double a = front.value;
        front = front.next;
        front.prev = null;
        return a;
    }

    public double getFront(){
        return front.value;
    }

    public double getBack(){
        return back.value;
    }


    public double deleteBack(){
        double a = back.value;
        back = back.prev;
        back.next = null;
        return a;
    }

    public boolean isEmpty(){
        return (front == null && back == null);
    }

}
