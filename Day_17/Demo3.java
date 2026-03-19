public class Demo3 {
    public static void main(String[] args) {
        A a = new B();
        a.fun();
    }
}

// Static -->they belong to class and not to object

// class A {
// static void fun() {
// System.out.println("hello");
// }
// }

// class B extends A {
// static void fun() {
// System.out.println("Bye");
// }
// }

// priavate methods can't be overridenj

// class A {
// void fun() {
// System.out.println("hello");
// }

// private void fun2() {
// System.out.println("Hello");
// }
// }

// class B extends A {
// void fun() {
// System.out.println("Bye");
// }

// private void fun2() {
// System.out.println("Hello");
// }
// }

// final methods cannot be overfiden

class A {
    void fun() {
        System.out.println("hello");
    }

    private void fun2() {
        System.out.println("Hello");
    }

    final void fun3() {
        System.out.println("final with function");
    }
}

class B extends A {
    void fun() {
        System.out.println("Bye");
    }

    private void fun2() {
        System.out.println("Hello");
    }

    // final void fun3() {
    //     System.out.println("final with function");
    // }
}