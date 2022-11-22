import java.util.Objects;

public class Queue<T> {
    Node<T> front, rear;

    public  Queue(){
        this.front = this.rear = null;
    }

    void enqueue(T value){
        Node<T> temp = new Node<>(value);

        if(Objects.isNull(this.rear)){
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }

    void dequeue(){
        if (Objects.isNull(this.front)){
            return;
        }

        Node<T> temp = this.front;
        this.front = this.front.next;

        if (Objects.isNull(this.front)){
            this.rear = null;
        }
    }
}
