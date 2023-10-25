public class Challenge2MultiArray{
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
                int result = myMultiArray[i][j] + 1;       
                if(result % 2==0 && result %11 ==0){
                System.out.print(result + " ");
                System.out.print(" ");
            }
        	}
         }      
    }
}
//     public class Challenge2MultiArray{
//     public static void main(String[] args) {

//         int myMultiArray[][] = new int [100][30];
   
//         for (int[] row : myMultiArray){
//             for(int col : row){             
//             System.out.print(col + " ");
//             }
//             System.out.println();
//         }

//         for(int i=0;i<myMultiArray.length;i++){
//             for(int j=0;j<myMultiArray[i].length;j++){
//                 myMultiArray[i][j] = i + j;
//             }
//         }
//         for(int[] arr1 : myMultiArray){
//             for(int arr2 : arr1){

//                 if(arr2<100){
//                 if(arr2 % 2==0 && arr2 % 11 ==0){
//                     System.out.print(arr2 + " ");
//                 }
//             }
//             }System.out.print(" ");
//         }

//     }
// }
