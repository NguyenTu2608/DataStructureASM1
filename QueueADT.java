package ADT;

import java.util.LinkedList;
import java.util.Queue;

public class QueueADT {


    //Queue<String> countries = new PriorityQueue<>();

    public Queue<String> createQueue()
    {
        //tao queue :

        Queue<String> colors = new LinkedList<>();
        //vao dau tien la phan tu dau tien, vao cuoi cung la phan tu cuoi cung
        colors.add("red");
        colors.add("green");
        colors.add("pink");
        colors.add("violet");
        return colors;
    }
    public void showQueue(Queue<String> myQueue)
    {
        System.out.println("Queue is : " + myQueue);
    }
    public void insertDataQueue(Queue<String> queue)
    {
        //giong ham add
        queue.offer("black");
        queue.offer("white");
        queue.offer("yellow");
        queue.offer("brown");

    }

    public void checkSizeQueue(Queue<String> queue)
    {
        int size = queue.size(); //kick thuoc cua queue
        System.out.println("Size of queue is " + size);
    }

    public void getElementQueue(Queue<String> queue)
    {
        String Element = queue.element();
        System.out.println("Data element : " + Element);
    }

    public void getElementQueueV2(Queue<String> queue)
    {
        String data = queue.peek();
        System.out.println("ELement : " + data);
    }

    public void removeElement(Queue<String> queue)
    {
        if(queue.isEmpty())
        {
            System.out.println("Queue is empty , so do not remove");
        }
        else {
            String data = queue.remove();
            //neu queue rong k co phan tu nao de xoa thi thong bao loi
            System.out.println("Element : " + queue);
        }
    }

    public void removeElementV2(Queue<String> queue)
    {
        String data2 = queue.poll();
        //neu queue rong k co phan tu nao de xoa thi tra ve null
        System.out.println("Element : " + queue);
    }

    public void loopElement(Queue<String> queue)
    {
        for (String item : queue)
        {
            System.out.println("Data item = " + item);
        }
    }



}
