package codingTestday12;

public class PersonAge   
{  
	public static void main(String[] args)  
	{  
		int age[]={34,78,56,7,12,67,20,50};
		int children = 0;
		int adult = 0;
		int citizen = 0;
		for (int i = 1; i< age.length; i++) {
			if(age[i] < 18) {
				children++;
			}
			else if (age[i] >= 18 ) {
				adult++;
			}
			else if (age[i] >= 55 ) {
				citizen++;
			}
		}


		System.out.println("Children Count = " + children);
		System.out.println("Adult Count = " + adult);
		System.out.println("Citizen Count = " + citizen);
	}}