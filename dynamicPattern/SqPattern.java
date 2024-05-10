class SqPattern{
	public static void main(String[] args){
		int count=4;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
			if(i==1){
			System.out.print(j+" ");
			}
			else if(i==4){
		
				System.out.print(count--+" ");
				}
				
			else if(j==1){
				System.out.print(i+" ");
			}
			
			else if(j==4){
				System.out.print(5-i+" ");
			}
			else{
				System.out.print("  ");
		}
		}
		System.out.println();
		}
	}
}	
			
			
				