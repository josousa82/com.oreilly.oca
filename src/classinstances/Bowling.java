package classinstances;

public class Bowling {
    {
        System.out.println("1st block of code");
    }

    public Bowling() {
        System.out.println(" Im the constructor");
    }

    static {
        System.out.println("2nd and static block");

    }

    {
        System.out.println("3rd block of code");
    }
}
