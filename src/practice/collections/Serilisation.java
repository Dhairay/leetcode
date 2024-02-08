package practice.collections;
import java.io.*;
class emp implements Serializable{
    Integer empnu=11;
     Float salary=50000.11f;
     String s="hello";
}

public class Serilisation {
    public static void main(String[] args) {
        try{
            emp e1=new emp();

            // Here we are doing reading an object from the file

          FileOutputStream fos=new FileOutputStream("emp.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
           oos.writeObject(e1);
            oos.close();
            fos.close();

            // Here we are doing writing an object from the file

           FileInputStream fis=new FileInputStream("emp.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            emp e2=(emp)ois.readObject();
            System.out.print(e2.empnu +" "+ e2.salary+" "+e2.s);
            ois.close();
            fis.close();


        }
        catch (Exception ex)
        {
            System.err.println(ex);
        }

    }
}
