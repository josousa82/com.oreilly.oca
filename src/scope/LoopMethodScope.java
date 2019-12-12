package scope;

public class LoopMethodScope {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) //if the for loop has only one statement curly braces can be omitted
            System.out.println("i = " + i);
        //System.out.println("final i = " + i); out of scope because doesnt have braces and is not inside

        int j = 0;
        for (int i = 0; i < 10 ; i++) {
            System.out.println("i = " + i);
            j += i;
        }
        // System.out.println("final i = " + i);  out of scope
        System.out.println("j = " + j);
    }
}
