package 包装类;

public class WrapperClass {
    public static void main(){
        /*
        基本数据类    包装类
        byte         Byte
        short        Short
        char         Character
        int          Integer
        long         Long
        float        Float
        double       Double
        boolean      Boolean
        */
        Integer var=new Integer(67);//@1
        Integer zahl=Integer.valueOf(56);//@2
        System.out.println(var);
        System.out.println(zahl);
        //使用@2比较快
        Integer stringToInt=new Integer("678");//字符串转数字
        System.out.println(stringToInt);
        //********注意********
        //Character包装类没有parseChar()方法，不能把一个字符串转类型直接地换成char类型，同理valueOf()也不行。
        //包装类与基本数据类型类转换方式

        /* *****转换图(以整型为例，其他类似)*****
                Integer.valueOf()
        String-------------------->Integer
            |                      / \  |
            |                       |   |
            |                       |   |
            |      Integer.valueOf()|   |
            |       自动打包         |   |intValue();拆包
            |                       |   |
            |                       |   |
            |   Integer.parseInt()     \ /
            |--------------------->int
        */
        Integer var_integer=Integer.valueOf("12345");
        int var_int=var_integer.intValue();//拆包
        var_int=Integer.parseInt("1234");
        var_integer=Integer.valueOf(var_int);//自动打包

        //关于MIN_VALUE MAX_VALUE
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        //Character常用
        /*
        @1-Character.isLetter() 检测字符是否位字母
        @2-Character.isUpperCase() 检测是否为大写字母
        @3-Character.isLowerCase() 检测字符是否为小写 
        */
    }
}
