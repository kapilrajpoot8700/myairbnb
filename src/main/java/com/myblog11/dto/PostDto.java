package com.myblog11.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PostDto {

    private long id;
    @NotEmpty
    @Size(min = 3, message = "content should be at least 3 characters")
    private String content;

    @NotEmpty
    @Size(min =3,message= "description should be  at least 3 characters")
    private String description;

    @NotEmpty
    @Size(min = 3, message = "title should be at least 3 characters")
    private String title;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
