public class Person {
    private String name;
    private int age;
    private String email;



    public void setName(String name){
        if(name.startsWith("A")){
        this.name=name;
    }else {
            System.out.println("Input");
        }
    }
    public String getName(){

        return name;
    }
    public void setAge(int age){
        if(age<0){
            System.out.println("Age can not be negative");
        }
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setEmail(String email){
        if(email.contains("@gmail.com")){
        this.email=email;
    }else{
            System.out.println("Email should include @gmail.com ");
        }
    }
    public String getEmail(){
        return email;
    }





}
