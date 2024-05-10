class Pattern22{
	public static void main(String[] args){
		for(int i=1;i<=8;i++){
			for(int k=1;k<=8-(i-1);k++){
				System.out.print("*");
			}
			for(int j=1;j<=16;j++){
				if(j<i){
					System.out.print("__");
				}
				else if(j>i+7){
					System.out.print("*");
				}
				
			}	
			System.out.println();
		}
	}
}