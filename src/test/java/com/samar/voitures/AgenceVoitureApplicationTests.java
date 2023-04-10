package com.samar.voitures;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.samar.voitures.entities.Voiture;
import com.samar.voitures.repos.VoitureRepository;

@SpringBootTest
class AgenceVoitureApplicationTests {

	@Autowired
	private VoitureRepository voitureRepository;
	
	@Test
	public void testCreateVoiture() {
		Voiture voit = new Voiture("Golf7",10001.500,new Date());
		voitureRepository.save(voit);
	}
	
	@Test
	public void testFindProduit()
	{
		Voiture v = voitureRepository.findById(1L).get();
		System.out.println(v);
	}
	
	@Test
	public void testUpdateProduit()
	{
		Voiture v = voitureRepository.findById(1L).get();
		v.setPrixVoiture(1000.0);
		voitureRepository.save(v);
	}
	
	@Test
	public void testDeleteProduit()
	{
		voitureRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousProduits()
	{
		List <Voiture> voit = voitureRepository.findAll();
		for (Voiture v : voit)
		{
			System.out.println(v);
		}
	}
}


