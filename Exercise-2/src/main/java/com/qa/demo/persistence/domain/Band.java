package com.qa.demo.persistence.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@NoArgsConstructor
//@Data
public class Band
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "band", fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Musician> musicians = new ArrayList<>();
    
//	------------------CONSTRUCTORS------------------
	public Band(Long id, String name, List<Musician> musicians)
	{
		super();
		this.id = id;
		this.name = name;
		this.musicians = musicians;
	}
	public Band()
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

	public List<Musician> getMusicians()
	{
		return musicians;
	}
	public void setMusicians(List<Musician> musicians)
	{
		this.musicians = musicians;
	}
}
