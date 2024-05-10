class OptimiseBubbleSort{
	public static void main(String[] args){
		int [] a = {30,20,10,50,40};
		for(int i=0;i< a.length-1;i++){
			boolean flag =false;
			for(int j=0;j< a.length-i-1;j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
				
			}
			if(flag == false){
				break;
				
			}
		}
		System.out.print("Sorted array= ");
		for(int i=0;i<a.length;i++){

			System.out.print(a[i]+"\t");
		}
	}
}



		