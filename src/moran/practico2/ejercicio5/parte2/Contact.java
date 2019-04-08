package moran.practico2.ejercicio5.parte2;

import java.time.LocalDate;
import java.time.Period;

public class Contact {
    private String name;
    private String surname;
    private String address;
    private String email;
    private String city;
    private LocalDate birthdate;
    private long number;

    public Contact(String name,String surname,String adress,String city,String email,LocalDate birthdate,long number){
           this.name=name;
           this.surname=surname;
           this.address=adress;
           this.city=city;
           this.email=email;
           this.birthdate=birthdate;
           this.number=number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Integer getAge(){
        return Period.between(birthdate,LocalDate.now()).getYears();
    }

    @Override
    public String toString(){
        return this.name + ", " + this.surname + ". Phone number: " + this.number + ". Adress: " + this.address
                + ", city:" + this.city + ", email: " + this.email + ", birthdate: " + this.birthdate;
    }

    @Override
    public boolean equals(Object o){
        Contact c1=(Contact)(o);
        return (this.name.equals(c1.getName()) && this.surname.equals(c1.getSurname()) && this.number==c1.getNumber());
    }

    @Override
    public int hashCode(){//esta bien hecho este override del hash?
        String aux=this.name + this.surname + String.valueOf(this.number);
        return aux.hashCode();
    }
}
