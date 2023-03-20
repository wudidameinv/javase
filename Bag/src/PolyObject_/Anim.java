package PolyObject_;

public class Anim {
    private String anim;
    private String food;

    public Anim(String anim, String food) {
        this.anim = anim;
        this.food = food;
    }

    public String getAnim() {
        return anim;
    }

    public void setAnim(String anim) {
        this.anim = anim;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
//animal类 有 name 构造器 get set

//dog cat 继承 animal 得到名字
//构造器 因为默认构造器被覆盖 所以需要super 继承父类构造器
// public Dog(String name){
// super(name);}

//master 得到主人名字 构造器 get set

//food 得到 food 名字 子类继承父类得到名字 方法同上 super

//主人里 主方法 feed public void feed(anminal anmimal,food food); sout

// new 主人ms
//new cat
//new fish
//mas.feed(cat,fish);


