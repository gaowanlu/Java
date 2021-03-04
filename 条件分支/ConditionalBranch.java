package 条件分支;

public class ConditionalBranch {
    public static void main(){
        //if else 语句
        if(true){
            if(true){

            }else{

            }
        }else if(true){
            if(true){

            }
        }else{
            if(true){
                if(true){

                }
            }
        }
        //三目运算符
        String var_str=4>3?"4>3":"4<=3";
        System.out.println(var_str);
        //switch case语句
        int var_int=2;
        switch(var_int){
            case 1:System.out.println(1);break;
            case 2:System.out.println(2);break;
            default:System.out.println("NULL");
        }
    }
}
