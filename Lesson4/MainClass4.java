package JavaCore.Lesson4;

public class MainClass4 {
    public static void main(String[] args) {


        PhoneBook<Contact> contactPhoneBook = new PhoneBook<>();

        contactPhoneBook.addContact(new Contact("Иванов", 799999999));
        contactPhoneBook.addContact(new Contact("Петров", 788888888));
        contactPhoneBook.addContact(new Contact("Смирнов", 77777777));
        contactPhoneBook.addContact(new Contact("Кузнецов", 76666666));
        contactPhoneBook.addContact(new Contact("Попов", 755555555));
        contactPhoneBook.addContact(new Contact("Васильев", 74444444));
        contactPhoneBook.addContact(new Contact("Соколов", 733333333));
        contactPhoneBook.addContact(new Contact("Михайлов", 722222222));
        contactPhoneBook.addContact(new Contact("Новиков", 711111111));
        contactPhoneBook.addContact(new Contact("Фёдоров", 700000000));
        contactPhoneBook.addContact(new Contact("Михайлов", 712121212));

        /*for (Map.Entry<Object, Object> o : contactPhoneBook.getPhoneBook().entrySet()) {
            System.out.println(o.getKey());
            System.out.println("номер телефона: " + o.getValue());
            System.out.println();
        }*/
        System.out.println("Номер этого контакта: " + contactPhoneBook.getPhoneBook().get("Михайлов"));

    }




}