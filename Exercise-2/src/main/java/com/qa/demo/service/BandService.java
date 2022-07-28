package com.qa.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.qa.demo.exception.BandNotFoundException;
import com.qa.demo.persistence.domain.Band;
import com.qa.demo.persistence.repo.BandRepository;
import com.qa.demo.rest.dto.BandDTO;

@Service
public class BandService
{
	private BandRepository bRepo;
	private ModelMapper bMapper;
	
	public BandService(BandRepository bRepo, ModelMapper bMapper)
	{
		super();
		this.bRepo = bRepo;
		this.bMapper = bMapper;
	}

	// store band in DTO
	private BandDTO mapToDTO(Band b)
	{
		return this.bMapper.map(b, BandDTO.class);
	}
	
//	------------------CRUD------------------
	
	// ADD
	public BandDTO addBand(Band b)
	{
		Band saved =  this.bRepo.save(b);
        return this.mapToDTO(saved);
	}

	// GET ALL
	public List<BandDTO> getAllBands()
	{
		return this.bRepo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	// UPDATE
	public BandDTO updateBand(Long id, Band newBand)
	{
		Optional<Band> existingOptional  = this.bRepo.findById(id);
		Band existing = existingOptional.get();
		// replace
		existing.setName(newBand.getName());
		existing.setMusicians(newBand.getMusicians());
		// save
		Band updated = this.bRepo.save(existing);
		return this.mapToDTO(updated);
	}
	
	//DELETE
	public boolean deleteBand(Long id)
	{
		this.bRepo.deleteById(id);
        boolean exists = this.bRepo.existsById(id);
        return !exists;
	}
	
	// checks if an entity exists before applying functionality to it
	public BandDTO readById(Long id)
	{
        Band found = this.bRepo.findById(id).orElseThrow(BandNotFoundException::new);
        return this.mapToDTO(found);
    }
}
