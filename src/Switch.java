public class Switch {

    public static void main(String[] args) {

        int switchValue = 10;    //var

        switch(switchValue) {

            case 1:             //1 is testing against var
                System.out.println("The number is 1");
                break;

            case 2:             //2 is testing against var
                System.out.println("The number is 2");
                break;

            case 3:             //3 is testing against var
                System.out.println("The number is 3");
                break;

            case 4:             //4 is testing against var
                System.out.println("The number is 4");
                break;

            case 5: case 6: case 7:         //grouping
                System.out.println("The number was a 5, 6, or 7");
                System.out.println("The number was actually a " + switchValue);
                break;

            default:                        //default
                System.out.println("The number was not any of the case test numbers");
                System.out.println("The number was actually " + switchValue);

        }

    }

}

/*int switchValue = 10;
result;
The number was not any of the case test numbers
The number was actually 10
*/
