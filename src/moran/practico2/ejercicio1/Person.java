package moran.practico2.ejercicio1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Person {
    final private Float maxWeight=600f;
    final private Float maxHeight=3f;
    final private Float maxShape=25f;//max bodymax value for be in shape
    final private Float minShape=18.5f;//min bodymax value for be in shape

    private String name="N",surname="N",sex="F";
    private LocalDate birthdate=LocalDate.of(2000, Month.JANUARY,1);
    private Float weight=1f,height=0f;
    private Integer dni;

    public Person(Integer dni){
        this.dni=dni;
    }

    public Person(Integer dni,String name,String surname){
        this.dni=dni;
        this.name=name;
        this.surname=surname;
    }

    public Person(Integer dni,String name,String surname,LocalDate birthdate){
        this.dni=dni;
        this.name=name;
        this.surname=surname;
        this.birthdate=birthdate;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public Integer getDni(){
        return dni;
    }

    public Float getWeight(){
        return weight;
    }

    public Float getHeight(){
        return height;
    }

    public LocalDate getBirthdate(){
        return birthdate;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public void setSex(String sex){
        if(sex.equals("F") || sex.equals("M"))
            this.sex=sex;
    }

    public void setWeight(Float weight){
        if(weight>0f && weight<maxWeight)
            this.weight=weight;
    }

    public void setHeight(Float height){
        if(height>0f && height<maxHeight)
            this.height=height;
    }

    public void setBirthdate(LocalDate birthdate){
        this.birthdate=birthdate;
    }

    public Float getBodyMass(){
        return (weight/(height*height));
    }

    public boolean checkShape(){
        Float bodymass=this.getBodyMass();
        return ((bodymass>minShape) && (bodymass<maxShape));
    }

    public boolean isBirthdate(){
        return birthdate.isEqual(LocalDate.now());
    }

    public boolean isAdult(){
        return getAge()>18;
    }

    public Integer getAge(){
        return Period.between(birthdate,LocalDate.now()).getYears();
    }

    public boolean canVote(){
        return this.getAge()>16;
    }

    public String toString(){
        return this.getSurname() + ", " + this.getName() + ", " + this.getDni() + ", " + this.getBirthdate() + ", "
                + this. getAge() + ", " + this.getWeight() + ", " + this.getHeight();
    }
}
