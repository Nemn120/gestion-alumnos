package com.fchavez.app.gestionbackend.application.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.http.HttpStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenericResponse<T>{

    private T data;
    private MessageResponse message;

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MessageResponse getMessage() {
        return message;
    }

    public void setMessage(MessageResponse message) {
        this.message = message;
    }

    public void setMessage(String title, String description, HttpStatus status) {
        this.message = new MessageResponse(title,description,status);
    }

    public void setStatus(HttpStatus status){
        this.message = new MessageResponse(status);
    }
}
