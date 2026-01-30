public class AgeToGroup {
    public static void main(String[] args) { 
        //Exploring the ternary operator

        int age = Integer.parseInt(args[0]);

        // if it is 18 or less it returns 0 
        // if it is greater than 18 but less than 65 it returns 1 
        // if it is greater than 65 it returns 2
        int ageGroup = (age<=18)? 0
                    : (age>=65) ? 2
                    : 1;    
            
        System.out.println("Age: " + age + ", Age Group: " + ageGroup);
    }
}
