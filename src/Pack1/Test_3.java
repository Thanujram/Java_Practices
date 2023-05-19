package Pack1;

public class Test_3 {

    public static String simplify(String input) {

        try{
            //String outString = new String("");
            String outString = null;
            for(int i=0; i<input.length(); i++){
                //System.out.println(input.charAt(i));
                for(int j=0; j<input.length(); j++){
                    if(input.charAt(i) != outString.charAt(j));{
                        outString = outString + input.charAt(i);
                    }
                }
            }
            return outString;
        }
        catch(Exception e){
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
    }

    public static void main(String[] args) {
        System.out.println(Test_3.simplify("ghhrkkb"));
    }
}



/*
public class WheelDefects {

}*/
