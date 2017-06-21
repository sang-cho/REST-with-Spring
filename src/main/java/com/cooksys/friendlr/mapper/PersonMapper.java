package com.cooksys.friendlr.mapper;

import org.mapstruct.Mapper;

import com.cooksys.friendlr.dto.PersonSansIdDto;
import com.cooksys.friendlr.dto.PersonWithIdDto;
import com.cooksys.friendlr.pojo.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {
	
	PersonSansIdDto toPersonSansId(Person p);
	
	Person toPerson(PersonSansIdDto dto);
	
	PersonWithIdDto toPersonWithId(Person p);
	
	Person toPerson(PersonWithIdDto dto);

}
