import java.util.*;

public class LinkList{
    MyNode head;
    class MyNode {
        String data;
        MyNode next;

        public MyNode(String data){
            this.data = data;
            this.next = null;
        }

        public MyNode(String data, MyNode next){
            this.data = data;
            this.next = next;
        }
    }

    public void append(String data) {
        head = append(data, head);
    }

    private MyNode append(String data, MyNode node) {
        if (node == null) return new MyNode(data);
        node.next =  append(data, node.next);
        return node;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("");
        for (MyNode p = head; p != null; p = p.next){
            builder.append(p.data).append(" ");
        }
        return builder.toString();
    }
    public void removeFirst(String data) {
        head = removeFirst(data,head);
    }

    private MyNode removeFirst(String data, MyNode node){
        if(node == null) return null;
        if(node.data.equals(data)){
            node = node.next;
        }
        node.next = removeFirst(data,node.next);
        return node;
    }


    public void removeAll(String data){
        head = removeAll(data,head);
    }

    private MyNode removeAll(String data,MyNode node){
        if(node == null) return null;
        if(node.data.equals(data)){
            return removeAll(data,node.next);
        }
        node.next = removeAll(data,node.next);
        return node;
    }
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.append("1");
        list.append("SaKa");
        list.append("1");
        list.append("1");
        System.out.println(list);

        list.removeFirst("1");
        System.out.println(list);
        list.removeAll("1");
        System.out.println(list);

    }

}