public class Challenge1Arrays{
	public static void main(String[] args) {
		

		int [] myArray = new int[50];

		for(int i = 0;i< myArray.length;i++){
			System.out.println("value "+ i + "= "+ myArray[i]);
			}

		System.out.print("Elements = [");

		for(int i=0;i<myArray.length;i++){
			myArray[i] = i+1;
			System.out.print(myArray[i]+ ",");
		}
		System.out.print("]");
	}
}