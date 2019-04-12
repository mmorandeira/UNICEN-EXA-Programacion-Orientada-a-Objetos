package moran.practico2.ejercicio5.parte1;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Person {
    private String name = "N", surname = "N", sex = "F", mail = "";
    private Integer dni;
    private double weight, height;
    private LocalDate birthdate = LocalDate.of(2000, Month.JANUARY, 1);

    public Person(Integer dni) {
        this.setDni(dni);
    }

    public Person(Integer dni, String name, String surname) {
        this.setName(name);
        this.setSurname(surname);
        this.setDni(dni);
    }

    public Person(Integer dni, String name, String surname, LocalDate birthdate) {
        this.setName(name);
        this.setSurname(surname);
        this.setDni(dni);
        this.setBirthdate(birthdate);
    }

    /*public Person(String name, String surname, String sex, String mail, Integer dni, LocalDate birthdate) {
        this.setName(name);
        this.setSurname(surname);
        this.setSex(sex);
        this.setMail(mail);
        this.setDni(dni);
        this.setBirthdate(birthdate);
    }*/

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getAge() {
        return Math.toIntExact(ChronoUnit.YEARS.between(this.birthdate, LocalDate.now()));
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height * 2;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
