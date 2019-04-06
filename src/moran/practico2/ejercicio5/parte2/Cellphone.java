package moran.practico2.ejercicio5.parte2;

import java.util.*;

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

    public ArrayList<Contact> getContactList() {
        return new ArrayList<Contact>(this.contactList);
    }

    public ArrayList<Contact> getDuplicates() {//como hacer una solucion un poco mas eficiente, esto me parece muy malo.
        ArrayList<Contact> copy=new ArrayList<Contact>(this.contactList);
        ArrayList<Contact> reapeted=new ArrayList<Contact>();
        for(int i=0;i<copy.size();i++)
            for(int j=i+1;j<copy.size();j++) {
                Contact inJ=copy.get(j);
                if(copy.get(i).equals(inJ)){
                    if(!findContact(reapeted,inJ))
                        reapeted.add(inJ);
                    copy.remove(i);
                }
            }
        return reapeted;
    }

    /*public Set<Contact> findDuplicates() {//porque esto no funciona???? (tiene que ver con algo de hashes me parece)

        final Set<Contact> setToReturn = new HashSet<Contact>();
        final Set<Contact> set1 = new HashSet<Contact>();

        for (Contact yourInt : this.contactList) {
            System.out.println(yourInt);
            if (!set1.add(yourInt)) {
                setToReturn.add(yourInt);
            }
        }
        return setToReturn;
    }*/
    private boolean findContact(List<Contact> list, Contact toFind) {
        for (Contact c : list)
            if (toFind.equals(c))
                return true;
        return false;
    }
}
