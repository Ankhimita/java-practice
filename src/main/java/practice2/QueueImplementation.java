package practice2;

public class QueueImplementation {

    int[] arr = new int[5];

    int front=-1, rear = -1;

    int dequeue() {

        if (front == -1) {
            System.out.println("Queue is empty");
        } else {

            //when only one element present
            if (front == rear) {
                int temp = arr[front];
                front = rear = -1;
                return temp;

            } else {
                int temp = arr[front];
                front++;
                return temp;
            }
        }
        return -1;
    }

        void enqueue ( int i){

            if ((front == 0 && rear == arr.length - 1) || (rear == front - 1)) {
                System.out.println("Queue is full");
            } else {

                //when empty
                if(rear==-1){
                    front=rear=0;
                    arr[rear] = i;

                //when rear reached end but space present in front
                }else if (rear == arr.length - 1 && front != 0) {
                        rear = 0;
                        arr[rear] = i;
                }else {
                        rear++;
                        arr[rear] = i;
                }
            }
        }


    public static void main(String[] args) {

        QueueImplementation queueImplementation = new QueueImplementation();
        queueImplementation.enqueue(1);
        queueImplementation.enqueue(2);
        queueImplementation.enqueue(3);
        queueImplementation.enqueue(4);
        queueImplementation.enqueue(5);
        queueImplementation.dequeue();
        queueImplementation.dequeue();
        queueImplementation.dequeue();
        queueImplementation.enqueue(6);
        queueImplementation.enqueue(7);
        System.out.println("front=" + queueImplementation.front);
        System.out.println("rear=" + queueImplementation.rear);


        for(int i=0; i<queueImplementation.arr.length; i++) {
            System.out.println(queueImplementation.arr[i] + " ");
        }

    }

    }
