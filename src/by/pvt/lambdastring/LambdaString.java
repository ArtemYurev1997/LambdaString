package by.pvt.lambdastring;

public class LambdaString {
    public static void main(String[] args) {
        StrInterface strInterface = (str) -> {
            String t = " ";
            String all = " ";
            if (str.length() > 5) {
                t = str.substring(5);
                all = result(t);
            }
            else {
                all = result(str);
            }
            return all;
        };
        System.out.println(strInterface.text("This text is not found"));


        StrInterface strInterface1 = (str) -> {
            String result = " ";
            for(int i = 0; i < str.length(); i++) {
                result = str.toUpperCase();
            }
            return result;
        };
        System.out.println(strInterface1.text("This text is not found"));
    }

    static String result(String str) {
        String result = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
