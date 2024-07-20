package com.hamed.pat.dtos;

import lombok.Builder;

import java.sql.Timestamp;
@Builder
public record SecretAttachmentDto(
        String vrAttachmentDocument,
        String description,
        Long id,
        String insertingUser,
        String updatingUser,
        Timestamp insertTime,
        Timestamp updateTime
) {
}
