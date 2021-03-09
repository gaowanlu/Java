package 对象;
public class ClassMethod{
    /*面向对象四大特性
     * 继承 封装 抽象 多态 
     * */

    /*定义方法
     *public     static   void           name(){}
     *    方法修饰符     方法返回值类型  方法名称
     * */
    /*调用外部的静态方法时可以省略其类名称的书写
     * */
    public static void main(){
        showAge();
    }
    public static void showAge(){
        System.out.println("19 years old");
    }

    //方法的注释
    /*      这个方法仅仅用于测试
     * @param age       参数一
     * @param height    参数二
     * @return          void
     * */
    public static void num(int age,float height){
        
    }

    //静态方法属于类,属于对象本体
    int private_age;//默认为私有属性
    public int age;//定义属性
} 
