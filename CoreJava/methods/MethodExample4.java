package methods;

public class MethodExample4 {

	public static void main(String[] args) {
		int arr[]={67,45,34,23};
		
		int val=34;
		int ans=search(arr, val);
		
		if(ans==-1)
		System.out.println("Value is not Present");
		else
			System.out.println("value is present at"+ans);
		

	}
	
	static public int search(int arr[],int val){
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==val)
				return i;
		}
		return -1;
	}

}
