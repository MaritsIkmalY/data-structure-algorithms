package misc.big_o;

public class FourthO {
    public static void printItems(int n){
        // O(n)
        for (int i=0; i<n; i++){
            //O(n)
            for (int j=0; j<n; j++){
                System.out.println(i + " "+ j);
            }
        }

        //O(n)
        for (int k=0; k<n; k++){
            System.out.println(k);
        }

        // O(n^2) + O(n) = O(n^2+n)
        // Rules : Drop Non-Dominants
        // The big O turn into O(n^2)
    }

    public static void main(String[] args) {
        printItems(10);
    }
}
