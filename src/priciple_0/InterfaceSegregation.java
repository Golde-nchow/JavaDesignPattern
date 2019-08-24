package priciple_0;

/**
 * 2019/8/24 :
 * 接口隔离原则
 *
 * 介绍: 一个类对另一个类的依赖性应当是建立在最小的接口上。
 *       一个接口不应当被多个角色使用，然后组成一个臃肿的接口类。
 *       而且，不要强迫用户使用他们不需要的方法，否则，用户的实现可能就会因为这些无用的方法而进行改变。
 *
 * 例子：传统方法，一个接口有很多个方法，然后一个类实现了这个接口，其他类引用这个实现了全部方法的类。
 *      隔离原则方法：
 *      一个类需要什么方法就实现什么接口，虽然会拆分成很多个接口，但是代码不会受影响。
 *
 * 下面的例子：C、D实现了该接口
 *            A 依赖 接口的 1、2、3 方法
 *            B 依赖 接口的 1、4、5 方法
 *
 * @author User : Golden_chow
 */
public class InterfaceSegregation {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.depend1(c);
        a.depend2(c);
        a.depend3(c);

        b.depend1(d);
        b.depend4(d);
        b.depend5(d);
    }
}

interface Interface1 {
    void method1();
}

interface Interface2 {

    void method2();

    void method3();
}

interface Interface3 {

    void method4();

    void method5();
}

class C implements Interface1, Interface2 {

    @Override
    public void method1() {
        System.out.println("C 实现的1方法");
    }

    @Override
    public void method2() {
        System.out.println("C 实现的2方法");
    }

    @Override
    public void method3() {
        System.out.println("C 实现的3方法");
    }
}

class D implements Interface1, Interface3 {

    @Override
    public void method4() {
        System.out.println("B 实现的4方法");
    }

    @Override
    public void method5() {
        System.out.println("B 实现的5方法");
    }

    @Override
    public void method1() {
        System.out.println("B 实现的1方法");
    }
}

class A {

    // A 依赖 接口的方法
    void depend1(Interface1 i) {
        i.method1();
    }

    void depend2(Interface2 i) {
        i.method2();
    }

    void depend3(Interface2 i) {
        i.method3();
    }
}

class B {

    void depend1(Interface1 i) {
        i.method1();
    }

    void depend4(Interface3 i) {
        i.method4();
    }

    void depend5(Interface3 i) {
        i.method5();
    }

}