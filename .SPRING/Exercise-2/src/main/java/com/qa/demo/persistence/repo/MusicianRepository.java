package com.qa.demo.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.qa.demo.persistence.domain.Musician;

public interface MusicianRepository extends JpaRepository<Musician, Long>
{
	
}
