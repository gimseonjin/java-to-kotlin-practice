package ch2;

public class JavaUser {
    private final String name;
    private int age;

    public JavaUser(String name, int age) {
        if(age <= 0)
            throw new IllegalArgumentException("나이는 0살 이상이어야 합니다.");
        this.name = name;
        this.age = age;
    }

    public JavaUser(String name){
        this.name = name;
        this.age = 1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult(){
        return age >= 20;
    }
}
