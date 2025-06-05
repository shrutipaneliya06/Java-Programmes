class linkedlist 
{
 Node head;
 class Node 
 {
  int data;
  Node next;

  Node(int d) 
  {
   data = d;
   next = null;
  }
 }

 //Insert at the beginning
 public void insertAtBeginning(int new_data)
 {
  Node new_node = new Node(new_data);
  new_node.next = head;
  head = new_node;
  }

 //Insert after a node
 public void insertAfter(Node prev_node, int new_data) 
 {
  if (prev_node == null) 
  {
   System.out.println("The given previous node cannot be null");
   return;
  }
   Node new_node = new Node(new_data);
   new_node.next = prev_node.next;
   prev_node.next = new_node;
  }

 //Insert at the end
 public void insertAtEnd(int new_data) 
 {
  Node new_node = new Node(new_data);
  if (head == null) 
  {
   head = new Node(new_data);
   return;
  }
   new_node.next = null;
   Node last = head;
   while (last.next != null)
       last = last.next;
   last.next = new_node;
   return;
  }

 //Delete a node
 void deleteNode(int position) 
 {
  if (head == null)
     return;
  Node temp = head;
  if (position == 0) 
  {
   head = temp.next;
   return;
  }
    
  for (int i = 0; temp != null && i < position - 1; i++)
      temp = temp.next;
  if (temp == null || temp.next == null)
     return;
  Node next = temp.next.next;
  temp.next = next;
  }

 //Print the linked list
 public void printList() 
 {
  Node tnode = head;
  while (tnode != null) 
  {
   System.out.print(tnode.data + " ");
   tnode = tnode.next;
  }
 }

 public static void main(String[] args) 
 {
  linkedlist llist = new linkedlist();

  System.out.println("insert at beginning");
  llist.insertAtBeginning(1);
  System.out.println("Linked list: ");
  llist.printList();

  System.out.println("\ninsert at beginning");
  llist.insertAtBeginning(2); 
  System.out.println("Linked list: ");
  llist.printList();

  System.out.println("\ninsert at end");
  llist.insertAtEnd(3);
  System.out.println("Linked list: ");
  llist.printList();

  System.out.println("\ninsert at end");
  llist.insertAtEnd(4);
  System.out.println("Linked list: ");
  llist.printList();

  System.out.println("\ninsert after");
  llist.insertAfter(llist.head.next, 5);
  System.out.println("Linked list: ");
  llist.printList();

  System.out.println("\nDelete Node");
  llist.deleteNode(3);
  System.out.println("Linked list: ");
  llist.printList();
 }
}