package com.stuxnet.jobfinder.exception;

public class JobFinderException extends RuntimeException {

    public JobFinderException(String message) {
        super(message);
    }

    public JobFinderException(String message, Throwable cause) {
        super(message, cause);
    }

    public JobFinderException(Throwable cause) {
        super(cause);
    }

}
