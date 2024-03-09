package ec.com.security.service;

import org.springframework.stereotype.Service;

import ec.com.security.domain.Users;
import ec.com.security.repository.UserRepository;
import ec.com.security.service.dto.UserDto;
import ec.com.security.service.mapper.UsersMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public void saveUser(UserDto userDto) {
		Users users = UsersMapper.INSTANCE.toUsers(userDto);
		userRepository.save(users);
	}

}
