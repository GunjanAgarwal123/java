class Pattern24{
	public static void main(String[] args){
		for(int i=1; i<=5;i++){
			for(int k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				if(j == i || j==1){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
					