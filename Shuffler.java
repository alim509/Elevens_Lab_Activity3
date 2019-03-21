public class Shuffler {

	private static final int SHUFFLE_COUNT = 1;

	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void perfectShuffle(int[] values) {
		int[] top = int[values.length / 2];
		int[] bottom = int[values.length / 2];
		for(int i = 0; i < values.length; i++)
			{
				if(i < values.length / 2) {
					top[i] = values[i];
				}
				else {
					bottom[i] = values[i];
				}
			}

		values = int[values.length];

		for(int i = 0; i < values.length / 2; i++)
			{
				values[i] = bottom[i];
				values[i + 1] = top[i];
			}
	}

	public static void selectionShuffle(int[] values) {
		int rand;
		int temp;
		for(int i = values.length - 1; i > 0; i--) {
			rand = (int)(Math.random * i);
			temp = values[i];
			values[i] = values[rand];
			values[rand] = temp;
		}
	}
}
