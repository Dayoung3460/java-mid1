package object;

// 부모가 없으면 묵시적으로 Object 클래스 상속받음
public class Parent extends Object{
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
