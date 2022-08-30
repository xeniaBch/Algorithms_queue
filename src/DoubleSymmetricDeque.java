public class DoubleSymmetricDeque {

    public static void main(String[] args) {

        //Task1 in SecondLevel
        Deque deque = new Deque();
        deque.addFront(20.0);
        deque.addFront(30.0);
        deque.addFront(40.0);
        deque.addFront(50.0);

        Deque doubleDeque = copyDeque(deque);
        printDequeFromBack(doubleDeque);
    }

    private static void printDequeFromBack(Deque queue) {
        System.out.println();
        while (!queue.isEmpty()) {
            System.out.println(queue.deleteBack());
        }
    }

    private static Deque copyDeque(Deque deque) {
        Deque resDeque = new Deque();
        while (!deque.isEmpty()) {
            double el = deque.deleteBack();
            resDeque.addFront(el);
            resDeque.addBack(el);
        }
        return resDeque;
    }

}

