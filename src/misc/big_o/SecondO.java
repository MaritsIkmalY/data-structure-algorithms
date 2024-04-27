package misc.big_o;

public class SecondO {
    public static void printItems(int n) {
        // O(n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // O(n)
        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }
        // O(n) + O(n) = O(n+n) = O(2n)
        //Rules : Drop the constant
        // so the big O turn into O(n)
        public static void main (String[]args){
            printItems(10);
        }

}
