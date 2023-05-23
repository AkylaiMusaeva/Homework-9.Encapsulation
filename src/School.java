/**Homework-9 University, School, Car жана Person деген класс тузунуз
 Алардын свойстваларын ойлоп табыныз
 Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
 Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
 Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз*/
public class School {
    String name;
    String colourOfBuilding;
    int quantityOfStudents;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setColourOfBuilding(String colourOfBuilding){
        this.colourOfBuilding=colourOfBuilding;
    }
    public String getColourOfBuilding(){
        return colourOfBuilding;
    }

    public void setQuantityOfStudents(int quantityOfStudents){
        this.quantityOfStudents=quantityOfStudents;
    }
    public int getQuantityOfStudents(){
        return quantityOfStudents;
    }

}
