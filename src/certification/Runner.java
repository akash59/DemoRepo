package certification;

public class Runner {

    /**
     * This is the main method, entry point for the program
     * @param args this is a command line argument
     */
    public static void main(String[] args) {

        Person person = new Person("Akash", "Sood", 28);

        System.out.println("Person's firstName is " + person.getFirstName());
        System.out.println("Person's lastName is " + person.getLastName());
        System.out.println("Person's age is " + person.getAge());

        person.setLastName("FNU");
        person.setAge(29);

        System.out.println("Person's lastName is " + person.getLastName());
        System.out.println("Person's age is " + person.getAge());

        int a = sum(5, 10);


        int m = 9, n = 1, x = 0;
        while(m > n)
        {
               m--;
               n += 2;
               x += m + n;
        }
        System.out.println("m = "+m + " n = "+n + " x = "+x);


        for(int i = 0; i<10;) {

            i = i++;
            System.out.println("Hello World");
        }

    }





    /**
     * This method calculates the sum of two integers
     * @param a integer operand
     * @param b integer operand
     * @return sum of the two integers
     */
    public static int sum(int a, int b) {
        return a+b;
    }



}





