package DataStructures.Array;

public class Traversal {
    public static void main(String[] args){

        /* 1D array

        //Initialiser
        int[] ar1 = new int[]{10,20,30,40,50};

        //accessing
        System.out.println(ar1[2]);

        for(int i=0; i<ar1.length; i++){
            System.out.println(ar1[i]);
        }*/

        // 2D array
        int[][] ar2 = {{11,12,13,14,15},{21,22,23,24},{31,32,33,34,35,36}};

        //System.out.println(ar2.length);
        //System.out.println(ar2[0].length);

        /*System.out.println(ar2[1][2]);

        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(ar2[i][j] + " ");
            }
            System.out.print("\n");
        }*/

        for(int i=0; i<ar2.length; i++){
            for (int j=0; j<ar2[i].length; j++){
                System.out.print(ar2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
