package com.hamed.pat.dtos;


import lombok.Builder;

import java.sql.Timestamp;
@Builder
public record AttachmentDto(
        String vrAttachmentDocument,
        String description,
        LetterDto attach,
        Long id,
        String insertingUser,
        String updatingUser,
        Timestamp insertTime,
        Timestamp updateTime
) {
}
