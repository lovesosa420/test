public class Main {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
        System.out.println("it's ok");
    }

    private static String removeWhiteSpaces(String str) {
        return  str.replaceAll(" ", "");
    }
}