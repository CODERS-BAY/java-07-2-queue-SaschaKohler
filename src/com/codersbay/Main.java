package com.codersbay;

public class Main {

    public static void main(String[] args) throws Exception {

        Queue intQueue = new Queue();

        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);

        System.out.println(intQueue.getSize());
        System.out.println(intQueue.dequeue());

        int[] intArray = intQueue.dequeue(10);

        for(int item : intArray){
            System.out.print(item + " ");
        }

    }

}
