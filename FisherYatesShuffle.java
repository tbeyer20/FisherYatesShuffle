import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FisherYatesShuffle {

	public static void main(final String[] args) {
		final int size = 10;

		ArrayList<Integer> random_arr = getRandomArray(size);
		System.out.println("Initial order of random array:   "  + random_arr);

		System.out.println("Array after FisherYates Shuffle: " + Arrays.toString(fisherYatesShuffle(random_arr)));
	}

	private static int[] fisherYatesShuffle(final ArrayList<Integer> random_arr) {
		final int arr_length = random_arr.size();
		final int[] shuffled_arr = new int[arr_length];
		final Random rand = new Random();

		for (int i = 0; i < arr_length; i++) {
			final int rand_index = rand.nextInt(random_arr.size());
			shuffled_arr[i] = random_arr.get(rand_index);
			random_arr.remove(rand_index);
		}

		return shuffled_arr;
	}

	private static ArrayList<Integer> getRandomArray(int numberOfElements) {
		final ArrayList<Integer> rand_arr = new ArrayList<Integer>();
		final Random rand = new Random();

		while (numberOfElements-- > 0) {
			rand_arr.add(rand.nextInt(500));
		}
		return rand_arr;
	}

}
