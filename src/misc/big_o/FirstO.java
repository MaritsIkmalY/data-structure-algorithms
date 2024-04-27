package misc.big_o;

public class FirstO {

    public static void printItems(int n){
        // O(n)
        for (int i=0; i<n; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printItems(10);
    }
}
