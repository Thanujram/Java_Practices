package Interview;

public class Mutation {

    public static void main(String[] args){

        int[] ar1 = new int[]{1,5,9,3,6,2,4,7,8,0,-1};

        findAddition(ar1,6);

    }
    static void findAddition(int[] ar,int z){

        int len = ar.length;
        for(int i = 0; i<len-1; i++){
            if(ar[i]<z){
                for(int j = i+1; j<len; j++){
                    if(ar[j]<z){
                        if(ar[i]+ar[j]==z){
                            System.out.println(ar[i]+","+ar[j]+"="+z);
                        }
                    }
                }
            }
        }

    }
}
