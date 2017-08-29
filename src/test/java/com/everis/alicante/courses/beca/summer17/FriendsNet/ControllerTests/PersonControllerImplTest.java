package com.everis.alicante.courses.beca.summer17.FriendsNet.ControllerTests;

import com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces.PersonController;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.implement.PersonManagerImpl;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.PersonManager;
import com.fasterxml.jackson.databind.ObjectMapper;
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

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class PersonControllerImplTest {

	@InjectMocks
	private PersonController personController;

	@Mock
	private PersonManager personManager;

	private MockMvc mockMvc;

	private ObjectMapper mapper;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(personController).build();
		this.mapper = new ObjectMapper();
		this.personManager = new PersonManagerImpl();
	}

	@Test
	public void testGetAllNoContent() throws Exception {
		// Arrange
		Mockito.when(personManager.findAll()).thenReturn(null);
		// Act
		ResultActions perform = mockMvc.perform(get("/person"));
		// Assert
		perform.andExpect(status().isOk());
	}

	@Test
	public void testGetAllWithContent() throws Exception {
		// Arrange
		Person persona = new Person();
		persona.setName("roy");
		Person personb = new Person();
		persona.setName("marth");
		List<Person> persons = new ArrayList<>();
		persons.add(persona);
		persons.add(personb);
		Mockito.when(personManager.findAll()).thenReturn(persons);
		// Act
		ResultActions perform = mockMvc.perform(get("/person"));
		// Assert
		perform.andExpect(status().isOk());
		perform.andExpect(content().json(mapper.writeValueAsString(persons)));
	}
}
