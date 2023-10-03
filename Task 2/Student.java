public class Student {
    int id;
    String name;
    int rollno;

    public Student(int id, String name, int rollno) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
    }

    void changeName(String newName){
        name = newName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
