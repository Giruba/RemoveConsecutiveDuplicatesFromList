package LinkedList;

public class LinkedList {
	private LinkedListNode head;
	
	public LinkedList(LinkedListNode linkedListNode) {
		this.head = linkedListNode;
	}
	
	public void SetLinkedListHead(LinkedListNode linkedListNode) {
		this.head = linkedListNode;
	}
	
	public LinkedListNode GetLinkedListHead() {
		return this.head;
	}
	
	public LinkedListNode InsertAtEnd(LinkedListNode linkedListNode, int data) {
		if(linkedListNode == null) {
			linkedListNode = new LinkedListNode(data);
			return linkedListNode;
		}
		LinkedListNode current = linkedListNode;
		while(linkedListNode != null && linkedListNode.GetLinkedListNodeNext() != null) {
			linkedListNode = linkedListNode.GetLinkedListNodeNext();
		}
		
		linkedListNode.SetLinkedListNodeNext(new LinkedListNode(data));
		
		return current;
	}
	
	public LinkedListNode GetListWithoutDuplicates(LinkedListNode linkedListNode) {
		
		if(linkedListNode == null) {
			return null;
		}
		LinkedListNode current = linkedListNode;
		while(linkedListNode != null) {
			if(linkedListNode.GetLinkedListNodeNext() != null && 
					linkedListNode.GetLinkedListNodeData() == linkedListNode.GetLinkedListNodeNext().GetLinkedListNodeData()) {
				linkedListNode.SetLinkedListNodeNext(linkedListNode.GetLinkedListNodeNext().GetLinkedListNodeNext());
			}else {
				linkedListNode = linkedListNode.GetLinkedListNodeNext();
			}
		}
		
		return current;
	}
	
	public void PrintLinkedList(LinkedListNode linkedListNode) {
		if(linkedListNode == null) {
			System.out.println("LinkedList is empty! Can't print anything!");
			return;
		}
		
		System.out.println("----- Printing the Linked List -----");
		while(linkedListNode != null) {
			System.out.print(linkedListNode.GetLinkedListNodeData()+ " ");
			linkedListNode = linkedListNode.GetLinkedListNodeNext();
		}
	}
}
