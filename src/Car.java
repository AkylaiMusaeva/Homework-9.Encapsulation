/**Homework-9 University, School, Car жана Person деген класс тузунуз
 Алардын свойстваларын ойлоп табыныз
 Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
 Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
 Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз*/
public class Car {
    String name;
    int year;
    double volume;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }

    public void setVolume(double volume){
        this.volume=volume;
    }
    public double getVolume(){
        return volume;
    }
}
