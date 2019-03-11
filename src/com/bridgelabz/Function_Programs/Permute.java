package com.bridgelabz.Function_Programs;

import java.util.Iterator;
import java.util.NoSuchElementException;


	public class Permute implements Iterable<String>
	{

	    // could implement Collection<String> but it's immutable, so most methods are essentially vacuous

	    public String string;

	    

	     /*
	     * Constructs and sequentially returns the permutation values 
	     */
	    @Override
	    public Iterator<String> iterator() {

	        return new Iterator<String>() {

	            char[] array = string.toCharArray(); 
	            int length = string.length();
	            int[] index = (length == 0) ? null : new int[length];

	            @Override
	            public boolean hasNext() {
	                return index != null;
	            }

	            @Override
	            public String next() {

	                if (index == null) throw new NoSuchElementException();

	                for (int i = 1; i < length; ++i) {
	                    char swap = array[i];
	                    System.arraycopy(array, 0, array, 1, i);
	                    array[0] = swap;
	                    for (int j = 1 ; j < i; ++j) {
	                        index[j] = 0;
	                    }
	                    if (++index[i] <= i) {
	                        return  new String(array);
	                     }
	                    index[i] = 0;                    
	                }
	                index = null;
	                return new String(array);
	            }

	           
	        };
	    }
	}





