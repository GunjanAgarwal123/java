class Pattern2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print((int) Math.pow(2, j - 1) + " ");
			}
			System.out.println();
		}
	}
}

// 1
// 1 2 4
// 1 2 4 8 16
// 1 2 4 8 16 32 64