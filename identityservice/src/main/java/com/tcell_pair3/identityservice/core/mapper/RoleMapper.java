package com.tcell_pair3.identityservice.core.mapper;

import com.tcell_pair3.identityservice.core.dtos.requests.RoleRequest;
import com.tcell_pair3.identityservice.core.dtos.responses.RoleWithUserResponse;
import com.tcell_pair3.identityservice.entities.Role;
import com.tcell_pair3.identityservice.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    Role roleFromRequest(RoleRequest request);

    @Mapping(source = "roleId", target = "id")
    Role toRole(RoleWithUserResponse roleWithUserResponse);

    @Mapping(source = "userId", target = "id")
    User toUser(RoleWithUserResponse roleWithUserResponse);
}
