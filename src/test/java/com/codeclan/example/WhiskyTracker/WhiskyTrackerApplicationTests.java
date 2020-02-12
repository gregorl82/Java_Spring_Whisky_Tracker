package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	private WhiskyRepository whiskyRepository;

	@Autowired
	private DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetWhiskiesByYear(){
		List<Whisky> foundWhiskies = whiskyRepository.findByYear(2018);
		assertEquals(2, foundWhiskies.size());
	}

	@Test
	public void canGetDistilleriesByRegion(){
		List<Distillery> foundDistilleries = distilleryRepository.findDistilleryByRegion("Speyside");
		assertEquals(2, foundDistilleries.size());
	}

	@Test
	public void canGetWhiskiesByDistilleryAndAge(){
		List<Whisky> foundWhiskies = whiskyRepository.findByDistilleryNameAndAge("Glendronach", 15);
		assertEquals(1, foundWhiskies.size());
	}

}
