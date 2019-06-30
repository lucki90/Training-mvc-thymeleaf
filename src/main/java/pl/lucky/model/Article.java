package pl.lucky.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class Article {

    private String title;
    private String content;
    private String tags;

    public Article(String title, String content, String tags) {
        this.title = title;
        this.content = content;
        this.tags = tags;
    }
}
