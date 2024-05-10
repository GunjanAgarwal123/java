class SelectionSort{
	public static void main(String[] args){

		int [] a = {30,20,10,50,40};
		int temp;
		for(int i=0;i< a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		System.out.print("Sorted array= ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
	}
}			