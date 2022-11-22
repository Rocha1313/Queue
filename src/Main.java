public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkm");
        queue.dequeue();
        queue.enqueue("nop");
        queue.enqueue("qrs");
        queue.enqueue("tuv");
        queue.dequeue();
        queue.enqueue("wxyz");

        System.out.println("Queue Front: " + queue.front.value);
        System.out.println("Queue Rear: " + queue.rear.value);
    }
}