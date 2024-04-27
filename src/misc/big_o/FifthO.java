package misc.big_o;

public class FifthO {
    public static int printItems(int n){
        // O(1)
        return n+n;
    }

    public static void main(String[] args) {
        printItems(10);
    }
}
