package com.tt1.test.clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.MailerStub;

class MailerStubTest {
	 private MailerStub mailer;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		 mailer = new MailerStub();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		 String email = "test@test.com";
	        String mensaje = "Hola";

	        // Act
	        boolean resultado = mailer.enviar(email, mensaje);

	        // Assert
	        assertTrue(resultado);
	}

}
