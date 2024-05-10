class Pattern9 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 4; i++) {
			count += i;
			int temp = count;
			for (int j = 1; j <= i; j++) {

				System.out.print((temp--) + " ");
			}
			System.out.println();

		}
	}
}

// 1
// 3 2
// 6 5 4
// 10 9 8 7