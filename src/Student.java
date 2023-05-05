import java.util.Scanner;
/**Student деген класс түзүнүз.
 Поле: Аты, фамилиясы, жашы жана катышкан сабактары
 (courses)болсун.
 Геттер сеттерлерди маани берип жана алуу үчүн түзүнүз.
 Setterлерге маанини сканнер аркылуу бериниз .
 Курстарды сканнер аркылуу толтурунуз.
 Бардык маанилерди консольго чыгарыныз.*/
public class Student {
    Scanner scanner=new Scanner(System.in);
    private String name;
    private String lastName;
    private String[] courses;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public  void setCourses(String []courses){
        courses=new String[5];
        for(int i=0;i< courses.length;i++){
            courses[i]=scanner.nextLine();
        }
        this.courses=courses;
    }
    public String[] getCourses (){
        return courses;
    }
}
