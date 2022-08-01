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

import com.qa.demo.persistence.domain.Band;
import com.qa.demo.rest.dto.BandDTO;
import com.qa.demo.service.BandService;

@RestController
public class BandController
{
	private BandService bService;

	public BandController(BandService mService)
	{
		super();
		this.bService = mService;
	}
	
    @PostMapping("/createband")
    public BandDTO addBand(@RequestBody Band band)
    {
    	return this.bService.addBand(band);
    }
    
    @GetMapping("/getbands")
    public List<BandDTO> getAllBands()
    {
        return this.bService.getAllBands();
    }

    @PutMapping("/updateband")
    public BandDTO updatePerson(@PathParam("id") Long id, @RequestBody Band band)
    {
        return this.bService.updateBand(id, band);
    }

    @DeleteMapping("/deleteband/{id}")
    public boolean deleteBand(@PathVariable Long id)
    {
        return this.bService.deleteBand(id);
    }
}
