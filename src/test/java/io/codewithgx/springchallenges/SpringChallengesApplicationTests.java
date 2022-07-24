package io.codewithgx.springchallenges;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringChallengesApplicationTests {

	@Autowired
	protected SpringChallengesApplication application;

	@Test
	void contextLoads() {
		assertThat(application).isNotNull();
	}

}
