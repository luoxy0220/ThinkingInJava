import static util.Print.print;

/**
 * @Date: 2023/11/3 11:09
 * @Author: Sean Luo
 * @Description: It only looks like you can override
 * a private or private final method
 */
class WithFinals {
    // Identical to "private" alone
    private final void f() {
        print("WithFinals.f()");
    }

    // Also automatically "final"
    private void g() {
        print("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        print("OverridingPrivate.f()");
    }

    private void g() {
        print("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        print("OverridingPrivate2.f()");
    }

    public void g() {
        print("OverridingPrivate2.g()");
    }
}

public class FinalOverridingIllusion extends WithFinals {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        // You can upcast
        OverridingPrivate op = op2;
        // But you can't call the methods
//        op.f();
//        op.g();
        // Same here
        WithFinals wf = op2;
//        wf.f();
//        wf.g();
    }
}
