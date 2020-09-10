import java.util.*;

public class TwoSum
{
	public static int[] TwoSum(int[] sum, int target)
	{
		//using hashmap algorithm for key pairing
		Map<Integer, Integer> map = new HashMap<>();

		//loop through arrary
		for (int i = 0; i < sum.length; i++)
		{
			//value that is needed to get the target number
			int difference = target - sum[i]; 

			//compares each number to see if difference is in array
			if (map.containsKey(difference))
			{
				//is difference equal to the value i in the array
				if (difference == sum[i])
				{
					//returns -1 if number is used twice
					return new int[] {-1};
				}
				//if difference = i value is returned
				return new int[] {map.get(difference), i};
			}
			else
			{
				//values is put with specific key in map
				map.put(sum[i], i);
			}
		}
		//if nothing is found
		return new int[] {};
	}

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		//asks user for number of values in array
		System.out.println("How many numbers would you like in your array? ");
		
		//stores input and creates array based on user input of numbers in array
		int x = scan.nextInt();
		int[] sum = new int[x];

		//asks user for amount of numbers specified in previous question
		System.out.println("Please enter an array of numbers separated by a space: ");
		
		//stores numbers to previously initialized array
		for (int i = 0; i < x; i++)
		{
			sum[i] = scan.nextInt();
		}

		//asks user for target number
		System.out.println("Please enter a target number: ");
		int target = scan.nextInt();

		//call TwoSum method to solve
		int[] nums = TwoSum(sum, target);

		//checks that array has at least 2 numbers - and displays them
		if (nums.length == 2)
		{
			System.out.println("[" + nums[0] + ", " + nums[1] + "]");
		}

		//no solution found, returns -1 as per instructions
		else
		{
			System.out.println("-1");
		}
	}
}