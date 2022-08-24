public class Stack {

    StackItem top;

    public void push(double item) {
        StackItem temp = new StackItem();
        temp.value = item;
        temp.next = top;
        top = temp;
    }

    public double pop() {
        double a = top.value;
        top = top.next;
        return a;
    }

    // Проверка пуст ли стек
    public boolean isEmpty() {
        return (top == null);
    }

    private class StackItem {
        double value;
        StackItem next;
    }
}