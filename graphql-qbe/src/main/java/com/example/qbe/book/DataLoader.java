package com.example.qbe.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final BookRepository repository;

    public DataLoader(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        repository.save(new Book("1984", "George Orwell", 1949));
        repository.save(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        repository.save(new Book("Pride and Prejudice", "Jane Austen", 1813));
        repository.save(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
        repository.save(new Book("Moby-Dick", "Herman Melville", 1851));
        repository.save(new Book("War and Peace", "Leo Tolstoy", 1869));
        repository.save(new Book("Crime and Punishment", "Fyodor Dostoevsky", 1866));
        repository.save(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        repository.save(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        repository.save(new Book("Anna Karenina", "Leo Tolstoy", 1877));
        repository.save(new Book("Brave New World", "Aldous Huxley", 1932));
        repository.save(new Book("The Adventures of Huckleberry Finn", "Mark Twain", 1884));
        repository.save(new Book("Fahrenheit 451", "Ray Bradbury", 1953));
        repository.save(new Book("Jane Eyre", "Charlotte Brontë", 1847));
        repository.save(new Book("Wuthering Heights", "Emily Brontë", 1847));
        repository.save(new Book("Great Expectations", "Charles Dickens", 1861));
        repository.save(new Book("Les Misérables", "Victor Hugo", 1862));
        repository.save(new Book("A Tale of Two Cities", "Charles Dickens", 1859));
        repository.save(new Book("The Picture of Dorian Gray", "Oscar Wilde", 1890));
        repository.save(new Book("Dracula", "Bram Stoker", 1897));
        repository.save(new Book("The Alchemist", "Paulo Coelho", 1988));
        repository.save(new Book("One Hundred Years of Solitude", "Gabriel García Márquez", 1967));
        repository.save(new Book("Of Mice and Men", "John Steinbeck", 1937));
        repository.save(new Book("The Grapes of Wrath", "John Steinbeck", 1939));
    }

}
