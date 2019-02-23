package com.bigtalk.decorate;

/**
 * Created by GanShu on 2018/9/21 0021.
 */
public class DecorateMode {

    public static void main(String[] args) {
        Person xc = new Person("小菜");

        System.out.println("\n第一种装扮：");

        Sneakers pqx = new Sneakers();
        BigTrouser kk = new BigTrouser();
        TShirts dtx = new TShirts();

        pqx.Decorate(xc);
        kk.Decorate(pqx);
        dtx.Decorate(kk);
        dtx.Show();

        System.out.println("\n第二种装扮：");

        LeatherShoes px = new LeatherShoes();
        Tie ld = new Tie();
        Suit xz = new Suit();

        px.Decorate(xc);
        ld.Decorate(px);
        xz.Decorate(ld);
        xz.Show();

        System.out.println("\n第三种装扮：");
        Sneakers pqx2 = new Sneakers();
        LeatherShoes px2 = new LeatherShoes();
        BigTrouser kk2 = new BigTrouser();
        Tie ld2 = new Tie();

        pqx2.Decorate(xc);
        px2.Decorate(pqx);
        kk2.Decorate(px2);
        ld2.Decorate(kk2);

        ld2.Show();

//        Console.Read();
    }
}

class Person {
    public Person() {
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void Show() {
        System.out.println("装扮的" + name);
    }
}

class Finery extends Person {

    protected Person component;

    //打扮
    public void Decorate(Person component) {
        this.component = component;
    }

    @Override
    public void Show() {
        if (component != null) {
            component.Show();
        }
    }
}


class TShirts extends Finery {
    @Override
    public void Show() {
        System.out.println("大T恤 ");
        super.Show();
    }
}

class BigTrouser extends Finery {
    @Override
    public void Show() {
        System.out.println("垮裤 ");
        super.Show();
    }
}

class Sneakers extends Finery {
    @Override
    public void Show() {
        System.out.println("破球鞋 ");
        super.Show();
    }
}

class Suit extends Finery {
    @Override
    public void Show() {
        System.out.println("西装 ");
        super.Show();
    }
}

class Tie extends Finery {
    @Override
    public void Show() {
        System.out.println("领带 ");
        super.Show();
    }
}

class LeatherShoes extends Finery {
    @Override
    public void Show() {
        System.out.println("皮鞋 ");
        super.Show();
    }
}


