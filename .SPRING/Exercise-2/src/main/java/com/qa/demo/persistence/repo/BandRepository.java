package com.qa.demo.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.qa.demo.persistence.domain.Band;

public interface BandRepository extends JpaRepository<Band, Long>
{
	
}
