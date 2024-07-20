package com.hamed.pat.dtos;

import lombok.Builder;

import java.sql.Timestamp;
import java.util.ArrayList;
@Builder
public record ContactPersonDto(
        Long id,
        Integer labor,
        CategoryElementDto referralrepriority,
        String vrPost,
        Timestamp deadline,
        String personType,
        Timestamp deliveryDate,
        String vrOrganizationId,
        String vrPostId,
        String sign,
        String rootId,
        CategoryElementDto forActionFlow,
        String additionalDescription,
        ArrayList<AttachmentDto> attchReceiver,
        String vrPerson,
        String deliveryInfo,
        String description,
        String signature,
        Boolean publicDescription,
        Integer order,
        Boolean publicAttachment,
        Long roleOutsideId,
        CategoryElementDto personDeliveryType,
        String jobTitle,
        String vrOrganization,
        String vrTitle,
        String rowType,
        Boolean active,
        String title,
        String personName,
        String lastname,
        String firstname,
        String isActive,
        String is_automation,
        String full_name,
        String post_title,
        String is_not_labor,
        String insertingUser,
        String updatingUser,
        Timestamp insertTime,
        Timestamp updateTime
) {
}

