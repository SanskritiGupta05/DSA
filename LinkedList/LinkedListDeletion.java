// DELETION : FIRST, LAST, ANY INDEX
package com.sanskriti;


public class LinkedListDeletion {

	public static void main(String[] args) {
		
		    LL list = new LL();
	        list.insertFirst(4);
	        list.insertFirst(5);
	        list.insertFirst(6);
	        list.insertFirst(7);
	        list.display();
	        System.out.println(list.deleteFirst());
	        list.display();
	        System.out.println(list.deleteLast());
	        list.display();
	        System.out.println(list.delete(1));
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

// Deletes at LAST INDEX
    public int deleteLast() {
    	if (size <= 1) {
    		return deleteFirst();
    	}
    	
    
	 Node secondLast = get(size - 2);
     int val = tail.value;
     tail = secondLast;
     tail.next = null;
     return val;
    }
// Deletes at Any Index
    public int delete(int index) {
    	if(index == 0) {
    		return deleteFirst();
    	}
    	if (index == size - 1) {
    		return deleteLast();
    	}
    	Node prev = get(index - 1);
    	int val = prev.next.value;
    	
    	prev.next = prev.next.next;
    	return val;
    }
    
    public Node get(int index) {
    	Node node = head;
    	for(int i=0; i< index; i++) {
    		node = node.next;
    	}
    	return node;
    }

 // DELETES at FIRST INDEX
     public int deleteFirst() {
     	int val = head.value;
     	head = head.next;
     	if(head == null) {
     		tail = null;
     	}
     	size--;
     	return val;
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
    

// DISPLAYS THE LIST
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