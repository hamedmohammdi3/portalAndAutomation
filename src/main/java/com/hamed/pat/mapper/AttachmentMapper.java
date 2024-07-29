package com.hamed.pat.mapper;

import com.hamed.pat.dtos.AttachmentDto;
import com.hamed.pat.dtos.LetterDto;
import com.hamed.pat.model.Attachment;
import com.hamed.pat.model.Letter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Service
public class AttachmentMapper implements Mapper<AttachmentDto, Attachment>{

    public final Mapper<LetterDto, Letter> letterMapper;
    @Override
    public Attachment dtoToEntity(AttachmentDto attachmentDto) {
        if (attachmentDto == null) {
            return null;
        }
        Attachment attachment = new Attachment();
        attachment.setId(attachmentDto.id());
        attachment.setAttach(letterMapper.dtoToEntity(attachmentDto.attach()));
        attachment.setVrAttachmentDocument(attachmentDto.vrAttachmentDocument());
        attachment.setDescription(attachmentDto.description());
        attachment.setInsertingUser(attachmentDto.insertingUser());
        attachment.setUpdatingUser(attachmentDto.updatingUser());
        attachment.setInsertTime(attachmentDto.insertTime());
        attachment.setUpdateTime(attachmentDto.updateTime());
        return attachment;
    }

    @Override
    public Set<Attachment> dtoListToEntities(List<AttachmentDto> attachmentDtos) {
        return attachmentDtos.stream().map(this::dtoToEntity).collect(Collectors.toSet());
    }

    @Override
    public AttachmentDto entityToDto(Attachment attachment) {
        if (attachment == null) {
            return null;
        }
        return AttachmentDto.builder()
                .id(attachment.getId())
                .attach(letterMapper.entityToDto(attachment.getAttach()))
                .vrAttachmentDocument(attachment.getVrAttachmentDocument())
                .description(attachment.getDescription())
                .insertingUser(attachment.getInsertingUser())
                .updatingUser(attachment.getUpdatingUser())
                .insertTime(attachment.getInsertTime())
                .updateTime(attachment.getUpdateTime())
                .build();
    }

    @Override
    public List<AttachmentDto> entitiesToDtoList(Set<Attachment> entities) {
        return entities.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    @Autowired
    public AttachmentMapper(Mapper<LetterDto, Letter> letterMapper) {
        this.letterMapper = letterMapper;
    }
}
