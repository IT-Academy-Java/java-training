package basicTraining;

public class Reverse {

  public static void main(String[] args) {

    String[] array = {"a", "m", "o", "r"};

    System.out.println("\n\n\n\n*************** Original array *************** ");
    for(String i : array) {
      System.out.print(i + " ");
    }

    String aux = "";
    int length = array.length - 1;

    for(int i = 0; i < array.length/2; i++) {
      aux = array[i];

      array[i] = array[length - i];
      array[length - i] = aux;
    }

    System.out.println("\n\n\n\n*************** Reverse array *************** ");
    for(String i : array) {
      System.out.print(i + " ");
    }

  }
}
