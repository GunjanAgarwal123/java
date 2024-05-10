class Pattern5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "" + j + "" + j + " ");
			}
			System.out.println();
		}
	}
}

// 111
// 111 222
// 111 222 333
// 111 222 333 444
// 111 222 333 444 555