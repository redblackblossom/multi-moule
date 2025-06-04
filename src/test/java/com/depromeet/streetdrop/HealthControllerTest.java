package com.depromeet.streetdrop;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.depromeet.streetdrop.global.common.controller.HealthController;

@WebMvcTest(controllers = {HealthController.class})
@DisplayName("[API][Controller] 상태 체크용 API 테스트")
class HealthControllerTest {

	@Autowired
	MockMvc mvc;

	@Test
	@DisplayName("[GET] 상태 체크용 API 테스트")
	void testHealthCheckTest()throws Exception {
		mvc.perform(
			get("/health")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
		)
			.andExpect(status().isOk())
			.andExpect(content().string("OK"));
	}
}