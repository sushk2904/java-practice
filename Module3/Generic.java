package Module3;

class MagicBox<T>{
    private T item;

    public void PutInBox(T item){
        this.item = item;
    }
    public T TakeOutBox(){
        return item;
    }
    class Generic{
        public static void main(String args[]){
            MagicBox<String> wordbox = new MagicBox<>();
            wordbox.PutInBox("Hello");

            MagicBox<Integer> numbox = new MagicBox<>();
            numbox.PutInBox(10);

        }
    }
    


}
