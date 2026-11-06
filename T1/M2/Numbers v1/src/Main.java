public class Main {
    public static void main(String[] args) {
        int a=2000000000, b=2000000000, result=0;
        int first=8, second=5;
        long aL=10000, bL=10000, resultL=0;

        // Part 1:
        // Sum of a+b, the result may not be as expected
        // Output: -294967296
        System.out.println("Part 1:");
        System.out.println(a+b);

        // Part 2:
        // Sum of aL+bL and assign the result to an int "result" variable
        // result=aL+bL; -> We cqn not assign long variables to an int variable, result must be long as well.
        System.out.println("Part 2:");
        resultL=aL+bL;
        // Output: 20000
        System.out.println(resultL);

        // Part 3:
        System.out.println("Part 3:");
        System.out.println(first+second); // Sum
        System.out.println(second-first); // Subtraction
        System.out.println(Math.pow(first, second)); // Product
        System.out.println(first/second); // Quotient
        System.out.println(second%first); // Remainder

        // Part 4:
        System.out.println("Part 4:");
        result=++first; // Value of "first" was 8 so we increment first and then use, it prints 9
        System.out.println(result);
        result=first++; // Value of "first" was 9 so we use first and then we increment, it prints 9 and it becomes 10
        System.out.println(result);
        result=--second; // Value of "second" was 5 so we decrement first and then we use, it becomes and it prints 4
        System.out.println(result);
        result=second--; // value of "second" was 4 so we use first and then we decrement, it prints 4 and it becomes 3
        System.out.println(result);
    }
}