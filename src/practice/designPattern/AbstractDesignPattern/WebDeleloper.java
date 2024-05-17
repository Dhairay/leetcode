package practice.designPattern.AbstractDesignPattern;

public class WebDeleloper implements Employee{

    @Override
    public int salary() {
        return 20000;
    }

    @Override
    public String name() {
        System.out.println("I am a Web Developer");
        return "WEB DEVELOPER";
    }
}
