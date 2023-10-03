public class StudentMain {
    Student[] store = new Student[5];
    int index;
    void add(Student student){
            store[index] = student;
            index++;
        }

    void studentDisplay(){
        for(int i=0; i< store.length; i++){
            System.out.println(store[i]);

        }
    }

    Student findById(int id){
        for(int i=0; i< store.length; i++){
            if(store[i].id == id){
                return store[i];
            }
        }
        return null;

    }

    public static void main(String[] args) {

        StudentMain demo = new StudentMain();
        Student student1 = new Student(1, "tom", 101);
        demo.add(student1);
        Student student2 = new Student(2, "tom", 201);
        demo.add(student2);
        Student student3 = new Student(3, "tom", 301);
        demo.add(student3);
        Student student4 = new Student(4, "tom", 401);
        demo.add(student4);
        Student student5 = new Student(5, "tom", 501);
        demo.add(student5);

        demo.studentDisplay();

       Student s1 = demo.findById(3);

        System.out.println(s1.name);


    }
}
