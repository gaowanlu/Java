package 玩转循环;

public class Cycle {
    public static void main(){
        /*
        Java与其他编程语言一样
        提供个三种基本循环方式
        @1 - while
        @2 - do while
        @3 - for
        */
        int flag=10;
        
        //while循环
        while(flag>0){
            System.out.println(flag);
            flag--;
        }
        flag=10;
        
        //do while 循环
        do{
            System.out.println(flag--);
        }while(flag>0);
        
        //for循环
        for(flag=10;flag>0;flag--){
            System.out.println(flag);
        }
    }
}
