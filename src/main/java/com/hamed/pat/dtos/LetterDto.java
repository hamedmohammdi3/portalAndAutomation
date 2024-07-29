package com.hamed.pat.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Builder
public record LetterDto(
        Long id,
        List<AttachmentDto> attachmentSet,
        String checkAttach,
        @NotEmpty
        String subject,
        CategoryElementDto forAction,
        List<RelatedLetterDto> relatedLetter,
        Timestamp registerDate,
        Timestamp date,
        String vrToDraft,
        Boolean isTemplate,
        CategoryElementDto docType,
        CategoryElementDto priority,
        String additionDateTransient,
        Boolean isSubmit,
        String taskNo,
        List<ContactPersonDto> receiverReferralSet,
        List<ContactPersonDto> ccPersonSet,
        String vrCreator,
        CategoryElementDto letterDirection,
        Timestamp deadline,
        ContactPersonDto signer,
        String letterNo,
        SecretariatInfoDto secret,
        String bodyFile,
        String keywords,
        String docFile,
        CategoryElementDto letterType,
        List<ContactPersonDto> toPersonSet,
        List<ContactPersonDto> toOrgSet,
        List<ContactPersonDto> bccPersonSet,
        String actionType,
        ContactPersonDto fromPerson,
        String addtionData,
        String body,
        String oldLetterNo,
        String reference,
        Long templateId,
        CategoryElementDto security,
        Boolean minutes,
        List<ContactPersonDto> signerPerson,
        String insertingUser,
        String updatingUser,
        Timestamp insertTime,
        Timestamp updateTime
) {
}
