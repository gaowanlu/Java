package 字符串池;

public class CreateString{
    public static void main(){
        //定义字符串避免使用new调用构造函数
        String my_name="gaowanlu";//yes
        //String my_name=new String("gaowanlu");//no
        
        /*变量 堆 池
        * String对象直接赋值会将字符串存放于字符串池中
        * 如果两个String对象的内容相同,则两个对象的字符串占用一个空间
        * 即二者指向同一个实体
        *
        * 如果使用new 调用构造函数则会申请内存空间将字符串存储于堆
        */

        /*用堆存储的字符串具有intern()方法
        * 在堆内赋值一个,将复制的丢到字符串池,二者有相同的引用
        * 然后返回那个引用
        */
        String stack_string=new String("gaowanlu");
        String my_name_=stack_string.intern();
        System.out.println(my_name);//"gaowanlu"

        /*这是一个非常令人头疼的问题,总之尽量避免使用构造函数来定义字符串
         * */
        
        //两个字符串对象的比较需要使用其方法来判断,如果直接使用 == 则比较的使二者的hashcode(即java虚拟机内存地址)
        
        //如果我们用 = 定义两个字符串,且这两个字符串内容相同,则二者有相同的hashcode
        //当我们改变某一个时就会再创建一个新的实体到字符串池
        

        //          StringBuilder类 与 StringBuffer类
        //StringBuilder 删除方法delete(start_index,end_index)
        StringBuilder delete_string=new StringBuilder("hello world");
        delete_string.delete(2,5);
        System.out.println(delete_string);//"he world"
        //StringBuilder删除单个字符deleteCharAt()
        delete_string.deleteCharAt(0);
        //StringBuilder取代字符串replace
        delete_string.replace(0,1,"G");
        //StringBuilderz返回反转字符串方法reverse()
        System.out.println(delete_string.reverse());//dlrow G


    }
}
