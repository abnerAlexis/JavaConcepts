package concepts;

public class UsingArrays {
    public static void main(String[] args) {
//        createNprintArray();
//        twoDarrayNprint();
        createJaggedArrayNprint();
    }

    private static void createJaggedArrayNprint() {
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[2];
        //Assign values to the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (int)(Math.random() * 10);
            }
        }
        //Print jagged array
        for (int[] n : jaggedArray) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    private static void twoDarrayNprint() {
        int[][] arrayOfArrays = new int[3][4];
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 4; l++) {
                arrayOfArrays[k][l] = (int)(Math.random() * 10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arrayOfArrays[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void createNprintArray() {
        int[] nums = {5, 6, 7};
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + ", ");
            }
        }
        System.out.println();
    }
}
