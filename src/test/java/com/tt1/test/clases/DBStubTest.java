package com.tt1.test.clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.DBStub;
import clases.ToDo;

class DBStubTest {
	private DBStub db;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		   db = new DBStub();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
	
		
        ToDo t = new ToDo();
        t.setNombre("Tarea1");
        
        
        String email = "test@test.com";

        // Act
        db.saveToDo(t);

        
        db.saveEmail(email);
        // Assert
        assertEquals(t,db.findToDo("Tarea1"));
        
        assertTrue(db.listEmails().contains(email));
	}

}
