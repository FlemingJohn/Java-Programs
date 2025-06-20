public class CheckLeapYear {

     public static void isLeapYear(int year) {

        boolean is_leap_year = false;

        if(year%4 == 0){

            is_leap_year = true;

            if (year % 100 == 0){

                if(year % 400 == 0){

                    is_leap_year = true;
                }
                else{

                    is_leap_year = false;
    
                }
            }

            else{

                is_leap_year = false;
            }

            if(!is_leap_year){
                System.out.println("Not a Leap");
            }
            else{
                System.out.println("Leap Year");
            }
        }
     }
     public static void main(String[] args) {
        
        isLeapYear(2000);

        isLeapYear(2002);
     }
}