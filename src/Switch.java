public class Switch {

    public static void main(String[] args) {

      String carMake = "gm";
      switch(carMake.toUpperCase()) {

          case "Chevy":
              System.out.println("The car make is a Chevy");
              break;

          case "Ford":
              System.out.println("The car make is a Ford");
              break;

          case "GM":
              System.out.println("The car make is a GM");
              break;

          default:
              System.out.println("Car make not included for test");

      }

    }

}

//result was The car make is a GM
