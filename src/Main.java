import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
     /* Person person=new Person();
      person.setName("Abubakir");
      person.setAge(-18);
      person.setEmail("abubakir@gmail.com");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getEmail());*/


       /* Rectangle rectangle=new Rectangle();
        rectangle.setHeight(4);
        rectangle.setWidth(2);
        System.out.println("Площадь прямоугольника = "+rectangle.getSquare());*/


       /* Student student=new Student();
        System.out.print("Input your name ");
        student.setName(scanner.nextLine());
        System.out.print("Input your last name ");
        student.setLastName(scanner.nextLine());
        System.out.println("Input courses you are studying ");
        student.setCourses(student.getCourses());
        System.out.println("Name is  "+student.getName());
        System.out.println("Last name is "+student.getLastName());
        System.out.println("Courses are "+Arrays.toString(student.getCourses()));*/

/**University, School, Car жана Person деген класс тузунуз
 Алардын свойстваларын ойлоп табыныз
 Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
 Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
 Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз*/
        University university=new University();
        university.setName("AUCA");
        university.setDateOfFoundation(2011);
        university.setRating(4.5);

        University university1=new University();
        university1.setName("UCA ");
        university1.setDateOfFoundation(2015);
        university1.setRating(4.4);

        University university2=new University();
        university2.setName("KGMA");
        university2.setDateOfFoundation(1987);
        university2.setRating(4.1);

        University[]array={university,university1,university2};
        System.out.println("NAME OF UNIVERSITY    DATE OF FOUNDATION      RATING ");
        for(int i=0;i< array.length;i++){
            System.out.println(array[i].getName()+"\t\t\t\t\t"+array[i].getDateOfFoundation()+"\t\t\t\t\t"+array[i].getRating());
        }
        System.out.println("-----------------------------------------------------------------");

        School school=new School();
        school.setName("72-ая гимназия    ");
        school.setColourOfBuilding("pink");
        school.setQuantityOfStudents(300);

        School school1=new School();
        school1.setName("61-ая гимназия    ");
        school1.setColourOfBuilding("green");
        school1.setQuantityOfStudents(450);

        School school2=new School();
        school2.setName("32-ая средняя школа");
        school2.setColourOfBuilding("brown");
        school2.setQuantityOfStudents(380);

        School[]array1={school,school1,school2};
        System.out.println("NAME OF SCHOOL            COLOUR       QUANTITY OF STUDENTS" );
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i].getName()+"\t\t\t"+array1[i].getColourOfBuilding()+"\t\t\t"+array1[i].getQuantityOfStudents());
        }
        System.out.println("-----------------------------------------------------------------");

        Car car=new Car();
        car.setName("Honda ");
        car.setYear(2001);
        car.setVolume(4.5);

        Car car1=new Car();
        car1.setName("Toyota");
        car1.setYear(2003);
        car1.setVolume(3.5);

        Car car2=new Car();
        car2.setName("Audi  ");
        car2.setYear(2011);
        car2.setVolume(2.5);

        Car []array2={car,car1,car2};
        System.out.println("NAME OF CAR    DATE OF FOUNDATION          VOLUME ");
        for(int i=0;i< array2.length;i++){
            System.out.println(array2[i].getName()+"\t\t\t\t"+array2[i].getYear()+"\t\t\t\t\t"+array2[i].getVolume());
        }
        System.out.println("-----------------------------------------------------------------");


        newPerson newPerson= new newPerson();
        newPerson.setName("Azamat");
        newPerson.setGender('M');
        newPerson.setStatus(true);

        newPerson newPerson1=new newPerson();
        newPerson1.setName("Rahat");
        newPerson1.setGender('F');
        newPerson1.setStatus(false);

        newPerson newPerson2=new newPerson();
        newPerson2.setName("Kumar");
        newPerson2.setGender('F');
        newPerson2.setStatus(true);

        newPerson [] array3={newPerson,newPerson1,newPerson2};
        System.out.println("NAME          GENDER       MARITAL STATUS ");
        for(int i=0;i<array3.length;i++){
            System.out.println(array3[i].getName()+"\t\t\t"+array3[i].getGender()+"\t\t\t"+array3[i].getStatus());
        }

    }
}