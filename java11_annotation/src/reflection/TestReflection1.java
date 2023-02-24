package reflection;

public class TestReflection1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 一个类在内存中只有一个Class对象
        // 一个类被加载后，类的整个结构都会被封装在Class对象中
        Class<?> c1 = Class.forName("reflection.User");
        Class<?> c2 = Class.forName("own_annotation.TestOwnAnnotation1");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

    }
}
class User{
    public String gender;
    private String name;
    private int id;
    private int age;

    public User() {
    }

    private User(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public User(String name, int id, int age) {
        this(name,id);
        this.age = age;
    }


    public User(String gender, String name, int id, int age) {
        this(name,id,age);
        this.gender = gender;
    }

    private String upperCaseName(String name) {
        return name.toUpperCase();
    }
    public String getName() {
        return upperCaseName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
