package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.IMC;

@RestController
@RequestMapping("/IMC")
public class IMCController {
	
	@GetMapping
	public ResponseEntity<String> CalcularIMC(@RequestBody IMC imc) {
		imc.setIMC(imc.getPeso(), imc.getAltura());
		return ResponseEntity.ok(imc.getResultado());
	}
}
