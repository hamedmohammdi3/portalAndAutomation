package com.hamed.pat.dtos;

import com.hamed.pat.model.SecretAttachment;
import lombok.Builder;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Builder
public record SecretariatInfoDto(
        Long id,
        String deliveryReceiptNo,
        Boolean systemPerson,
        String deliveryInfo,
        Timestamp registerDate,
        String vrPerson,
        String indicatorNo,
        Timestamp deliveryDate,
        CategoryElementDto deliveryType,
        String personContactInfo,
        ContactPersonDto sender,
        List<SecretAttachmentDto> secretAttachSet,
        String fromEmail,
        String sendCode,
        String insertingUser,
        String updatingUser,
        Timestamp insertTime,
        Timestamp updateTime
) {
}
