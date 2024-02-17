public class linkedlist {
    Node head,tail;
    int size;

    public linkedlist(){
        head = tail = null;
        size = 0;
    }
    public class  Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void  create(int s){
        Node n = new Node(s);
        if(head == null){
            tail = head = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
        size++;
    }
    public int getsize(){
        return size;
    }
    public void printlist(Node head){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            while(head!=null){
            System.out.println(head.data);
            head = head.next;
          }
        }
    }
    public static void main(String args[]){
        linkedlist list = new linkedlist();
        list.create(1);
        list.create(2);
        list.create(3);
        list.printlist(list.head);
        System.out.println(list.getsize());
    }
}
