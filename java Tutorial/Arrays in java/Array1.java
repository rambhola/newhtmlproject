class Array1 {

    public static void main(String[] args) {
        {

            int[] arr;
            arr = new int[] { 10, 20, 30, 40 };
            int value = arr[2];
            System.out.println(value);

            String[] name = { "Ashish", "Shyam", "Kundan" };
            System.out.println(name[1]);
            System.out.println(name.length);
            for (int i = 0; i < name.length; i++) {

                System.out.println("Elements at index " + i + " " + name[i]);

            }

            // Multidimention Array

         
              int[][] arr2 = {{4,5,6,67},
              {56,78,90,78},
              {23,21,27,90}};
              System.out.println(arr2[1][1]);
             for ( int i = 0; i < 2; i++ ){

                for(int j=0; j>3;j++){
                    System.out.println(arr2[i][j]);
                }

               for( int i = 0; i < arr2.length;i++){
                for(int j = 0; j< arr2[i].length;j++){
                 System.out.println(arr2[i][j]);

                }
                System.out.println();

               }
             

        }

    }

}