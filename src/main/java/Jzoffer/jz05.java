package Jzoffer;
//替换空格
public class jz05 {
    public static String replaceSpace(String s) {
        // write code here
        if(s.length()==0||s.equals(null))
            return "";
        s=s.replaceAll(" ","%20");
        return s;
    }

    public static void main(String[] args) {
       System.out.print(" ".replaceAll(" ","%20"));
    }
}
