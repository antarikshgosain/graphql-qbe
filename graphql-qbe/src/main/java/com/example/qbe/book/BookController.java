package com.example.qbe.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookRepository repository;

    // TODO - name 'books' should exactly match in schema.graphqls file
    @QueryMapping
    public List<Book> books () {
        return repository.findAll();
    }

    @QueryMapping
    public Book bookById(@Argument Integer id) {
        return repository.getBookById(id);
    }
}
