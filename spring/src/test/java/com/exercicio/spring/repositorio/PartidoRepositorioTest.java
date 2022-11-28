package com.exercicio.spring.repositorio;


import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.exercicio.spring.classe.Partido;





@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PartidoRepositorioTest {
	
	@Autowired
	private PartidoRepositorio repositorio;
	
	@Autowired
	private TestEntityManager em;

	
	
	@Test
	public void deveCarregarUmPartidoPeloSeuNome() {
		String nomePartido = "AB";
		
		Partido ab = new Partido();
		ab.setNome(nomePartido);
		em.persist(ab);
		
		List<Partido> partido = repositorio.findByNome(nomePartido);
		Assert.assertNotNull(partido);
		Assert.assertEquals(nomePartido, ((Partido) partido).getNome());
		
	}
	
}
