package ec.com.security.controller.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Users {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	String usermane;

	String email;

	String password;

}
