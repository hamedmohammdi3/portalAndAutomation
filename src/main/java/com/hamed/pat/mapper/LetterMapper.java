package com.hamed.pat.mapper;

import com.hamed.pat.dtos.*;
import com.hamed.pat.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Service
public class LetterMapper implements Mapper<LetterDto, Letter> {
    private final Mapper<AttachmentDto, Attachment> attachmentMapper;
    private final Mapper<CategoryElementDto, CategoryElement> categoryElementMapper;
    private final Mapper<ContactPersonDto, ContactPerson> contactPersonMapper;
    private final Mapper<RelatedLetterDto, RelatedLetter> relatedLetterMapper;
    private final Mapper<SecretariatInfoDto,SecretariatInfo> secretariatInfoMapper;

    @Override
    public Letter dtoToEntity(LetterDto letterDto) {
        if (letterDto == null) {
            return null;
        }
        Letter letter = new Letter();
        letter.setId(letterDto.id());
        letter.setAttachmentSet(attachmentMapper.dtoListToEntities(letterDto.attachmentSet()));
        letter.setCheckAttach(letterDto.checkAttach());
        letter.setSubject(letterDto.subject());
        letter.setForAction(categoryElementMapper.dtoToEntity(letterDto.forAction()));
        letter.setRelatedLetter(relatedLetterMapper.dtoListToEntities(letterDto.relatedLetter()));
        letter.setRegisterDate(letterDto.registerDate());
        letter.setDate(letterDto.date());
        letter.setVrToDraft(letterDto.vrToDraft());
        letter.setIsTemplate(letterDto.isTemplate());
        letter.setDocType(categoryElementMapper.dtoToEntity(letterDto.docType()));
        letter.setPriority(categoryElementMapper.dtoToEntity(letterDto.priority()));
        letter.setAdditionDateTransient(letterDto.additionDateTransient());
        letter.setIsSubmit(letterDto.isSubmit());
        letter.setTaskNo(letterDto.taskNo());
        letter.setReceiverReferralSet(contactPersonMapper.dtoListToEntities(letterDto.receiverReferralSet()));
        letter.setCcPersonSet(contactPersonMapper.dtoListToEntities(letterDto.ccPersonSet()));
        letter.setVrCreator(letterDto.vrCreator());
        letter.setDirection(categoryElementMapper.dtoToEntity(letterDto.letterDirection()));
        letter.setDeadline(letterDto.deadline());
        letter.setSigner(contactPersonMapper.dtoToEntity(letterDto.signer()));
        letter.setLetterNo(letterDto.letterNo());
        letter.setSecret(secretariatInfoMapper.dtoToEntity(letterDto.secret()));
        letter.setBodyFile(letterDto.bodyFile());
        letter.setKeywords(letterDto.keywords());
        letter.setDocFile(letterDto.docFile());
        letter.setLetterType(categoryElementMapper.dtoToEntity(letterDto.letterType()));
        letter.setToPersonSet(contactPersonMapper.dtoListToEntities(letterDto.toPersonSet()));
        letter.setToOrgSet(contactPersonMapper.dtoListToEntities(letterDto.toOrgSet()));
        letter.setBccPersonSet(contactPersonMapper.dtoListToEntities(letterDto.bccPersonSet()));
        letter.setActionType(letterDto.actionType());
        letter.setFromPerson(contactPersonMapper.dtoToEntity(letterDto.fromPerson()));
        letter.setAddtionData(letterDto.addtionData());
        letter.setBody(letterDto.body());
        letter.setOldLetterNo(letterDto.oldLetterNo());
        letter.setReference(letterDto.reference());
        letter.setTemplateId(letterDto.templateId());
        letter.setSecurity(categoryElementMapper.dtoToEntity(letterDto.security()));
        letter.setMinutes(letterDto.minutes());
        letter.setSignerPersonSet(contactPersonMapper.dtoListToEntities(letterDto.signerPerson()));
        letter.setInsertingUser(letterDto.insertingUser());
        letter.setUpdatingUser(letterDto.updatingUser());
        letter.setInsertTime(letterDto.insertTime());
        letter.setUpdateTime(letterDto.updateTime());
        return letter;
}

    @Override
    public Set<Letter> dtoListToEntities(List<LetterDto> letterDtos) {
        return letterDtos.stream().map(this::dtoToEntity).collect(Collectors.toSet());
    }

    @Override
    public LetterDto entityToDto(Letter letter) {
        if(letter == null){
            return null;
        }
    return LetterDto.builder()
            .id(letter.getId())
            .attachmentSet(attachmentMapper.entitiesToDtoList(letter.getAttachmentSet()))
            .checkAttach(letter.getCheckAttach())
            .subject(letter.getSubject())
            .forAction(categoryElementMapper.entityToDto(letter.getForAction()))
            .relatedLetter(relatedLetterMapper.entitiesToDtoList(letter.getRelatedLetter()))
            .registerDate(letter.getRegisterDate())
            .date(letter.getDate())
            .vrToDraft(letter.getVrToDraft())
            .isTemplate(letter.getIsTemplate())
            .docType(categoryElementMapper.entityToDto(letter.getDocType()))
            .priority(categoryElementMapper.entityToDto(letter.getPriority()))
            .addtionData(letter.getAddtionData())
            .isSubmit(letter.getIsSubmit())
            .taskNo(letter.getTaskNo())
            .receiverReferralSet(contactPersonMapper.entitiesToDtoList(letter.getReceiverReferralSet()))
            .ccPersonSet(contactPersonMapper.entitiesToDtoList(letter.getCcPersonSet()))
            .vrCreator(letter.getVrCreator())
            .letterDirection(categoryElementMapper.entityToDto(letter.getDirection()))
            .deadline(letter.getDeadline())
            .signer(contactPersonMapper.entityToDto(letter.getSigner()))
            .letterNo(letter.getLetterNo())
            .secret(secretariatInfoMapper.entityToDto(letter.getSecret()))
            .bodyFile(letter.getBodyFile())
            .keywords(letter.getKeywords())
            .docFile(letter.getDocFile())
            .letterType(categoryElementMapper.entityToDto(letter.getLetterType()))
            .toPersonSet(contactPersonMapper.entitiesToDtoList(letter.getToPersonSet()))
            .toOrgSet(contactPersonMapper.entitiesToDtoList(letter.getToOrgSet()))
            .bccPersonSet(contactPersonMapper.entitiesToDtoList(letter.getBccPersonSet()))
            .actionType(letter.getActionType())
            .fromPerson(contactPersonMapper.entityToDto(letter.getFromPerson()))
            .addtionData(letter.getAddtionData())
            .body(letter.getBody())
            .oldLetterNo(letter.getOldLetterNo())
            .reference(letter.getReference())
            .templateId(letter.getTemplateId())
            .security(categoryElementMapper.entityToDto(letter.getSecurity()))
            .minutes(letter.getMinutes())
            .signerPerson(contactPersonMapper.entitiesToDtoList(letter.getSignerPersonSet()))
            .insertingUser(letter.getInsertingUser())
            .updatingUser(letter.getUpdatingUser())
            .insertTime(letter.getInsertTime())
            .updateTime(letter.getUpdateTime())
            .build();
    }

    @Override
    public List<LetterDto> entitiesToDtoList(Set<Letter> entities) {
        return entities.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    @Autowired
    @Lazy
    public LetterMapper(Mapper<AttachmentDto,Attachment> attachmentMapper,
                        CategoryElementMapper categoryElementMapper,
                        ContactPersonMapper contactPersonMapper,
                        RelatedLetterMapper relatedLetterMapper,
                        SecretariatInfoMapper secretariatInfoMapper) {
        this.attachmentMapper = attachmentMapper;
        this.categoryElementMapper = categoryElementMapper;
        this.contactPersonMapper = contactPersonMapper;
        this.relatedLetterMapper = relatedLetterMapper;
        this.secretariatInfoMapper = secretariatInfoMapper;
    }
}
