package 字符串的盛宴;

import java.util.Arrays;

public class SplittingAString {
    public static void main(){
        /*
        单刃斧: String.subString(index)    范围[index,~]
        双刃斧: String.subString(start,end)  范围[index,after)
        剥离机: String.split()    返回字符串数组 String concat=Arrays.toString(String);
        */
        String name="gaowanlu";
        System.out.println(name.substring(3));// wanlu 
        System.out.println(name.substring(3,6));// wan
        String testString="gaoawanalu";
        String[] stringArray=testString.split("a");
        System.out.println(Arrays.toString(stringArray));//[g, o, w, n, lu]
    }
}
