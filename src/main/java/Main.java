import java.util.Random;

public class Main {

  public static void main(String[] args) {

    int iloscliczb = 5;
    int min = 0;
    int max = 100;
    int sum = 0;

    Random random = new Random();

    for (int i = 0; i < iloscliczb; i++) {
      int losowaliczba = random.nextInt(max - min + 1) + min;
      sum += losowaliczba;
    }

    System.out.println("Suma wylosowanych liczb : " + iloscliczb + "losowe liczby pomiedzy :" + min + " i " + max
        + " wynosi : " + sum);

  }
}
