package com.hamed.pat.mapper;

import com.hamed.pat.dtos.*;
import com.hamed.pat.model.CategoryElement;
import com.hamed.pat.model.ContactPerson;
import com.hamed.pat.model.SecretAttachment;
import com.hamed.pat.model.SecretariatInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SecretariatInfoMapper implements Mapper<SecretariatInfoDto, SecretariatInfo> {
    private final Mapper<CategoryElementDto, CategoryElement> categoryElementMapper;

    private final Mapper<ContactPersonDto, ContactPerson> contactPersonMapper;

    private final Mapper<SecretAttachmentDto, SecretAttachment> secretAttachmentMapper;

    @Override
    public SecretariatInfo dtoToEntity(SecretariatInfoDto dto) {
        if (dto == null) {
            return null;
        }
        SecretariatInfo secretariatInfo = new SecretariatInfo();
        secretariatInfo.setDeliveryReceiptNo(dto.deliveryReceiptNo());
        secretariatInfo.setSystemPerson(dto.systemPerson());
        secretariatInfo.setDeliveryInfo(dto.deliveryInfo());
        secretariatInfo.setIndicatorNo(dto.indicatorNo());
        secretariatInfo.setDeliveryDate(dto.deliveryDate());
        secretariatInfo.setDeliveryType(categoryElementMapper.dtoToEntity(dto.deliveryType()));
        secretariatInfo.setPersonContactInfo(dto.personContactInfo());
        secretariatInfo.setSender(contactPersonMapper.dtoToEntity(dto.sender()));
        secretariatInfo.setSecretAttachments(secretAttachmentMapper.dtoListToEntities(dto.secretAttachSet()));
        secretariatInfo.setSendCode(dto.sendCode());
        secretariatInfo.setFromEmail(dto.fromEmail());
        secretariatInfo.setId(dto.id());
        secretariatInfo.setInsertingUser(dto.insertingUser());
        secretariatInfo.setUpdatingUser(dto.updatingUser());
        secretariatInfo.setInsertTime(dto.insertTime());
        secretariatInfo.setUpdateTime(dto.updateTime());
        return secretariatInfo;
    }

    @Override
    public Set<SecretariatInfo> dtoListToEntities(List<SecretariatInfoDto> secretariatInfoDtos) {
        return secretariatInfoDtos.stream().map(this::dtoToEntity).collect(Collectors.toSet());
    }

    @Override
    public SecretariatInfoDto entityToDto(SecretariatInfo entity) {
        if (entity == null) {
            return null;
        }
        return SecretariatInfoDto.builder()
                .deliveryReceiptNo(entity.getDeliveryReceiptNo())
                .systemPerson(entity.getSystemPerson())
                .deliveryInfo(entity.getDeliveryInfo())
                .indicatorNo(entity.getIndicatorNo())
                .deliveryDate(entity.getDeliveryDate())
                .deliveryType(categoryElementMapper.entityToDto(entity.getDeliveryType()))
                .personContactInfo(entity.getPersonContactInfo())
                .sender(contactPersonMapper.entityToDto(entity.getSender()))
                .secretAttachSet(secretAttachmentMapper.entitiesToDtoList(entity.getSecretAttachments()))
                .sendCode(entity.getSendCode())
                .fromEmail(entity.getFromEmail())
                .id(entity.getId())
                .insertingUser(entity.getInsertingUser())
                .updatingUser(entity.getUpdatingUser())
                .insertTime(entity.getInsertTime())
                .updateTime(entity.getUpdateTime())
                .build();
    }

    @Override
    public List<SecretariatInfoDto> entitiesToDtoList(Set<SecretariatInfo> entities) {
        return entities.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    @Autowired
    public SecretariatInfoMapper(Mapper<CategoryElementDto, CategoryElement> categoryElementMapper,
                                 Mapper<ContactPersonDto, ContactPerson> contactPersonMapper,
                                 Mapper<SecretAttachmentDto, SecretAttachment> secretAttachmentMapper) {
        this.categoryElementMapper = categoryElementMapper;
        this.contactPersonMapper = contactPersonMapper;
        this.secretAttachmentMapper = secretAttachmentMapper;
    }
}
