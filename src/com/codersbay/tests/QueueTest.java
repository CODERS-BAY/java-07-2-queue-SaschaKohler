package com.codersbay.tests;

import com.codersbay.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    private Queue integerQueue;


    @BeforeEach
    void initialize() {
        integerQueue = new Queue();
    }

    @Test
    void enqueueIntoNewQueueAndDequeue() throws Exception {
        integerQueue.enqueue(2);
        assertEquals(2,integerQueue.dequeue());

    }

    @Test
    void dequeueFirstInFirstOut() throws Exception {
        integerQueue.enqueue(10);   //first In
        integerQueue.enqueue(8);

        assertArrayEquals(new int[]{10, 8},integerQueue.dequeue(10)); //first Out
    }

    @Test
    void dequeueMoreElementsThanQueueHas() throws Exception {
        integerQueue.enqueue(10);
        integerQueue.enqueue(8);

        assertArrayEquals(new int[]{10, 8},integerQueue.dequeue(10));
    }

    @Test
    void returnSizeOfQueue(){
        integerQueue.enqueue(10);
        integerQueue.enqueue(10);
        integerQueue.enqueue(10);

        assertEquals(3,integerQueue.getSize());
    }

}