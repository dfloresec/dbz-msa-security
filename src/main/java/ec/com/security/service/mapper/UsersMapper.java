package ec.com.security.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import ec.com.security.domain.Users;
import ec.com.security.service.dto.UserDto;

@Mapper(componentModel = "spring")
public interface UsersMapper {

	UsersMapper INSTANCE = Mappers.getMapper(UsersMapper.class);

	Users toUsers(UserDto in);

}
