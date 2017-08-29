package com.everis.alicante.courses.beca.summer17.FriendsNet.DAOTests;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces.PersonController;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class PersonDAOImplTest {
	

	//findAll, findById, create, delete
	
//	Iterable<E> findAll();
//	
//	E findById(ID id);
//	
//	E save(E e);
//	
//	void remove (E e);

	
	@InjectMocks
    private PersonController personController;

    @Mock
    
    private MockMvc mockMvc;

    private ObjectMapper mapper;

	private PersonDAOImplTest expectedPersonDAOImpl;





}
