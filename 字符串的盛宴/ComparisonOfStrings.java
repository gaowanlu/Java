package 字符串的盛宴;

public class ComparisonOfStrings {
    public static void main(){
        //字符串的比较

        //String.equals(otherStringObject)方法
        String me="gaowanlu";
        String he="lihua";
        System.out.println(me.equals(he));//false
        System.out.println(me.equals("gaowanlu"));//true
        //String.equalsIgnoreCase() 方法
        System.out.println("gaownalu".equalsIgnoreCase("lihua"));//true

        //部分字符串的比较
        /*
        endsWith()方法比较后缀是否相同
        startsWith()方法比较前缀是否相同
        regionMatches()方法用来比较目标字符串中是否包含指定字符串
        */
        System.out.println("hjkhjkaaa".endsWith("aaa"));
        System.out.println("aaafdf".startsWith("aaa"));
        System.out.println("dsdspppfdf".regionMatches(4, "ppp",0,3));//true
        System.out.println("dsdspppfdf".regionMatches(0, "ppp",0,3));//false
    }
}
