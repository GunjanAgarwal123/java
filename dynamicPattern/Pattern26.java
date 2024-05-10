class Pattern26 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
			for(int k=1;k<=i;k++){
				System.out.print(k+" ");
			}
			for(int j=i-1;j>=1;j--){
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}
}
