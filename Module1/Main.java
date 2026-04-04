class Calculator {
    public int add(int a, int b){
        return a + b ;
    }
    public int add(int a, int b, int c){
        return a + b + c;

    }

    public double add(double a, double b){
        return a + b;

    }
}

    public class Main {  ///But if i remove the public from the public class then i can give any name to the java file
        public static void main(String[] args){
            Calculator calc = new Calculator();
            System.out.println(calc.add(5,10));
            System.out.println(calc.add(11, 12, 13));
            System.out.println(calc.add(10.5, 11.5));
        }
    }
