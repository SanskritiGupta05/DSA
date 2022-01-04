package com.sanskriti;

// INSERT : First, Last, At any Index

public class LinkedListInsertion {

	public static void main(String[] args) {
		
        LinkedListt list = new LinkedListt();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
	}

}

class LinkedListt {
    private Node head;
    private Node tail;
    private int size;
    public LinkedListt() {
        this.size = 0;
    }

// INSERT AT FIRST
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        
        if(tail == null) {
            tail = head;
        }
        size += 1;
    }
   
// INSERT AT LAST
    public void insertLast(int val) {
    	if(tail ==null) {
    		insertFirst(val);
    		return;
    	}
    	Node node = new Node(val);
    	tail.next = node;
    	tail = node;
    	size++;
    }
    
// INSERT AT GIVEN INDEX    
    public void insert(int val, int index) {
    	if(index == 0) {
    		insertFirst(val);
    		return;
    	}
    	if (index == size) {
    		insertLast(val);
    		return;
    	}
    	Node temp = head;
    	for(int i=1; i<index; i++) {
    		temp = temp.next;
    	}
    	
    	Node node = new Node(val, temp.next);
    	temp.next = node;
    	size++;
    }
// DISPLAY
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
    
    public class Node {
        private int value;
        private Node next;
        
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        
    }
}