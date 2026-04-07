class Exception2 {
    public static void main(String args[]){
        int i = 0;
        int j = 0;

        int nums[] = new int[5];

        try {
            j = 18/i;                         //ArithmeticException
            System.out.println(str.length()); //NullpointerException
            System.out.println(nums[1]);
            System.out.println(nums[5]);      //ArrayIndexOutOfBoundsException
        }

        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in our limits: " + e.getMessage());
        }

        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("BYE");
    }
}