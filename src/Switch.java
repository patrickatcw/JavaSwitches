public class Switch {

    public static void main(String[] args) {

        char switchLetter = 'Z';

        switch(switchLetter) {

            case 'A':
                System.out.println("The letter was an A");
                break;

            case 'B':
                System.out.println("The letter was a B");

            case 'C': case 'D':
                System.out.println("The letter was either a C or D");

            default:
                System.out.println("Letter not included in testing case");

        }

    }

}

//result was Letter not included in testing case
