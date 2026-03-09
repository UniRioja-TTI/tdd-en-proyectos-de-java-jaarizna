package com.tt1.test.clases;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.ToDo;

class ToDoTest {
	private ToDo todo;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		   todo = new ToDo();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		 
        String nombre = "Preparar practica";
        String desc="preparacion de las herramientas de una practiva";
        Date f=new Date(2026,3,9);
        boolean compl=true;

        // Act
        todo.setNombre(nombre);
        todo.setDescripcion(desc);
        todo.setFechaLimite(f);
        todo.setCompletado(compl);

        // Assert
        assertEquals(nombre, todo.getNombre());
        assertEquals(desc, todo.getDescripcion());
        assertEquals(f, todo.getFechaLimite());
        assertEquals(nombre, todo.getNombre());
        assertEquals(compl,todo.isCompletado());

	}

}
