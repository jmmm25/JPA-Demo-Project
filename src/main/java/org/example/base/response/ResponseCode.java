package org.example.base.response;

import org.springframework.http.HttpStatus;

public interface ResponseCode {

    public int getCode();

    public String getCodeString();

    public String getReason();

    public HttpStatus getHttpStatus();
}
