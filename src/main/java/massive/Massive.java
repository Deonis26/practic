package massive;

import java.util.LinkedList;

public class Massive {
    LinkedList<String[][]>massive;
    private int number;
    private char[] numberDivision1;
    public Massive(int number) {
        this.number = number;
        massive=new LinkedList<>();
    }

    public char[] numberDivisionMethod (){
        String numberOfDivision = String.valueOf(number);
        numberDivision1=numberOfDivision.toCharArray();
        return numberDivision1;
    }

    public void methodForImplementingPartitioningAndOutput() {
        for (int i = 0; i < numberDivision1.length; i++) {
            if (numberDivision1[i] == '0') {
                String zero[][] = {{"  ***  "}, {" *   * "}, {"*     *"}, {"*     *"}, {"*     *"}, {" *   * "}, {"  ***  "}};
                massive.add(zero);
            }
            if (numberDivision1[i] == '1') {
                String one[][] = {{" *"}, {"**"}, {" *"}, {" *"}, {" *"}, {" *"}, {" *"}};
                massive.add(one);
            }
            if (numberDivision1[i] == '2') {
                String two[][] = {{" *** "}, {"*   *"}, {"    *"}, {"   * "}, {"  *  "}, {" *   "}, {"*****"}};
                massive.add(two);
            }
            if (numberDivision1[i] == '3') {
                String three[][] = {{"  ***  "}, {" *   * "}, {"    *  "}, {"  **   "}, {"    *  "}, {" *   * "}, {"  ***  "}};
                massive.add(three);
            }
            if (numberDivision1[i] == '4') {
                String four[][] = {{"    *"}, {"   **"}, {"  * *"}, {" ****"}, {"    *"}, {"    *"}, {"    *"}};
                massive.add(four);
            }
            if (numberDivision1[i] == '5') {
                String five[][] = {{"*****"}, {"*    "}, {"*    "}, {"*****"}, {"    *"}, {"    *"}, {"*****"}};
                massive.add(five);
            }
            if (numberDivision1[i] == '6') {
                String six[][] = {{"  ***"}, {" *   "}, {"*    "}, {"*****"}, {"*   *"}, {"*   *"}, {"*****"}};
                massive.add(six);
            }
            if (numberDivision1[i] == '7') {
                String seven[][] = {{"*****"}, {"   * "}, {"  *  "}, {" *   "}, {" *   "}, {" *   "}, {" *   "}};
                massive.add(seven);
            }
            if (numberDivision1[i] == '8') {
                String eight[][] = {{"*****"}, {"*   *"}, {"*   *"}, {"*****"}, {"*   *"}, {"*   *"}, {"*****"}};
                massive.add(eight);
            }
            if (numberDivision1[i] == '9') {
                String nine[][] = {{"*****"}, {"*   *"}, {"*   *"}, {"*****"}, {"    *"}, {"   * "}, {"***  "}};
                massive.add(nine);
            }
        }
    }

    public void print() {
            int rows = 7;
            for (int i = 0; i < rows; i++) {
                for (String[][] numberArray : massive) {
                    System.out.print(numberArray[i][0] + "  ");
                }
                System.out.println();
        }
    }
}



