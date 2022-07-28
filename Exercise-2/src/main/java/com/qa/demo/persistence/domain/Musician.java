package com.qa.demo.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@NoArgsConstructor
//@Data
public class Musician
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @Size(min = 0, max = 55)
    private String name;
    @Min(0)
    @Max(12)
    private Integer strings;
    @Column(nullable = false)
    private String type;
    @ManyToOne
    private Band band;

//	------------------CONSTRUCTORS------------------
    public Musician(Long id, @Size(min = 0, max = 55) String name, @Min(0) @Max(12) Integer strings, String type, Band band)
	{
		super();
		this.id = id;
		this.name = name;
		this.strings = strings;
		this.type = type;
		this.band = band;
	}
    
	public Musician()
	{
		super();
	}
	
//	------------------GET;SET;------------------
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getStrings()
	{
		return strings;
	}
	public void setStrings(Integer strings)
	{
		this.strings = strings;
	}

	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}

	public Band getBand()
	{
		return band;
	}
	public void setBand(Band band)
	{
		this.band = band;
	}
    
    
    
}
