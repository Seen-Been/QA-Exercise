package com.qa.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.qa.demo.exception.MusicianNotFoundException;
import com.qa.demo.persistence.domain.Musician;
import com.qa.demo.persistence.repo.MusicianRepository;
import com.qa.demo.rest.dto.MusicianDTO;

@Service
public class MusicianService
{
	private MusicianRepository mRepo;
	private ModelMapper mMapper;
	
	public MusicianService(MusicianRepository mRepo, ModelMapper mMapper) //constructor for repository. shortens CRUD method length.
	{
		super();
		this.mRepo = mRepo;
		this.mMapper = mMapper;
	}
	
	// store musician in DTO
	private MusicianDTO mapToDTO(Musician musician)
	{
		return this.mMapper.map(musician, MusicianDTO.class);
	}
	
//	------------------CRUD------------------
	
	// ADD
	public MusicianDTO addMusician(Musician musician)
	{
		 Musician saved =  this.mRepo.save(musician);
	     return this.mapToDTO(saved);
	}

	// GET ALL
	public List<MusicianDTO> getAllMusicians()
	{
		return this.mRepo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	// UPDATE
	public MusicianDTO updateMusician(Long id, Musician newMusician)
	{
		Optional<Musician> existingOptional  = this.mRepo.findById(id);
		Musician existing = existingOptional.get();
		// replace
		existing.setName(newMusician.getName());
		existing.setStrings(newMusician.getStrings());
		existing.setType(newMusician.getType());
		existing.setBand(newMusician.getBand());
		// save
		Musician updated = this.mRepo.save(existing);
		return this.mapToDTO(updated);
	}
	
	//DELETE
	public boolean deleteMusician(Long id)
	{
		this.mRepo.deleteById(id);
        boolean exists = this.mRepo.existsById(id);
        return !exists;
	}
	
	// checks if an entity exists before applying functionality to it
	public MusicianDTO readById(Long id)
	{
        Musician found = this.mRepo.findById(id).orElseThrow(MusicianNotFoundException::new);
        return this.mapToDTO(found);
    }
}
