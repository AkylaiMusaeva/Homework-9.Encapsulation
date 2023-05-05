/**University, School, Car жана Person деген класс тузунуз
 Алардын свойстваларын ойлоп табыныз
 Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
 Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
 Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз*/
public class University {
    private String name;
    private int dateOfFoundation;
    private double rating;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setDateOfFoundation(int dateOfFoundation){
        this.dateOfFoundation=dateOfFoundation;
    }
    public int getDateOfFoundation(){
        return dateOfFoundation;
    }

    public void setRating(double rating){
        this.rating=rating;
    }
    public double getRating(){
        return rating;
    }




}
