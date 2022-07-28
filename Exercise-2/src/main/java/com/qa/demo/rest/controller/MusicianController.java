package com.qa.demo.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.demo.persistence.domain.Musician;
import com.qa.demo.rest.dto.MusicianDTO;
import com.qa.demo.service.MusicianService;

@RestController
public class MusicianController
{
	private MusicianService mService;

	public MusicianController(MusicianService mService)
	{
		super();
		this.mService = mService;
	}
	
    @PostMapping("/createmusician")
    public MusicianDTO addMusician(@RequestBody Musician musician)
    {
    	return this.mService.addMusician(musician);
    }
    
    @GetMapping("/getmusicians")
    public List<MusicianDTO> getAllMusicians()
    {
        return this.mService.getAllMusicians();
    }

    @PutMapping("/updatemusician")
    public MusicianDTO updatePerson(@PathParam("id") Long id, @RequestBody Musician musician)
    {
        return this.mService.updateMusician(id, musician);
    }

    @DeleteMapping("/deletemusician/{id}")
    public boolean deleteMusician(@PathVariable Long id)
    {
        return this.mService.deleteMusician(id);
    }
}
