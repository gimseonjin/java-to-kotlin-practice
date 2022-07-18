package ch2.extend_example.java;

public interface JavaSwimmable {
    default void act(){
        System.out.println("어푸어푸");
    }
}
