package org.example.base.exception.detail;

import org.example.base.exception.BaseException;
import org.example.base.response.ResponseCode;

public class BadRequestException extends BaseException {

    private static final long serialVersionUID = 81963875134266622L;

    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(ResponseCode code) {
        super(code);
    }

    public BadRequestException(ResponseCode code, String message) {
        super(code, message);
    }

    public BadRequestException(ResponseCode code, Throwable cause) {
        super(code, cause);
    }

}

