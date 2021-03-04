package 基本数据类型;

public class OperationsAndOperators {
    public static void main(String[]args){
        /*
        * + - * / % ++ -- += -= *= /= %=
        * 用BigDecimal进行精确计算
        */
        System.out.println(3+2);
        System.out.println(3-2);
        System.out.println(3*2);
        System.out.println(3/2);
        System.out.println(3%2);
        int var_int=3;
        var_int++;
        var_int--;
        ++var_int;
        --var_int;
        var_int+=1;
        var_int-=1;
        var_int*=2;
        var_int/=3;
        var_int%=2;
        System.out.println(var_int);
        //深入研究除法运算
        int temp_int=3/2;
        System.out.println(temp_int);// 1
        double temp_double=3/2;
        System.out.println(temp_double);//1.0
        temp_double=3/2.0D;
        System.out.println(temp_double);//1.5

        //BigDecimal类提供了精确的数值计算
        //如计算10/3时，用BigDecimal计算，BigDecimal知道它是一个无限不循环小数
    }
}
