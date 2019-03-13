package Algorithm.sort;

public class bubble {

	public int[] bubbleSort(int arr[],int n){ 
	    int t = 0;  int i=0;
	     for(; i < n; i++){  
	             for(int j=1; j < (n-i); j++){  
	                      if(arr[j-1] > arr[j]){  
	                             
	                             t = arr[j-1];  
	                             arr[j-1] = arr[j];  
	                             arr[j] = t;  
	                      		}  
	                      
	             	}  
	             try {
	     			Thread.sleep(1000);
	     		} catch (InterruptedException e) {
	     		
	     			e.printStackTrace();
	     		}
	     }
	     System.out.println("Sorting using Bubble Sort");
	          return arr;
		}
}
