import java.util.HashMap;

//this project prints the count of absolute values
//example: for array {-1,0,1,2,-2} the count will be 3
public class AbsoluteCount {
	
	public static void main(String[] args)
	{
		System.out.println(solution(new int[]{-5, -3, -1, 0, 3, 6}));
		System.out.println(solution(new int[]{-5, -3, -1, -5, -3, -1, 0, 3, 6}));
		System.out.println(solution(new int[]{2,3,4,2,2,2}));
		System.out.println(solution(new int[]{2,3,4,-2,-3,2}));
		System.out.println(solution(new int[]{-1,0,1,2,-2}));
	}
	
	public static int solution(int[] A) {
        int count = A.length;

        HashMap<Integer, Boolean> seen = new HashMap<Integer, Boolean>();
        for (int i = 0; i < A.length; i++)
        {
        		//if an element has already been encountered, skip it
        		Integer key = Math.abs(A[i]);
        		if (seen.get(key) == null)
        		{
        			seen.put(key, new Boolean(true));
        		}
        		else if (seen.get(key) == false)
        		{
        			seen.put(key, new Boolean(true));
        		}
        		else
        			count--;
        }
        return count;
    }
}
