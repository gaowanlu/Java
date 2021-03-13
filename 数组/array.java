package 数组;
public class array{
    public static void main(){
        //首选创建数组方法
        int[] array_int=new int[10];
        //类C,,方式创建
        float[] array_float ={1f,2f,3f,4f,5f,6f,7f,8f,9f,10f};
        for(int i=0;i<10;i++){
            array_int[i]=i+89;
        }
        for(int i=0;i<10;i++){
            System.out.println(array_int[i]);
            System.out.println(array_float[i]);
        }
        //For-Each循环
        for(int i:array_int){
            System.out.println(i);
        }
        //其中i是引用
        
        //数组可以作为返回值
        //因为创建数组是使用new来创建的,只要还有变量是它的引用
        //那么内存就不会释放

        //多维数组
        int [][] int_map=new int[10][10];
        
        //还可以使得每个行的列数不同
        //let me show you
        int [][] temp_int=new int[10][];
        temp_int[0]=new int[34];
        temp_int[1]=new int[100];
        //这是完全可行的
        

        /*
         Arrays类
        java.until.Arrays
        
         二分查找
        Arrays.binarySearch(Object[]a,Object key)
        public static int binarySearch(Object[] a, Object key)
        
         数组比较
         public static boolean equals(long[] a, long[] a2)
        
         统一赋值
         public static void fill(int[] a, int val)
         
         排序
         public static void sort(Object[] a)
         对指定对象数组根据其元素的自然顺序进行升序排列同样的方法适用于所有的其他基本数据类型ByteshortInt等
        
        */

    }
}
