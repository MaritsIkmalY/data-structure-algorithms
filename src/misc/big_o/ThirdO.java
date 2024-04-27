package misc.big_o;

public class ThirdO {
    public static void printItems(int n){
        // O(n)
        for (int i=0; i<n; i++){
            //O(n)
            for (int j=0; j<n; j++){
                System.out.println(i + " "+ j);
            }
        }
    }

    // O(n) inside O(n) means O(n*n)
    // so the big O turn into O(n^2)
    public static void main(String[] args) {
        printItems(10);
    }
}
