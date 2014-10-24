public class Array{
    /* Took >20 minutes... because that's how long it took me to realize that nums was the name of the array, sigh */
    public int[] frontPiece(int[] nums) {
	int[] answer = new int[2];
	if (nums.length < 2){
	    answer = nums;
	} else{
	    for (int i=0; i<2; i++){
		answer[i] = nums[i];
	    }
	}
	/* In terminal, prints out [I@118aeabe or something like that
	   return answer;
	   
	   Sorry, I did this:*/
	System.out.println("{"+answer[0]+", "+answer[1]+"}");
	return answer;
    }   
    
    /* 10 min */
    public int sum13(int[] nums) {
	int answer = 0;
	for (int i=0; i<nums.length; i++){
	    if(nums[i] != 13){
		if(i == 0){
		    answer += nums[i];
		} else if (nums[i-1] != 13){
		    answer += nums[i];
		}
	    }
	}
	return answer;
    }
}
