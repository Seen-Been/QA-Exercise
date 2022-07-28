package com.qa.demo.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Band does not exist with that ID")
public class BandNotFoundException extends EntityNotFoundException
{

}
