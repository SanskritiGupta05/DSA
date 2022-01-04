package com.sanskriti;

public class LinkedList {

	public static void main(String[] args) {
		
      LL list = new LL();
      list.display();
	}

}
class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
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