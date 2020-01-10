package com.revature;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CurriculaServiceApplicationTests {

	
	
	@Test
	void contextLoads() {
		LinkedList<Integer> mockedList = mock(LinkedList.class);
		
		when(mockedList.contains(1)).thenReturn(true);
		
		assertEquals(mockedList.contains(1),true);
	}

}
