package JavaCore.Lesson4;

import java.util.HashMap;

public class PhoneBook<T extends Contact> {

    private HashMap<Object, Object> phoneBook = new HashMap<>();
    //HashMap<String, String> phoneBook = new HashMap<>();
    public PhoneBook() {

    }

    public HashMap<Object, Object> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(HashMap<Object, Object> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void addContact(T Contact) {
        phoneBook.put(Contact.getName(), Contact.getNumberPhone());
    }
    /*public void getContact(T Contact) {
        phoneBook.get(Contact.getNumberPhone());
        System.out.println(Contact.getNumberPhone());
    }*/

}
