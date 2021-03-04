package 字符串的盛宴;

public class StringOperation {
    public static void main(){
    //字符串的运算，字符串与数字相加会把数字作为字符串常量处理
    String name="wefdf"+234;
    System.out.println(name);
    name=(343+432)+"op";
    System.out.println(name);
    name="fd"+(9+7)+"kl";
    System.out.println(name);
    
    //toUpperCase() 方法
    String testString="gaownalufd232";
    testString=testString.toUpperCase();
    System.out.println(testString);//GAOWNALUFD232

    //toLowerCase() 方法
    testString=testString.toLowerCase();
    System.out.println(testString);//gaownalufd232
		/********* End *********/
    }
}
