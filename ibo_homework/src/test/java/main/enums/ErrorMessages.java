package main.enums;

public enum ErrorMessages {
    SIZE_NOT_SELECTED("Please select a size");

    private String errorMessage;

    ErrorMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

