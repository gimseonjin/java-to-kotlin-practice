package ch2.extend_example.java;

public interface JavaFlyable {
    default void act(){
        System.out.println("파닥파닥");
    }
}
