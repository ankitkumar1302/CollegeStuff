public class dsaAssignment {

    /*
    4) Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    5) Take 2 numbers as input and print the largest number.
    6) Input currency in rupees and output in USD.
    7) To calculate Fibonacci Series up to n numbers.
    8) To find out whether the given String is Palindrome or not.
    9) To find Armstrong Number between two given number.
     */
    public static void main(String[] args) {
        System.out.println(question9(153));
    }
    static boolean question9(int n) {
        // What is Armstrong Number
        // between 2 numbers
        int originalNumber = n;
        int sum = 0;
        int numOfDigits = String.valueOf(n).length();
        while (n != 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, numOfDigits);
            n /= 10;
        }
        return sum == originalNumber;
    }
    /*
static boolean isArmstrong(int num) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(isArmstrong(a));
    int originalNum = num;
    int sum = 0;
    int numOfDigits = String.valueOf(num).length();
    while (num != 0) {
        int digit = num % 10;
        sum += (int) Math.pow(digit, numOfDigits);
        num /= 10;
    }
    return sum == originalNum;
}
    static boolean question8(String str) {
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    static void question7(int n) {
        int num1 = 0, num2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.printf(num1 + " ");
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }

    static void question6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the indian rupees: ");
        float INR = sc.nextFloat();
        float USD = 86.5F;
        float ans = INR * USD;
        System.out.println("The price in USD is " + ans);
    }


    static void question5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st value");
        int firstValue = sc.nextInt();
        System.out.println("Enter the second value");
        int secondValue = sc.nextInt();
        if (firstValue > secondValue) {
            System.out.println("The greatest value is : " + firstValue);
        } else System.out.println("The greatest value is : " + secondValue);
    }


    static void question4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int fisrtNumber = sc.nextInt();
        System.out.println("Enter the 2nd value: ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter the operator: ");
        String operator = sc.next();
        if (operator.equals("+")) {
            System.out.println("The answer is : " + fisrtNumber + secondNumber);
        } else if (operator.equals("-")) {
            System.out.println("The answer is :" + (fisrtNumber - secondNumber));
        } else if (operator.equals("*")) System.out.println("The answer is : " + fisrtNumber * secondNumber);
        else if (operator.equals("/")) System.out.println("The answer is " + fisrtNumber / secondNumber);
    }
     */


}






