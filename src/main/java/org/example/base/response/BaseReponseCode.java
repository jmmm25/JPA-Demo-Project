package org.example.base.response;

import org.springframework.http.HttpStatus;

public enum BaseReponseCode implements ResponseCode {
    REQUEST_UNDEFINED_ERROR(400, "Undefined Request Error", HttpStatus.BAD_REQUEST),
    REQUEST_NOT_FOUND_TARGET(404, "Not Found Target", HttpStatus.NOT_FOUND),
    REQUEST_PARAMETER_MISSING(450, "Mandatory Parameter Missing", HttpStatus.BAD_REQUEST),
    ;

    int code;
    String reason;
    HttpStatus status;

    BaseReponseCode(int code, String reason, HttpStatus status) {
        this.code = code;
        this.reason = reason;
        this.status = status;
    }

    @Override
    public int getCode() {
        return code;
    }

    public String getCodeString() {
        return code + "";
    }

    @Override
    public String getReason() {
        return reason;
    }

    @Override
    public HttpStatus getHttpStatus() {
        return status;
    }
}
