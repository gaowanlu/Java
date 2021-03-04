package 逻辑运算;
public class TrueOrFalseLogic {
    public static void main(){
        boolean var_boolean_1=true;
        boolean var_boolean_2=false;
        boolean var_boolean_reverse=!var_boolean_1;//取反 !
        System.out.println(var_boolean_2);
        System.out.println(var_boolean_reverse);
        System.out.println(true&true);//逻辑与(或位与) &
        System.out.println(true|false);//逻辑或(或位或) |
        System.out.println(true^false);//逻辑异或 ^
        System.out.println(true&&false);//逻辑与
        System.out.println(false||true);// 逻辑或
    }
}
