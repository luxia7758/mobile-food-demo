/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.example.demo.mobile.food.demo.infrastructure.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.example.demo.mobile.food.application.service.FacilityPermitService;
import org.example.demo.mobile.food.domain.FacilityPermit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author
 */
@RestController
@RequestMapping("/test")
@Tag(name = "test controller")
public class TestController {


	@Resource
	private FacilityPermitService demoService;



	@GetMapping("/find")
	@Operation(summary = "test", description = "test desc")
	public List<FacilityPermit> find() {

		return demoService.findAll();
	}


	@GetMapping("/findById")
	@Operation(summary = "test get one", description = "test get one desc")
	public Optional<FacilityPermit> findByLocationid(String locationid) {
		return demoService.findById(locationid);
	}

}
