package practice.designPattern.AbstractDesignPattern;

public class AndroidDeveloper implements Employee{


    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        System.out.println("I am a Android Developer");
        return "ANDROID DEVELOPER";
}
}
