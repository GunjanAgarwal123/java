class Pattern8 {
	public static void main(String args[]) {
		for (int i = 5; i >= 1; i--) {
			int count = 1;
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("* ");
				}

				else {
					System.out.print(count + " ");
					count++;

				}
			}
			System.out.println();

		}
	}
}

// 1 * 2 * 3
// 1 * 2 *
// 1 * 2
// 1 *
// 1