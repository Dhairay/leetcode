package practice.practice;

interface MathOperation {
    public Integer  operate(Integer input1, Integer input2);
    public Integer operate(Integer input1, Integer input2, Integer input3);
    public Integer operate(Integer input1, Integer input2, Integer input3,Integer input4);
}

class AdditionOperation implements MathOperation {

    @Override
    public Integer operate(Integer input1, Integer input2) {
        return input1 + input2;
    }

    @Override
    public Integer operate(Integer input1, Integer input2, Integer input3) {
        return input1 + input2 +input3;
    }

    @Override
    public Integer operate(Integer input1, Integer input2, Integer input3, Integer input4) {
        return null;
    }
}

class SubtractionOperation implements MathOperation {

    @Override
    public Integer operate(Integer input1, Integer input2) {
        return input1 - input2;
    }

    @Override
    public Integer operate(Integer input1, Integer input2, Integer input3) {
        return null;
    }

    @Override
    public Integer operate(Integer input1, Integer input2, Integer input3, Integer input4) {
        return null;
    }
}

class MultiplyOperation implements MathOperation {

    @Override
    public Integer operate(Integer input1, Integer input2) {
        return input1 * input2;
    }

    @Override
    public Integer operate(Integer input1, Integer input2, Integer input3) {
        return null;
    }

    @Override
    public Integer operate(Integer input1, Integer input2, Integer input3, Integer input4) {
        return null;
    }
}

public class LearnBasics {
    public static void main(String[] args) {
        MathOperation operation = new AdditionOperation();
        MathOperation operation2 = new SubtractionOperation();
        MathOperation operation3 = new MultiplyOperation();

        System.out.println(operation.operate(2,2));
        System.out.println(operation2.operate(2,3));
        System.out.println(operation3.operate(3,4));

    }
}
