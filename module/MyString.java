interface A{
    public void show();
}

public class MyString {
    public static void main(String args[]){
        long time=System.currentTimeMillis();
        System.out.println(time);

        // A obj=new A();
        A obj1=new A(){
            public void show(){
                System.out.println("i am anonymous");
            }
        };
        A obj2=()->System.out.println("lambda");
        // obj.show();
        obj1.show();
        obj2.show();
    }    
}
