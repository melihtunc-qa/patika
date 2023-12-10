package obs;

public class Main {

    public static void main(String[] args) {


        Teacher t1 = new Teacher("ali","TR","555");

        Teacher t2 = new Teacher("Graham","fizik","505");

        Course tarih = new Course("Tarih","101","TRH",t1);

        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);


        Student s1 = new Student("şaban","123","4",tarih,fizik);


    }

}
