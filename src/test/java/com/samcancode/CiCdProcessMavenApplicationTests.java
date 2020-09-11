package com.samcancode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CiCdProcessMavenApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void applicationContextTest() {
		CiCdProcessMavenApplication.main(new String[] {});
	}

}
