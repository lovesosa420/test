public class Main {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
    }

    private static String removeWhiteSpaces(String str) {
        return  str.replaceAll(" ", "");
    }
}