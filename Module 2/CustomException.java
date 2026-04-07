public class CustomException extends Exception {
    public CustomException(String message) {
    super(message);
    }


    public static void main(String args[]){
        int i = 4;
        int j = 0;
        
        try{
            j = 20/i;
            if (j==5)
                throw new CustomException("I dont want to print 5");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        catch(CustomException e){
            System.out.println("CustomException: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Exception here is:" + e.getMessage());
        }

    }

}
