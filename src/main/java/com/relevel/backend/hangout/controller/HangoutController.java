package com.relevel.backend.hangout.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HangoutController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

