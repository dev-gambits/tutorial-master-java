package cl.sideral.variables;

public class Welcome {
    public static void main(String[] args) {
        String greeting = "Welcome to Core Java !!";
        System.out.println("greeting = " + greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.println("=");
            System.out.println();
        }
    }
}
