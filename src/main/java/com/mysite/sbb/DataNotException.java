package com.mysite.sbb;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND,  reason = "entity not found")
public class DataNotException {
    public DataNotException (String msg) {
        super();
    }
}
