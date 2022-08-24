public class QueueTwoStack {
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public void add(double item){
        stack1.push(item);
    }

    public double delete(){
        while(!stack1.isEmpty()){
            double a = stack1.pop();
            stack2.push(a);
        }
        double b = stack2.pop();
        while(!stack2.isEmpty()){
            double a = stack2.pop();
            stack1.push(a);
        }
        return b;
    }

    public boolean isEmpty(){
        return stack1.isEmpty();
    }
}
