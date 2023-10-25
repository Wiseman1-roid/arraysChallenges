public class Challenge3Arrays{
	public static void main(String[] args) {
		

		int [] myArray = new int[50];
		int i = 0;

		while(i< myArray.length){			
			System.out.println("value "+ i + "= "+ myArray[i]);
			i++;
			}

		int incremented = 0;
		// System.out.print("Elements = [");

		outer : while(incremented<myArray.length){
			myArray[incremented]++;
		
		switch(myArray[incremented]){
			case 22:
				System.out.print(" In case 22 ");
				
			 case 44:
				System.out.print(myArray[incremented] + " ");
				break;
		}
			} 
	}
}