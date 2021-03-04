package 玩转循环;

public class CyclicInterrupt {
    public static void main(){
        /*
        @1 - break
        @2 - continue
        @3 - goto（永远不适用goto）
        */
        //这是现代高级语言的，基础
        
        //continue
        int flag=10;
        for(flag=10;flag>0;flag--){
            if(flag==5){
                continue;
            }
            System.out.println(flag);
        }

        //break
        flag=10;
        while(flag>0){
            if(flag==4){
                break;
            }
            System.out.println(flag--);
        }

        //goto关键字是老版本的残留，我们不用它，不必了解
        //在C C++中可以使用，但我们用该不适用
    }
}
