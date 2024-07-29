package com.hamed.pat.mapper;

import com.hamed.pat.dtos.SecretAttachmentDto;
import com.hamed.pat.model.SecretAttachment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Service
public class SecretAttachmentMapper implements Mapper<SecretAttachmentDto, SecretAttachment>{
    @Override
    public SecretAttachment dtoToEntity(SecretAttachmentDto dto) {
        if (dto == null) {
            return null;
        }
        SecretAttachment secretAttachment = new SecretAttachment();
        secretAttachment.setId(dto.id());
        secretAttachment.setVrAttachmentDocument(dto.vrAttachmentDocument());
        secretAttachment.setDescription(dto.description());
        secretAttachment.setInsertingUser(dto.insertingUser());
        secretAttachment.setUpdatingUser(dto.updatingUser());
        secretAttachment.setInsertTime(dto.insertTime());
        secretAttachment.setUpdateTime(dto.updateTime());
        return secretAttachment;
    }

    @Override
    public Set<SecretAttachment> dtoListToEntities(List<SecretAttachmentDto> secretAttachmentDtos) {
        return secretAttachmentDtos.stream().map(this::dtoToEntity).collect(Collectors.toSet());
    }

    @Override
    public SecretAttachmentDto entityToDto(SecretAttachment entity) {
        if (entity == null) {
            return null;
        }
        return SecretAttachmentDto.builder()
                .id(entity.getId())
                .description(entity.getDescription())
                .vrAttachmentDocument(entity.getVrAttachmentDocument())
                .insertingUser(entity.getInsertingUser())
                .updatingUser(entity.getUpdatingUser())
                .insertTime(entity.getInsertTime())
                .updateTime(entity.getUpdateTime())
                .build();
    }

    @Override
    public List<SecretAttachmentDto> entitiesToDtoList(Set<SecretAttachment> entities) {
        return entities.stream().map(this::entityToDto).collect(Collectors.toList());
    }
}
