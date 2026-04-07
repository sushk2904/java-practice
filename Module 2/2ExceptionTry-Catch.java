class ExceptionDemo {
    public static void main(String args[]){
       int i = 0;
       int j = 0;
        try {
            j = 18/i;
        }
        catch(ArithmeticException e){
            System.out.println("something is wrong");
        }
        System.out.println(j);
        System.out.println("bye");
    }
}