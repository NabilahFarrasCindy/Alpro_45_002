package ch06;

class SelectionSort {
    void Sort (int arr[])
    {
	int n = arr.length;

	for (int i = o; i < n-1; i++){
	   int min_idx = i;
	   for (int j = i+1; j < n; j++){
		if (arr[j] < arr (min_idx])
		   min_idx = j;

	   int temp = arr(min_idx);
	   arr[min_idx] = arr[i];
	   arr[i] = temp;

	}
    }

    void printArray (int arr[])
    {
	int n = arr.length;
	for (int i=0; i<n; ++i)
	    System.out.print(arr[i] + " ");
	System.out.println();
    }

    public static void main(String args[])
    {

	SelectionSort ob = new SelectionSort();
	int arr[]= {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
	ob.Sort(arr);
	
	System.out.println("Sorted Array = ");
	ob.printArray(arr);

    }
}