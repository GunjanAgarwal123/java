class Quick{
	public static int quicksort(int[] a,int lb,int ub){
		int start = lb;
		int end = ub;
		int PIVOT = lb;
		while(start < end ){
			while(start < ub && a[start] <= a[PIVOT]){
				start++;
			}
			while(end >lb && a[end] > a[PIVOT]){
				end--;
			}
			if(start < end){
				int temp =a[start];
				a[start] = a[end];
				a[end] = temp;
			}
		}
		int temp = a[end];
		a[end] = a[PIVOT];
		a[PIVOT] = temp;
		return end;
	}
	public static void sort(int[] a,int lb,int ub){
		if(lb < ub){
			int index = quicksort(a,lb,ub);
			sort(a,lb,index-1);
			sort(a,index+1,ub);
		}
	}
}
class QuickSort{
	public static void main(String[] args){
		int[] a = {3,2,11,1,5,4,7,9};
		int lb = 0;
		int ub = a.length-1;
		Quick obj =new Quick();
		obj.sort(a,lb,ub);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
	}
}

