package com.hamed.pat.util;

public enum MessageEnum {
    ID_NOT_BE_NULL("Id not Be Null!!"),
    LETTER_NOT_FOND("Letter Not Found!!"),
    LETTER_DELETED_SUCCESSFUL("Letter deleted successfuly!!!");

    private String value;

    MessageEnum(String code) {
        this.value = value;
    }


    public String value() {
        return value;
    }
}
