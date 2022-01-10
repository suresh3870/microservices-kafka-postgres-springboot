package com.bezkoder.spring.security.postgresql.controllers;

import com.bezkoder.spring.security.postgresql.models.User;
import com.bezkoder.spring.security.postgresql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 50000)
@RestController
@RequestMapping("/api/test")
public class TestController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/all")
	public String allAccess() {
		return "Welcome to Shurabhi Restaurant";
	}

	@GetMapping("/getAllUser")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public String userAccess() {
		return "Welcome to User Content";
	}

	@GetMapping("/mod")
	@PreAuthorize("hasRole('MODERATOR')")
	public String moderatorAccess() {
		return "Welcome to Moderator Board";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Welcome to Admin Board";
	}

	@GetMapping("/deletUser")
	@PreAuthorize("hasRole('ADMIN')")
	public String deleteUser(Long userID) {
		if (userRepository.existsById(userID)) {
			 userRepository.deleteById(userID);
			return "user deleted successfully";
		}
		else {return "issue while deleting user";}
	}

	@PostMapping("/updateUser")
	@PreAuthorize("hasRole('ADMIN')")
	public String updateUser(User user) {
		if (userRepository.existsByUsername(user.getUsername())) {
			userRepository.save(user);
			return "user updated successfully";
		}
		else {return "issue while updating user";}
	}

	@GetMapping("/getUser")
	@PreAuthorize("hasRole('ADMIN')")
	public Optional<User> getUser(Long userID) {
		if (userRepository.existsById(userID)) {
			return userRepository.findById(userID);

		}
		return null;
	}
}