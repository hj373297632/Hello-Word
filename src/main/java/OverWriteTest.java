/**
 * Created by hujing.huang on 2016/2/25.
 */
public class OverWriteTest extends Person {


    String school="BEI JING SCHOOL";

    OverWriteTest(){
        print("OverWriteTest()");
    }

    public void x(){
        print("x()");

    }

    public String getinfo(){
        return "age:"+age+"\nid:"+id+"\nschool:"+school;
    }

    public void f(){
        super.f();
        int age=200;
        System.out.println(age);
        System.out.println(super.age);
    }






}
