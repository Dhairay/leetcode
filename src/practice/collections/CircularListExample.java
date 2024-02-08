package practice.collections;

class Node{
    int data;
    Node nextNode;
    public Node(int data){
        this.data = data;
        this.nextNode = null;
    }
    public void addNextNode(Node node){
        this.nextNode =node;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public int getData(){
        return this.data;
    }
}
public class CircularListExample {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node one = new Node(2);
        Node two = new Node(3);
        Node three = new Node(4);


        head.addNextNode(one);
        one.addNextNode(two);
        two.addNextNode(three);
        three.addNextNode(one);

        Node temp = head;
        System.out.println(temp.getData());

      /*  Node slowNode = head;
        Node fastNode = head;

        if(fastNode.nextNode == null || fastNode.nextNode.nextNode == null){
            System.out.println("It is not a circular list");
        }
        while(!slowNode.nextNode.equals(fastNode.nextNode.nextNode)){
            slowNode = slowNode.nextNode;
            fastNode = fastNode.nextNode.nextNode;
        }*/

        while(temp.getNextNode() != null) {
            temp = temp.getNextNode();
            System.out.println(temp.getData());

        }
    }
}
