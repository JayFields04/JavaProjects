public class DoublyLinkedList<T extends Comparable>
{
 

 private static class Node<T>
 {
  private T data;
  private Node<T> next;
  private Node<T> prev;

  private Node (T d)
  {  data = d;
     next = null;
     prev=null;
  }
  private Node (T d, Node<T> n, Node<T> p)
  {
     data =d;
     next =n;
     prev =p;
  }   
 }

 private Node<T> head;
 private Node<T> current;
 private int size;

   
 public DoublyLinkedList()
 {    head = new Node<T> (null);
     head.next=head;
     head.prev=head;
      size= 0;
 }
 
 public DoublyLinkedList(DoublyLinkedList<T> l)
 {   Node<T> p,p1;
     head = new Node<T>(l.head.data);
     head.next = head;
     head.prev=head;
     p = head;
     for (p1 = l.head.next; p1.next != l.head; p1 = p1.next)
     { p.next = new Node<T>(p1.data,p.next,p);
       p = p.next;
     }
     size = l.size;
 }
 
 public void insert (T d) 
 //insert's the new value into its proper position in the list
 {
   Node<T> p, trav;
   
   trav= head.next;
   while (trav != head && d.compareTo(trav.data) >0)
   { trav = trav.next;}
   
   p = trav.prev;
   p.next = new Node<T>((T)d,trav,p);
   trav.prev= p.next;
   size++;
 }

 public void remove (T d) throws ListEmptyException, NotInListException
 //removes an existing value from the list
 {
   Node<T> p, q, trav;
   
   if (size == 0) throw new ListEmptyException();
   
   trav=head.next;
   while (trav != head && !(trav.data).equals(d))
     trav = trav.next;
   
   if (trav==head) throw new NotInListException();
   
   p = trav.prev;
   q = trav.next;
   p.next = q;
   q.prev= p;
   size--;
 }
   
 public void begin() {current= head.next;}
 //positions the list at the beginning of the list
  public void advance() { current = current.next;}  
 //advances to the next element in the list
 
 public void retreat() { current = current.prev;} 
 //retreats to the previous item in the list
 T current() throws ListEmptyException  
 //returns the value at the current point of the list
 {
   if (isEmpty()) throw new ListEmptyException();
   return current.data;
 }
 public boolean end() { return (head.next==head || current.next == head);}  
//determines if we are at the end of the list
 public boolean isEmpty() { return (size == 0);}
 //determines if the list is empty
 public int size(){return size;}
 //returns the number of elements in the list 
}
