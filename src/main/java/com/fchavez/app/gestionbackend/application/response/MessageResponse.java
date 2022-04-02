package com.fchavez.app.gestionbackend.application.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@JsonInclude(Include.NON_NULL)
public class MessageResponse {

    private LocalDateTime timestamp;
    private String title;
    private String description;
    private HttpStatus code;


    public MessageResponse(String title, String description, HttpStatus code) {
        this.title = title;
        this.description = description;
        this.code = code;
    }

    public MessageResponse(HttpStatus code){
        this.code = code;
    }

    public HttpStatus getCode() {
        return code;
    }

    public void setCode(HttpStatus code) {
        this.code = code;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
