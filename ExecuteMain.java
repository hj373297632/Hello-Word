package com.quanr;

/**
 * Created by hujing.huang on 2016/2/25.
 */

class Cat{
    int color,weight,height;

    Cat(int color,int weight,int height){
        this.color=color;
        this.weight=weight;
        this.height=height;
    }

    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }else {
            if (obj instanceof Cat){
                Cat c=(Cat)obj;
                if (c.color == this.color && c.weight == this.weight && c.height == this.height)
                    return true;
            }
        }
        return false;
    }
}


public class ExecuteMain {

    public static void main(String[] args){
        OverWriteTest a=new OverWriteTest();
/*        System.out.println(a.getinfo());
        a.f();*/
        a.x();

        Cat c1=new Cat(1,2,3);
        Cat c2=new Cat(1,2,3);
        String s1=new String("hello");
        String s2=new String("hello");
        System.out.println(c1==c2);
        System.out.println(c1.equals(c2));

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        GoldenMonkey k1=new GoldenMonkey();
        System.out.println(k1.getMoney());


    }


}
