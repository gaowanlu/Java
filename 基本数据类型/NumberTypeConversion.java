package 基本数据类型;

public class NumberTypeConversion {
    public static void main(String[] args){
        /*
        *数字类型的转换
        *扩展(widening) 缩小(narrowing)
        * byte->short->int->long->float->double
        */
        double var_double=3.4d;
        int var_int=(int)var_double;
        System.out.println(var_int);
        //narrowing一定要注意数据范围，否则造成溢出错误
    }
}
