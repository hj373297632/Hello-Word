/**
 * Created by hujing.huang on 2016/2/23.
 */
public class Person {

    int id=0;
    int age=20;

    Person(){
        print("Person()");
    }
    protected  void print(String a){
        System.out.println("+++"+a);
    }
    public void x(){
        print("x()");

    }

    Person(int _id){
        id =_id;
        age=30;
    }

    Person(int _id ,int _age){
        id=_id;
        age=_age;

    }

    public String getinfo(){
        return "aget:"+age+"\nid:"+id;
    }

    public void f(){
        System.out.println(age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
