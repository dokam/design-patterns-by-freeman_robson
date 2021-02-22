public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if (uniqueInstance==null){
            synchronized (ChocolateBoiler.class) {
                uniqueInstance = new ChocolateBoiler();
            }
        }
        return uniqueInstance;
    }

    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    //rest of ChocolateBoiler code.....
}
