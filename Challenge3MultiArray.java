public class Challenge3MultiArray{
	public static void main(String[] args) {

                int myMultiArray[][] = new int [100][30];
   
        for (int[] row : myMultiArray){
                for(int col : row){                     
                System.out.print(col + " ");
                }
                System.out.println();
                }
                int i=0;
                
        while(i<myMultiArray.length){
                int j=0;
                while(j<myMultiArray[i].length){
                        myMultiArray[i][j] = i + j;
                int result = myMultiArray[i][j] + 1; 

                switch(result){
                case 22: case 44: case 66: case 88: case 110:
                System.out.print(result + " ");
            }
         j++;
         }
         i++;
        }
 	
    }
}

















// int myMultiArray[][] = new int [4][4];
        // int i = 0, j=0;
        
        // while(i<myMultiArray.length){
        //         j=0;
        //         while(j<myMultiArray[i].length){
        //                 System.out.print(myMultiArray[i][j] + " ");
        //                 j++;
        //         }
        //         System.out.println();
        //         i++;
        // }

        // while(i<myMultiArray.length){
        //         j=0;
        //         i=0;
        //         myMultiArray[i][j]= i + j;
        //         j++;
        //         i++;
        // }

        // int arr1=0, arr2=0;
        // while(arr1<myMultiArray.length){
        //         arr2=0;
        //         int num = myMultiArray[arr1][arr2] + 1;
        //         while(arr2<myMultiArray[arr1].length){
        //                 System.out.print(num + " ");

        //                 switch(num){
        //                     case 22:case 44:case 66: case 88: case 110:
        //                     System.out.println(myMultiArray[arr1]);    
        //                 }
        //                 num++;
        //                 arr2++;
        //         }
        //         System.out.println();
        //         arr1++;
        // }