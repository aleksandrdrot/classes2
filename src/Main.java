public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(new Author("Толстой", "Лев", "Николаевич"), "Война и мир", 1975);
        Book book2 = new Book(new Author("Пушкин", "Александр", "Сергеевич"), "Сборник стихов", 1978);
        Book book3 = new Book(new Author("Пушкин", "Александр", "Сергеевич"), "Сборник стихов", 1978);

        System.out.println("Книга1 " + book1.getAuthor().toString() + " " + book1.toString());
        System.out.println("Книга2 " + book2.getAuthor().toString() + " " + book2.toString());
        //book2.setPublishingYear(1925);
        //System.out.println("Книга2 "+ book2.getAuthor().toString() + " " + book2.toString());

        System.out.println(book2.equals(book3));
        System.out.println(book1.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book1.hashCode() == book3.hashCode());
        System.out.println(book3.getAuthor().hashCode());
        System.out.println(book2.getAuthor().hashCode());
        System.out.println(book2.getAuthor().hashCode() == book3.getAuthor().hashCode());


    }

}