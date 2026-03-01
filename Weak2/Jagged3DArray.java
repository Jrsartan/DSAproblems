public class Jagged3DArray {
    public static void main(String[] args) {

        // Step 1: declare 3D array (only first dimension)
        int[][][] arr = new int[2][][];

        // Step 2: define second dimension
        arr[0] = new int[2][];
        arr[1] = new int[3][];

        // Step 3: define third dimension (jagged)
        arr[0][0] = new int[3];
        arr[0][1] = new int[2];

        arr[1][0] = new int[1];
        arr[1][1] = new int[4];
        arr[1][2] = new int[2];

        int count = 0;

        // Step 4: store values
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                for(int k = 0; k < arr[i][j].length; k++){
                    arr[i][j][k] = count++;
                }
            }
        }

        // Step 5: print values
        for(int i = 0; i < arr.length; i++){
            System.out.println("Block " + i);
            for(int j = 0; j < arr[i].length; j++){
                for(int k = 0; k < arr[i][j].length; k++){
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
