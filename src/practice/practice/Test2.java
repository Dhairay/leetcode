package practice.practice;

class GrandParent {
    public GrandParent(){
        System.out.println("in grand parent cons");
    }
}
class Parent extends GrandParent{
    public int getId() {
        return id;
    }

    public Parent(){
        System.out.println("In parent constructor");
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;

    public void printData(){
        System.out.println(id + " " +name);
        canYouCall();
    }

    protected void canYouCall(){
        System.out.println("yes");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("In child constr");
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    private int idd;

    @Override
    public void printData() {
        super.printData();
        System.out.println(idd);
        canYouCall();
    }

    public void canYouCall(){
        System.out.println("No");
    }
}
public class Test2 {
    public static void main(String[] args) {
//        Parent p1 = new Parent();
        Parent p2 = new Child();
//        Child p3 = new Child();

//        p1.setId(3); p1.setName("parent");
        p2.setId(5); p2.setName("child");
//        p3.setId(2); p3.setName("chilll"); p3.setIdd(5);

//
//        p1.printData();
        p2.printData();
//        p3.printData();


    }
}
