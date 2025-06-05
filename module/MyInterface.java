interface A{
    void show();
    void display();
}

interface B{
    void show();
}

class C implements A,B{

    @Override
    public void show() {
    }

    @Override
    public void display() {
        System.out.println("display");
    }
    
}

public class MyInterface {
    public static void main(String args[]){
        C c = new C();
        c.display();
    }
}
