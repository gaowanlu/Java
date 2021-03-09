package 字符串的盛宴;

public class DefinitionOfAString {
    public static void main(){
        /*
        字符串不是基本数据类型
        像C++类似，字符串是一个class 字符串实体就是 String Object
        Java 字符串时引用类型变量
        */

        //定义一个字符串
        
        //存储空间消耗者
        String beispiel=new String("Ba la! Ba la!");
        System.out.println(beispiel);
        //Java自动回收字符串内存的机制为 字符串池(String-pool)

        //环保主义者
        String var_string="HELLO WORLD";
        System.out.println(var_string);
        //这样内存管理，是java的整体的内存管理，而不是Stirng-pool

        //类C字符串
        char[] c_style_stirng={'g','a','o','w','a','n','l','u'};
        //类C字符串转String
        String java_style_string=new String(c_style_stirng);
        System.out.println(java_style_string);

        //字符串的拼接
        String concat_string="hello ";
        concat_string+="world";
        System.out.println(concat_string);
    }
}
