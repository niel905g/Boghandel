package niel905g;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bog deitel = new Bog("Java: how to program", "Deitel & Deitel", 497.00, 8);
        Bog horton = new Bog("Beginning Java 2", "Ivor Horton", 495.00, 3);

        System.out.println(deitel);
        System.out.println(horton);

        deitel.subAntal(2);
        System.out.println(deitel);

        horton.setPris(395.00);
        System.out.println(horton);

        horton.addAntal(3);
        System.out.println(horton);
    }
}
