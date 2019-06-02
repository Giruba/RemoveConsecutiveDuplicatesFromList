package Main;

import java.util.Scanner;
import LinkedList.LinkedList;

public class Main {
	public static void main(String[] args) {
		System.out.println("Remove Duplicates from Linked List");
		System.out.println("----------------------------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of elements in the Linked list");
			int size = scanner.nextInt();
			LinkedList linkedList = new LinkedList(null);
			for(int index = 0; index < size; index++) {
				System.out.println("Enter the element "+(index));
				linkedList.SetLinkedListHead(linkedList.InsertAtEnd(linkedList.GetLinkedListHead(), scanner.nextInt()));
			}
			linkedList.PrintLinkedList(linkedList.GetLinkedListHead());
			linkedList.SetLinkedListHead(linkedList.GetListWithoutDuplicates(linkedList.GetLinkedListHead()));
			System.out.println();
			System.out.println("---Printing the list without duplicates---");
			linkedList.PrintLinkedList(linkedList.GetLinkedListHead());
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}
	}
}
