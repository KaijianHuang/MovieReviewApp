package com.kaizen.movieapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> AllBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> SingleBook(String imdbId){
        return bookRepository.findBookByImdbId(imdbId);
    }
}
