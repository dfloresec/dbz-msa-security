package ec.com.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ec.com.security.service.UserService;
import ec.com.security.service.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

	private final UserService userService;

	@PostMapping(value = "/user")
	@ResponseStatus(HttpStatus.CREATED)
	private void create(@RequestBody UserDto user) {
		userService.saveUser(user);
	}

}
