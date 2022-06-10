public class Main {
    public static void main(String[] args) {
        Phone_book book = new Phone_book();
        book.add("Кубадиев", "465823467");
        book.add("Кубадиев", "11111111");
        book.add("Гура", "22222223");
        book.add("Гура", "45321234");
        book.add("Борщевский", "88888888");
        book.add("Борщевский", "45324567");
        book.add("Гайфулина", "00000001");
        book.add("Гайфулина", "00000002");

        System.out.println("Телефоны Гайфулиной: " + book.get("Гайфулина"));
        System.out.println("Телефоны Кубадиева: " + book.get("Кубадиев"));
        System.out.println("Телефоны Борщевского: " + book.get("Борщевский"));
    }
}