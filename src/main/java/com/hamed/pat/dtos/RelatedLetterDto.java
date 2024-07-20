package com.hamed.pat.dtos;

import lombok.Builder;

import java.sql.Timestamp;
@Builder
public record RelatedLetterDto(
        Long id,
        CategoryElementDto relatedLetterType,
        LetterDto letter,
        String letterNo,
        long date,
        String releatedLetterNo,
        String type,
        String insertingUser,
        String updatingUser,
        Timestamp insertTime,
        Timestamp updateTime
) {
}
