class InsertionSort
{
	public static void main(String[] args){
		int [] a = {30,20,10,50,40};
		for(int i=0;i<a.length-1;i++){
			int j=i+1;
			while(j > 0 && a[j] < a[j-1]){
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
				j--;
			
			}                                                                                 
		
		}
		for(int i=0;i<a.length-1;i++){
			System.out.print(a[i]+"\t");
		}
	}
}
				