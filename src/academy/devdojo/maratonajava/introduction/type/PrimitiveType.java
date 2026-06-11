package academy.devdojo.maratonajava.introduction.type;

public class PrimitiveType {
    static void main() {
    //  int, double, float, char, byte, short, long, boolean
    int number = 20;
    int numberCastNarrowing = (int) 10000000000l;
    long numberLarge = 2147483647;
    double salaryDouble = 1000000000;
    float salaryFloat = 12.5f;
    byte salaryByte = 127;
    short salaryShort = 32767;
    boolean trueValue = true;
    boolean falseValue = false;
    char charValue = 'a';
    char charValue2 = '\u0042';
    char charValue3 = 67;
    String stringValueReferenceType = "Hello World";

    IO.println("The age is: " + number);
    IO.println("The true value is: " + trueValue);
    IO.println("The char value is: " + charValue);
    IO.println("The charUnicode value is: " + charValue2);
    IO.println("The charAscII value is: " + charValue3);
    IO.println("The ageCastNarrowing value is: " + numberCastNarrowing);
    IO.println("The stringValueReferenceType value is: " + stringValueReferenceType);

    }
}