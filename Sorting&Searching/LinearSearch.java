class LinearSearch{
	public static void main(String[] args){
		int [] a = new int[] {20,10,30,60,50};
		int ele=10;
		boolean flag=false;
		for(int i=0;i<a.length;i++){
			if(a[i] == ele){
				System.out.println("Element found at position"+(i+1));
				flag =true;
				break;
			}
		}
		if(flag == false){
			System.out.println("Element not found");
		}
	}
}