public class Challenge1MultiArray{
	public static void main(String[] args) {

 		int myMultiArray[][] = new int [100][30];
   
        for (int[] row : myMultiArray){
        	for(int col : row){ 			
        	System.out.print(col + " ");
        	}
        	System.out.println();
  		}

        for(int i=0;i<myMultiArray.length;i++){
        	for(int j=0;j<myMultiArray[i].length;j++){
        		myMultiArray[i][j] = i + j;
                     myMultiArray[i][j]++;
                     System.out.print(myMultiArray[i][j] + " ");
              }System.out.println(" ");
       }       
       }
 }
        // for(int[] arr1 : myMultiArray){
        // 	for(int arr2 : arr1){
        //        int res = arr2++;
        // 		System.out.print(arr2 + " ");
        // 	}System.out.println(" ");
        // }

    