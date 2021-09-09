public class Person {
    private int age;
    private float height;
    private String name;
    static final int AGE=100;
    static final float HEIGHT=50.3f;

    public Person(int age, float height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void info() {
        System.out.printf("age=%d, streit=%f, name=%s", age, height, name);
    }
    public boolean valid() {
        return age<AGE && height<HEIGHT;
    }
}