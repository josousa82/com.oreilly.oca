public class MethodsOCA {

    public static void testReturnVoid(Boolean test){
        if(test){
            System.out.println("Inside if return");
            return;
        }
        System.out.println("Outside if ");
    }

    public static void main(String[] args) {
        testReturnVoid(true);
    }
}
