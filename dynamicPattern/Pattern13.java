class Pattern13{
	public static void main(String[] args){
		
		for(int i=1;i<=5;i++){
			int count=4;
			int temp = i;
			for(int j=1;j<=i;j++){
				
				System.out.print(temp+" ");
				temp+= count;
				count--;
			}	
			System.out.println();	
		}
	}
}
