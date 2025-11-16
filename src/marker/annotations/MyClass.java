package marker.annotations;

import java.lang.reflect.Method;

public class MyClass {
    @MyCustomAnnotation(value = 10)
    public void sayHello() {
        System.out.println("my custom annotation");
    }

    public static void main(String[] args) throws Exception{
          MyClass h = new MyClass();
          Method methodV = h.getClass().getMethod("sayHello");

          MyCustomAnnotation myCustomAnnotation = methodV.getAnnotation(MyCustomAnnotation.class);
        System.out.println("value is:" + myCustomAnnotation.value());

    }
}
