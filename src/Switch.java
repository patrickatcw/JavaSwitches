public class Switch {

    public static void main(String[] args) {

       char switchLetter = 'A';

       switch(switchLetter) {

           case 'A':
               System.out.println("The letter was an A");
               break;

           case 'B':
               System.out.println("The letter was a B");

           case 'C': case 'D':
               System.out.println("The letter was either a C or D");

       }

    }

}

//result was The letter was A
