package com.hamed.pat.dtos;

import lombok.Builder;

import java.sql.Timestamp;

@Builder
public record AttachFileInfoDto(
        String name,
        String key,
        String size,
        String fileUploaderKey,
        Long id,
        String insertingUser,
        String updatingUser,
        Timestamp insertTime,
        Timestamp updateTime
) {
}
