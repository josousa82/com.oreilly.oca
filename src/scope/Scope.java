package scope;

public class Scope {

private static int y = 99; //---------------------scope of y (full class)

    public static void main(String[] args) {
        int x = y;//---------------------scope of x
        {
            // x = d; out of scope, d is declared after
            int j = 100; //---------------------scope of j
            System.out.println("j = " + j + " x = " + x);

            int d = 100; //---------------------scope of d
            x = d; // in scope

            System.out.println("y = " + y);
            System.out.println("d = " + d);
        } //---------------------------------------scope of d, scope of j (not visible out of the block)

        // System.out.println("j = " + j);  out of scope because is declared inside the block statement
        // System.out.println("d = " + d);  out of scope because is declared inside the block statement
        System.out.println("x = " + x);
    }//---------------------scope of x
}   //---------------------scope of y (full class)
