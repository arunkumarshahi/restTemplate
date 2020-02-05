package com.sg.api.config;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;

import com.sg.api.model.User;
import com.sg.api.service.ApiService;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Controller
@Slf4j
public class UserController {
	private final ApiService userService;

	public UserController(ApiService userService) {
		this.userService = userService;
	}

	@GetMapping({ "/" })
	public String getHomePage() {

		return "index";
	}

	@PostMapping("/users")
	public String fetchUserList(Model model) {
		//@ModelAttribute Integer limit, 
		int limit=10;
        log.info("use limit -->"+limit);
//		List<User> userList = userService.getUsers(limit);
		model.addAttribute("users", userService.getUsers(Mono.just(limit)));
		return "userList";
	}

}
