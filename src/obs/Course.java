package obs;

public class Course {

    String name;
    String code;
    String prefix;
    int note;
    Teacher t;

    Course(String name,String code,String prefix,Teacher t){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
        this.t=t;
    }

    void addTeacher(Teacher teacher){

        if (teacher.branch.equals(this.prefix)){
            this.t=teacher;

        }else {
            System.out.println("öğretmen ve ders durumları uyuşmuyor");
        }

        printTeacherInfo();
    }

    void printTeacherInfo(){
        this.t.print();
    }

}
