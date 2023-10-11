public class Project1 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;

        do {
            System.out.println("Guess my number between(1-100)");
             userNumber = sc.nextInt();


            if (userNumber == myNumber) {

                System.out.println(" Woohhhooo..'Correct number'");

            } else if (userNumber > myNumber) {

                System.out.println("Your number is too large");
            } else {
                System.out.println("Your number is too small");
            }
        } while (userNumber >= 0);

        System.out.println("MyNumber was:" + myNumber);

    }

}
