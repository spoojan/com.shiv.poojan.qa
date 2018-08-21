package practice;

public class ReaarangePosNegIntInArr {
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
		int key, j;
		int n=arr.length;
    for(int i = 1; i < n; i++)
    {
        key = arr[i];
 
        // if current element is positive
        // do nothing
        if (key > 0)
            continue;
 
        /* if current element is negative,
        shift positive elements of arr[0..i-1],
        to one position to their right */
        j = i - 1;
        while (j >= 0 && arr[j] > 0)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
 
        // Put negative element at its right position
        arr[j + 1] = key;
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
