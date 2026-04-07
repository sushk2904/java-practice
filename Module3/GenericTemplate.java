package Module3;

// The <T> is a placeholder for "Type". We are creating a Generic Class.
class MagicBox<T> {
    private T item;

    public void putInBox(T item) {
        this.item = item;
    }

    public T takeOut() {
        return item;
    }
}

class GenericTemplate {
    public static void main(String[] args) {
        // We decide the "Type" when we create the object
        MagicBox<String> wordBox = new MagicBox<>();
        wordBox.putInBox("Hello"); // Works perfectly!
        // wordBox.putInBox(123);  // ERROR! Java stops you. The box is strictly for Strings.

        MagicBox<Integer> numberBox = new MagicBox<>();
        numberBox.putInBox(99); // Works perfectly!
    }
}
