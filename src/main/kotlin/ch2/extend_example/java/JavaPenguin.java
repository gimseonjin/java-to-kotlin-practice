package ch2.extend_example.java;

public class JavaPenguin extends JavaAnimal implements JavaFlyable, JavaSwimmable{
    private int wings;

    public JavaPenguin(String speices){
        super(speices,2);
        this.wings = 2;
    }

    @Override
    public void act(){
        JavaFlyable.super.act();
        JavaSwimmable.super.act();
    }


    @Override
    public void move() {
        System.out.println("펭귄이 날아갑니다.");
    }

    @Override
    public int getLegs() {
        return super.getLegs() + this.wings;
    }
}
