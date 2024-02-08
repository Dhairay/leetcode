package practice.practice;

class AiseHi extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be nagative";
    }
}


public class MajorityElement {

        public static double radius(int r) throws AiseHi {
            if(r<0)
            {
                throw new AiseHi();
            }
        double result=Math.PI * r * r;
        return result;
    }
    public static void main(String[] args) {
            try{

               double ar=radius(4);
                System.out.println(ar);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
    }
    }


