/**Homework-9 University, School, Car жана Person деген класс тузунуз
 Алардын свойстваларын ойлоп табыныз
 Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
 Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
 Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз*/
public class newPerson {
    String name;
    char gender;
    boolean status;//семейное положение
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setGender(char gender){
        this.gender=gender;
    }
    public char getGender(){
        return gender;
    }

    public void setStatus(boolean status){
        this.status=status;
    }
    public boolean getStatus(){
        return status;
    }
}
