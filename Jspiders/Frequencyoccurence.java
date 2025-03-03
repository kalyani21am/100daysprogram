package org;

public class Frequencyoccurence {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 1, 2, 4, 5}; // Input array
	        int[] visited = new int[arr.length]; // To track counted elements
	        int visitedFlag = -1; // Marker for already counted elements

	        System.out.println("Element | Frequency");
	        for (int i = 0; i < arr.length; i++) {
	            if (visited[i] == visitedFlag) {
	                continue; // Skip already counted elements
	            }
	            
	            int count = 1; // Initialize count for current element
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                    visited[j] = visitedFlag; // Mark as counted
	                }
	            }
	            
	            System.out.println("   " + arr[i] + "    |    " + count);
	        }
	    }
	}
