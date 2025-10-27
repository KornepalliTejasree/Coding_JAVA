package LinkedList;
class Node{
    int data;
    Node next;
    Node(int d,Node next){
        data=d;
        this.next=next;
    }
}
class LinkedList{
     Node head=null;
    void addLast(int d){
        Node temp=new Node(d,null);
        if(head==null){
            head=temp;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
    }
    Node sum(Node l,Node m){
        int sum=0;
        String s="";
        String s1="";
        while(l!=null){
            s+=l.data;
            l=l.next;
        }
        while(m!=null){
            s1+=m.data;
            m=m.next;
        }
        sum=Integer.parseInt(s)+Integer.parseInt(s1);
        StringBuffer sb=new StringBuffer(sum+"");
        sb.reverse();
        Node dummy=new Node(0,null);
        Node curr=dummy;
        for(int i=0;i<sb.length();i++){
            curr.next=new Node(sb.charAt(i)-'0',null);
            curr=curr.next;
        }
        return dummy.next;
    }
    static void display(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
public class AddTwoNumbers {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        LinkedList list1=new LinkedList();
        LinkedList list2=new LinkedList();
      list.addLast(2);
      list.addLast(4);
      list.addLast(3);
      list1.addLast(5);
      list1.addLast(6);
      list1.addLast(4);
     Node result= list2.sum(list.head,list1.head);
        list2.display(result);

    }
}
