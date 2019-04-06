package moran.practico2.ejercicio5.parte2;

import java.util.*;
import java.util.stream.Collectors;

public class Cellphone {
    private List<Contact> contactList;

    public Cellphone() {
        contactList = new ArrayList<Contact>();
    }

    public void addContact(Contact contact) {
        this.contactList.add(contact);
    }

    public int getNumberOfContacts() {
        return contactList.size();
    }

    public List<Contact> getContactList() {
        return new ArrayList<Contact>(this.contactList);
    }

    public List<Contact> findDuplicates() {//porque esto no funciona???? (tiene que ver con algo de hashes me parece)

        final Set<Contact> setToReturn = new HashSet<Contact>();
        final Set<Contact> set1 = new HashSet<Contact>();

        for (Contact yourInt : this.contactList) {
            if (!set1.add(yourInt)) {
                setToReturn.add(yourInt);
            }
        }
        List<Contact> noDuplicates=convertToList(setToReturn);
        return noDuplicates;
    }

    private <T> List<T> convertToList(Set<T> set)
    {
        return set.stream().collect(Collectors.toList());
    }

    public List<Contact> getContacWithNumber(long number){
        ArrayList<Contact> aux=new ArrayList<Contact>();
        for(Contact c:contactList)
            if(c.getNumber()==number)
                aux.add(c);
        return aux;
    }

    public double getAverageAge(){
        int amount=0;
        for(Contact c:contactList)
            amount+=c.getAge();
        return (double) (amount/contactList.size());
    }


}
