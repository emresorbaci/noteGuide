package com.srbc.webapp.bootstrap;

import com.srbc.webapp.domain.Author;
import com.srbc.webapp.domain.Book;
import com.srbc.webapp.domain.Publisher;
import com.srbc.webapp.repositories.IAuthorRepository;
import com.srbc.webapp.repositories.IBookRepository;
import com.srbc.webapp.repositories.IPublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author esorbaci
 */

@Component
public class BootStrapData implements CommandLineRunner {

    private final IAuthorRepository authorRepository;
    private final IBookRepository bookRepository;
    private final IPublisherRepository publisherRepository;

    public BootStrapData(IAuthorRepository authorRepository, IBookRepository bookRepository, IPublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Publisher tev = new Publisher("tev", "1407. cad", "Ankara", "Turkey", "06560");
        publisherRepository.save(tev);

        Author emre = new Author("Emre", "Sorbaci");
        Book sample = new Book("Domain Driven Design", "ABC21");
        emre.getBooks().add(sample);
        sample.getAuthors().add(emre);
        sample.setPublisher(tev);
        tev.getBooks().add(sample);

        authorRepository.save(emre);
        bookRepository.save(sample);
        publisherRepository.save(tev);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without RJB", "DRE23");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(tev);
        tev.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(tev);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of authors: " + authorRepository.count());
        System.out.println("Number of Publishers: " + publisherRepository.count());
        System.out.println("Number of TEV books: " + tev.getBooks().size());

    }
}
