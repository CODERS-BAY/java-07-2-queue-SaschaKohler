package com.codersbay;

public class Queue {

    private Node first;
    private Node last;

    private int counter;

    class Node{

        int data;
        Node previous;
        Node next;
        public Node(int data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }

    }

    public Queue() {
        this.first = null;
        this.last = null;
        this.counter = 0;
    }

    public void enqueue(int data){

        Node newNode = new Node(data);

        if(this.counter == 0){
            this.last = newNode;
            this.first = newNode;
            this.first.next = this.last;
            this.counter++;
            return;
        }
        Node oldLast = this.last;
        this.last = newNode;
        oldLast.next = this.last;
        this.counter++;
    }

    public int dequeue() throws Exception{
        try{
            Node oldFirst = this.first;
            this.first = oldFirst.next;
            this.counter--;
            return oldFirst.data;

        } catch(Exception e){
            throw new IllegalArgumentException("Fun");
        }
    }

    public int[] dequeue(int number) throws Exception {

        if(number > this.counter){
            number = this.counter;

        }
        int[] array = new int[number];
        for (int i = 0;i < number;i++){
            array[i] = this.dequeue();
        }
        return array;
    }


    public int getSize(){
        return this.getCounter();
    }

    private int getCounter() {
        return this.counter;
    }

}
