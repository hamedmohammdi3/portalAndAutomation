package com.hamed.pat.mapper;

import com.hamed.pat.dtos.CategoryElementDto;
import com.hamed.pat.dtos.ContactPersonDto;
import com.hamed.pat.model.CategoryElement;
import com.hamed.pat.model.ContactPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ContactPersonMapper implements Mapper<ContactPersonDto, ContactPerson> {
    private final Mapper<CategoryElementDto, CategoryElement> categoryElementMapper;

    @Override
    public ContactPerson dtoToEntity(ContactPersonDto dto) {
        ContactPerson contactPerson = new ContactPerson();
        contactPerson.setId(dto.id());
        contactPerson.setLabor(dto.labor());
        contactPerson.setReferralrepriority(categoryElementMapper.dtoToEntity(dto.referralrepriority()));
        contactPerson.setVrPerson(dto.vrPerson());
        contactPerson.setVrPost(dto.vrPost());
        contactPerson.setDeadline(dto.deadline());
        contactPerson.setPersonType(dto.personType());
        contactPerson.setDeliveryDate(dto.deliveryDate());
        contactPerson.setVrOrganizationId(dto.vrOrganizationId());
        contactPerson.setVrPostId(dto.vrPostId());
        contactPerson.setSign(dto.sign());
        contactPerson.setSignature(dto.signature());
        contactPerson.setForActionFlow(categoryElementMapper.dtoToEntity(dto.forActionFlow()));
        contactPerson.setAdditionalDescription(dto.additionalDescription());
        contactPerson.setDeliveryInfo(dto.deliveryInfo());
        contactPerson.setDescription(dto.description());
        contactPerson.setPublicAttachment(dto.publicAttachment());
        contactPerson.setPublicDescription(dto.publicDescription());
        contactPerson.setOrder(dto.order());
        contactPerson.setRoleOutsideId(dto.roleOutsideId());
        contactPerson.setPersonDelType(categoryElementMapper.dtoToEntity(dto.personDeliveryType()));
        contactPerson.setJobTitle(dto.jobTitle());
        contactPerson.setVrOrganization(dto.vrOrganization());
        contactPerson.setVrTitle(dto.vrTitle());
        contactPerson.setRowType(dto.rowType());
        contactPerson.setActive(dto.active());
        contactPerson.setInsertTime(dto.insertTime());
        contactPerson.setUpdateTime(dto.updateTime());
        contactPerson.setInsertingUser(dto.insertingUser());
        contactPerson.setUpdatingUser(dto.updatingUser());
        return contactPerson;
    }

    @Override
    public Set<ContactPerson> dtoListToEntities(List<ContactPersonDto> contactPersonDtos) {
        return contactPersonDtos.stream().map(this::dtoToEntity).collect(Collectors.toSet());
    }

    @Override
    public ContactPersonDto entityToDto(ContactPerson entity) {
        return ContactPersonDto.builder()
                .id(entity.getId())
                .labor(entity.getLabor())
                .referralrepriority(categoryElementMapper.entityToDto(entity.getReferralrepriority()))
                .vrPerson(entity.getVrPerson())
                .vrPost(entity.getVrPost())
                .deadline(entity.getDeadline())
                .personType(entity.getPersonType())
                .deliveryDate(entity.getDeliveryDate())
                .vrOrganizationId(entity.getVrOrganizationId())
                .vrPostId(entity.getVrPostId())
                .sign(entity.getSign())
                .signature(entity.getSignature())
                .forActionFlow(categoryElementMapper.entityToDto(entity.getForActionFlow()))
                .deliveryInfo(entity.getDeliveryInfo())
                .additionalDescription(entity.getAdditionalDescription())
                .description(entity.getDescription())
                .publicAttachment(entity.getPublicAttachment())
                .publicDescription(entity.getPublicDescription())
                .order(entity.getOrder())
                .personDeliveryType(categoryElementMapper.entityToDto(entity.getPersonDelType()))
                .roleOutsideId(entity.getRoleOutsideId())
                .jobTitle(entity.getJobTitle())
                .vrOrganization(entity.getVrOrganization())
                .vrTitle(entity.getVrTitle())
                .rowType(entity.getRowType())
                .active(entity.getActive())
                .insertingUser(entity.getInsertingUser())
                .updatingUser(entity.getUpdatingUser())
                .insertTime(entity.getInsertTime())
                .updateTime(entity.getUpdateTime())
                .build();
    }

    @Override
    public List<ContactPersonDto> entitiesToDtoList(Set<ContactPerson> entities) {
        return entities.stream().map(this::entityToDto).collect(Collectors.toList());
    }
    @Autowired
    public ContactPersonMapper(Mapper<CategoryElementDto, CategoryElement> categoryElementMapper) {
        this.categoryElementMapper = categoryElementMapper;
    }
}
