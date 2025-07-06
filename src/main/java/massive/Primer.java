package massive;

public class Primer {
    public static void main(String[] args) {
        int[][] array1 = {
                {1, 2, 3,0},
                {4, 5, 6,0}
        };

        int[][] array2 = {
                {7, 8},
                {9, 10}
        };
        int dlinna=array1[0].length+array2[0].length;
        int vusot=array1.length;
        int k=0;
        int[][] mergedArray = new int[vusot][dlinna];
        for (int i = 0; i <vusot ; i++) {
            for (int j = 0; j <dlinna; j++) {
                if(array1[0].length>j){
                    mergedArray[i][j]=array1[i][j];
                    k=0;
                } else {
                    mergedArray[i][j]=array2[i][k];
                    k++;
                }


            }
        }

        for (int i = 0; i < mergedArray.length; i++) {
            for (int j = 0; j < mergedArray[i].length; j++) {
                System.out.print(mergedArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(array1[0].length);
        System.out.println(array2[0].length);
    }
}
