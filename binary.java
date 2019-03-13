package Algorithm.Search;

public class binary {
	public void binarySearch(int array[],int n, int key)
	  {
	    int f, l, m, s;
	    System.out.println("Using Binary Search");
	    s = key;
	 
	    f  = 0;
	    l   = n - 1;
	    m = (f + l)/2;
	 
	    while( f <= l )
	    {
	      if ( array[m] < s )
	        f = m + 1;    
	      else if ( array[m] == s ) 
	      {
	        System.out.println(s + " found at location " + (m + 1) + ".");
	        break;
	      }
	      else
	         l = m - 1;
	 
	      m = (f + l)/2;
	   }
	   if ( f > l )
	      System.out.println(s + " is not present in the list.\n");
	  }
}
