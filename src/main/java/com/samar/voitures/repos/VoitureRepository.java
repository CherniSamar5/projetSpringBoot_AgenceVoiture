package com.samar.voitures.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.samar.voitures.entities.Voiture;

public interface VoitureRepository extends JpaRepository <Voiture, Long>{

}
