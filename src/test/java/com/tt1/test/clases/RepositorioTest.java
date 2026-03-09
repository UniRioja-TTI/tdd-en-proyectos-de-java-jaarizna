package com.tt1.test.clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.DBStub;
import clases.Repositorio;
import clases.ToDo;

class RepositorioTest {
	private Repositorio repo;
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
		repo=new Repositorio(db);
	}
	

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		 ToDo t = new ToDo();
	        t.setNombre("Comprar");

	        // Act
	        repo.guardarToDo(t);

	        // Assert
	        assertEquals(t,repo.buscarToDo("Comprar"));
	    }
	}


