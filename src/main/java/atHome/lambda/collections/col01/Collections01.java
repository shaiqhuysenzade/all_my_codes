package atHome.lambda.collections.col01;

import java.util.*;
import java.util.stream.Collectors;

public class Collections01 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Shaiq", "Vagif", "Vusal", "Cavidan");

        // first option
        Collections.sort(name, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        //second option
        Collections.sort(name, (o1, o2) -> o1.compareToIgnoreCase(o2));

        //third(the best) option
        Collections.sort(name, String::compareToIgnoreCase);
        System.out.println(name);
        //-------------------------------------------

        Book book1 = new Book("Miss Peregrine's Home for Peculiar Children",
                "Ranson", "Riggs", 382);
        Book book2 = new Book("Harry Potter and The Sorcerers Stone",
                "JK", "Rowling", 411);
        Book book3 = new Book("The Cat in the Hat",
                "Dr", "Seuss", 45);
        List<Book> bookList = Arrays.asList(book1, book2, book3);

        int totalOfPages = bookList.stream().mapToInt(Book::getPages).sum();
        System.out.println(totalOfPages);

        List<Book> dupBooks = Arrays.asList(book1, book2, book3, book1, book2);
        System.out.println("Before removing duplicates");
        dupBooks.forEach(System.out::print);
        System.out.println();
        Collection<Book> withoutDuplicates = new HashSet<>(dupBooks);
        System.out.println("After removing duplicates");
        withoutDuplicates.forEach(System.out::print);
        System.out.println();
        System.out.println("Getting first name of Authors: ");
        //bookList.stream().map(Book::getAuthorFName).forEach(System.out::println);
        List<String> authorsName = bookList.stream().map(Book::getAuthorFName).collect(Collectors.toList());
        System.out.println(authorsName);

        //using SET
        Set<Integer> integers =new HashSet<>(Arrays.asList(10,9,9,99,4,7));
        TreeSet<Integer> integers1 = new TreeSet<>(integers);
        List<Integer> integerList = new ArrayList<>(integers);
        System.out.println(integers);
        Collections.sort(integerList);
        System.out.println(integerList);
        System.out.println(integers1);
    }
}
