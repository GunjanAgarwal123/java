class BinarySearch{
	public static void main(String[] args){
		int [] a = {1,2,5,7,8,9,10,14,16,18};
		int ele = 10;
		int start=0, end=a.length-1;
		boolean flag = false;
		while(start<= end){
			int mid = (start+end)/2;
			if(ele == a[mid]){
				flag = true;
				System.out.println("Element found at position"+(mid+1));
				break;
			}
			else if(ele < a[mid]){
				end = mid - 1;
			}
			else {
				start=mid + 1;
			}
		}
			if(flag == false){
				System.out.println("Element not found");
			}
		
	}
}	