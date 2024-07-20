package com.hamed.pat.dtos;

import lombok.Builder;

import java.sql.Timestamp;
@Builder
public record CategoryElementDto(
        String value,
        String code,
        Long id,
        String insertingUser,
        String updatingUser,
        Timestamp insertTime,
        Timestamp updateTime
) {
}
