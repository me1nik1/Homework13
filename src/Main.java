public class Main {
    public static void main(String[] args) {
        Author author = new Author("Василий", "Пупкин");
        System.out.println("Имя автора - " + author.getFirstName());
        System.out.println("Фамилия автора - " + author.getLastName());

        Book hello = new Book("Привет", author, 2022);
        System.out.println("Заголовок - " + hello.getTitle());
        System.out.println("Автор - " + hello.getAuthor());
        System.out.println("Год издания - " + hello.getPublisherYear());
        hello.setPublisherYear(2023);
        System.out.println("Год издания - " + hello.getPublisherYear());

        System.out.println();

        System.out.println(new Author("Василий", "Пупкин"));
        System.out.println(new Book("Привет", author, 2022));

        System.out.println();

        Author author1 = new Author("Пупка", "Васильев");
        System.out.println("Имя автора - " + author1.getFirstName());
        System.out.println("Фамилия автора - " + author1.getLastName());

        Book hello1 = new Book("Как делишки?", author1, 2016);
        System.out.println("Заголовок - " + hello1.getTitle());
        System.out.println("Автор - " + hello1.getAuthor());
        System.out.println("Год издания - " + hello1.getPublisherYear());
        hello1.setPublisherYear(2018);
        System.out.println("Год издания - " + hello1.getPublisherYear());

        System.out.println();

        System.out.println(new Author("Пупка", "Васильев"));
        System.out.println(new Book("Как делишки?", author1, 2016));
    }
}