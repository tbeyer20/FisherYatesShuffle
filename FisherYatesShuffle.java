import java.util.Arrays;
import java.util.Random;

public class FisherYatesShuffle {

	public static void main(String[] args) {
		int size = 10;
		int[] array = new int[size];

		array = shuffleIt(size);
		fisherYatesShuffle(array);

		System.out.println(Arrays.toString(array));
	}

	public static int[] fisherYatesShuffle(int[] array) {
		int[] cards = new int[array.length];
		Random rand = new Random();

		for (int i = cards.length - 1; i > 0; i--) {
			int n = rand.nextInt(i + 1);

			// swap
			int tmp = cards[n];
			cards[n] = cards[i];
			cards[i] = tmp;
		}

		return cards;
	}

	public static int[] shuffleIt(int numberOfElements) {
		int[] myArray = new int[numberOfElements];
		Random rand = new Random();

		while (numberOfElements > 0) {
			int n = rand.nextInt(500) + 1;
			myArray[numberOfElements-1] = n;
			numberOfElements--;
		}

		return myArray;
	}

}
