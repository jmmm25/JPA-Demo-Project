package org.example.base.exception;

import org.example.base.response.ResponseCode;

public class BaseException extends RuntimeException {

    private ResponseCode code;

    public BaseException(String message) {
        super(message);
    }

    public BaseException(ResponseCode code) {
        super(code.getReason());
        this.code = code;
    }

    public BaseException(ResponseCode code, String message) {
        super(message);
        this.code = code;
    }

    public BaseException(ResponseCode code, Throwable cause) {
        super(cause);
        this.code = code;
    }

    public ResponseCode getCode() {
        return code;
    }
}
