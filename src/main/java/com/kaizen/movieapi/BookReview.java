package com.kaizen.movieapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookreviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookReview {
    @Id
    private ObjectId id;
    private String body;

    public BookReview(String body) {
        this.body = body;
    }
}
