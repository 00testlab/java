package Algorithm.sort;

public class selection {

	public int[] selectionSort(int arr[],int n){
		 int i = 0;
		   for (; i < n - 1; i++)  
	       {  
	           int index = i;  
	           for (int j = i + 1; j < n; j++){  
	               if (arr[j] < arr[index]){  
	                   index = j;
	               }  
	           }  
	           int smallerNumber = arr[index];   
	           arr[index] = arr[i];  
	           arr[i] = smallerNumber;  
	           try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
	       } 
		   System.out.println("Sorting using Selection Sort");
		 return arr;
	 }
}
