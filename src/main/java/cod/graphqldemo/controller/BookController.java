package cod.graphqldemo.controller;

import cod.graphqldemo.bookdetails.Author;
import cod.graphqldemo.bookdetails.AuthorContactDetails;
import cod.graphqldemo.bookdetails.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class BookController {

    @QueryMapping
    public Book bookById(@Argument String id) {
        log.info("Quering the book data for id {}", id);
        return Book.getById(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        log.info("Quering the Author data for parent book");
        return Author.getById(book.getAuthorId());
    }

    @SchemaMapping
    public AuthorContactDetails contact(Author author) {
        log.info("Quering the contact data for parent Author");
        return AuthorContactDetails.getById(author.getContactId());
    }
}
