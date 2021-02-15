public class Main {
    public static void main (String args[]){
        ChocolateBoiler.getInstance().fill();
        System.out.println("Is it empty the boiler? " + ChocolateBoiler.getInstance().isEmpty());
    }
}
