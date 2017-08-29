package com.everis.alicante.courses.beca.summer17.FriendsNet.ControllerTests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces.EventController;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.implement.EventManagerImpl;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.EventManager;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class EventControllerImplTest {

	@InjectMocks
	private EventController eventController;

	@Mock
	private EventManager eventManager;

	private MockMvc mockMvc;

	private ObjectMapper mapper;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(eventController).build();
		this.mapper = new ObjectMapper();
		this.eventManager = new EventManagerImpl();
	}

	@Test
	public void testGetAllNoContent() throws Exception {
		// Arrange
		Mockito.when(eventManager.findAll()).thenReturn(null);
		// Act
		ResultActions perform = mockMvc.perform(get("/event"));
		// Assert
		perform.andExpect(status().isOk());
	}

	@Test
	public void testGetAllWithContent() throws Exception {
		// Arrange
		Event event = new Event();
		event.setName("Funeral");
		Event eventtwo = new Event();
		event.setName("Massacre");
		List<Event> events = new ArrayList<>();
		events.add(event);
		events.add(eventtwo);
		Mockito.when(eventManager.findAll()).thenReturn(events);
		// Act
		ResultActions perform = mockMvc.perform(get("/event"));
		// Assert
		perform.andExpect(status().isOk());
		perform.andExpect(content().json(mapper.writeValueAsString(events)));
	}
}
