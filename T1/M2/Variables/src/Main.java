public class Main {
  public static void main(String[] args) {
    boolean booleanVar=true;
    char charVar='a';
    byte byteVar=5;
    short shortVar=12;
    int intVar=198;
    long longVar=19283;
    float floatVar=38;
    double doubleVar=18.29;

    System.out.println(booleanVar);
    System.out.println(charVar);
    System.out.println(byteVar);
    System.out.println(shortVar);
    System.out.println(intVar);
    System.out.println(longVar);
    System.out.println(floatVar);
    System.out.println(doubleVar);

    final double PI=3.14;
    // PI = 3.1415926536; -> This results in error because we cannot change a "final" variable;
    System.out.println(PI);
  }
}