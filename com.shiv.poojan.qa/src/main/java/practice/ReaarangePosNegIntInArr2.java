package practice;

public class ReaarangePosNegIntInArr2 {
	public static void main(String[] args) {
		int[] arr1 = { 1, -2, 3, -4, 5, -6, 7, -8, 9, -10 };
		printArr(arr1);
		int[] rearrange1 = rearrange(arr1);
		printArr(rearrange1);
		int[] arr2 = { 1, 12, -2, 3, -4, 5, -6, 7, -8, 9, -10 };
		printArr(arr2);
		int[] rearrange2 = rearrange(arr2);
		printArr(rearrange2);
		
	}

	public static int[] rearrange(int[] arr) {
		int length = arr.length;
		int k=0;
		for (int i = 0; i < length-1; i++) {
			if (arr[i] > 0 && arr[i + 1] < 0) {
				int temp;
				if(k!=0) {
					temp = arr[i + 1];
					arr[i + 1] = arr[k];
					arr[k] = temp;
					k=k+1;
				}else {
				temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
				k=i+1;
				}
				
			}
			
			
		}
		
		return arr;
	}
	
	static void printArr(int[] arr1){
		for(int j=0;j<arr1.length;j++) {
			System.out.print(arr1[j]+" ");
			}
		System.out.println();
	}
}
