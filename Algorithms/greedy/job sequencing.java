import java.util.*;
/*
 output:  Following is maximum profit sequence of jobs 
c a e 

*/
class Job
{ 
	char id;
	int deadline, profit;

	// Constructors
	public Job() {}

	public Job(char id, int deadline, int profit)
	{
		this.id = id;
		this.deadline = deadline;
		this.profit = profit;
	}

 
	void printJobScheduling(ArrayList<Job> arr, int t)
	{
		// Length of array
		int n = arr.size();

		// Sort all jobs according to
		// decreasing order of profit
		Collections.sort(arr,
						(a, b) -> b.profit - a.profit);

		// To keep track of free time slots
		System.out.println(arr.get(0).profit);
		boolean result[] = new boolean[t];

		// To store result (Sequence of jobs)
		char job[] = new char[t];

		// Iterate through all given jobs
		for (int i = 0; i < n; i++)
		{
			 
			for (int j= Math.min(t - 1, arr.get(i).deadline - 1);	j >= 0; j--) {
System.out.println(i+"---"+j);
				// Free slot found
				if (result[j] == false)
				{
					result[j] = true;
					job[j] = arr.get(i).id;
					break;
				}
			}
		}

		// Print the sequence
		for (char jb : job)
		{
			System.out.print(jb + " ");
		}
		System.out.println();
	}

	// Driver code
	public static void main(String args[])
	{
		ArrayList<Job> arr = new ArrayList<Job>();

		arr.add(new Job('a', 2, 100));
		arr.add(new Job('b', 1, 19));
		arr.add(new Job('c', 2, 27));
		arr.add(new Job('d', 1, 25));
		arr.add(new Job('e', 3, 15));
	
		// Function call
		System.out.println("Following is maximum "
						+ "profit sequence of jobs");

		Job job = new Job();

		// Calling function
		job.printJobScheduling(arr, 4);
	}
}
