package Module5;

class A implements Runnable{
    public void run(){
        for(int i =1; i<=5; i++){
            System.out.println("Hi");
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i =1; i<=5; i++){
            System.out.println("Hello");
        }
    }
}




public class Runnablemethod {
    public static void main(String args[]){
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Runnable obj3 = () -> 
        {
                for(int i =1; i<=5; i++){
                System.out.println("Namaste");
        }
            


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);
        
        t1.start();
        t2.start();
        t3.start();
    }
        }
