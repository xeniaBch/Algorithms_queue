public class FirstLevel {

    public static void main(String[] args) {
        // Дан файл действительных чисел и некоторое число С. Используя
        // очередь напечатать сначала все элементы меньшие числа С, а затем
        // все остальные.
        double[] data = new double[20];
        for (int i = 0; i < data.length; i++) {
            data[i] = 100 * Math.random();
            System.out.println(data[i]);
        }
        System.out.println();
        // Работа алгоритма
        double a = 20.0;
        double b = 60.0;
        Queue queue1 = new Queue();
        Queue queue2 = new Queue();
        for (int i = 0; i < data.length; i++) {
            if (data[i] < a)  {
                System.out.println(data[i]);
            } else if (data[i]>= a && data[i]<=b){
                queue1.add(data[i]);
            }else {
                queue2.add(data[i]);
            }
        }

        printQueue(queue1);
        printQueue(queue2);

    }

    private static void printQueue(Queue queue) {
        System.out.println();
        while (!queue.isEmpty()) {
            System.out.println(queue.delete());
        }
    }

}