package 封装;
public class ClassMethod{
    /*面向对象四大特性
     * 继承 封装 抽象 多态 
     * */
    
    //构造函数与C++语法规则差不多
    public ClassMethod(){
        //to do
    }

    //析构函数与C++有点不一样
    //重写finalize方法
    @Override
    protected void finalize(){
       System.out.println("析构函数调用");
    }

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
    

    //final关键词，表示变量声明后不能被改变，即为常量
    public static final int finalVar=123456;

    //封装get and set
    public int set_private_age(int private_age){
        this.private_age=private_age;
        return this.private_age;
    }
    public int get_private_age(){
        return this.private_age;
    }

    //public protected 不加修饰符 private
    /*访问修饰符        同一类的成员      同一包的其他类   同一包的子类    不同包的子类    不同包的非子类
     *public                yes              yes              yes              yes              yes
     *protected             yes              yes              yes              yes                no
     *不加修饰符            yes              yes              yes              no                no
     *private               yes               no               no              no                no
     */

    //@Override toString()
    //@Override
    public String toStirng(){
        return "blank space";
    }

    //流畅接口
    private String color;
    public ClassMethod setColor(String color){
        this.color=color;
        return this;
    }
    public String getColor(){
        return this.color;
    }
    //流畅的接口可以这样使用,object.setColor("hello").getColor();
    //有点链式的感觉


    //垃圾回收机制garbage collection
    /*在Java中有自动垃圾回收机制
     * 我们的变量定义在堆,方法调用使用栈,二者空间都是有限的
     * */
    
    //了解堆和栈
} 
