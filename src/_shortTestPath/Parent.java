package _shortTestPath;

public class Parent {
    static {
        System.out.println("parent static");
    }
    public Parent() {
        System.out.println("parent constructor");
    }
}


class Child extends Parent {
    static {
        System.out.println("Child static");
    }

    public Child() {
        System.out.println("Child constructor");
    }
}


