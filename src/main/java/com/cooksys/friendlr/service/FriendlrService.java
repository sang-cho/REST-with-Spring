package com.cooksys.friendlr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cooksys.friendlr.dto.PersonWithIdDto;
import com.cooksys.friendlr.pojo.Person;

@Service
public class FriendlrService {

	List<Person> allPeople = new ArrayList<Person>();
	
	public List<Person> getAllPersons() {
		return allPeople;
	}

	public Person getPerson(Integer id) {
		return allPeople.get(id);
	}

	public Person createPerson(Person person) {
		person.setId(allPeople.size());
		allPeople.add(person);
		return person;
	}

	public Person addFriend(Integer personId, Integer friendId) {
		if(personId >= allPeople.size() || friendId >= allPeople.size())
			throw new RuntimeException("That person does not exist!");
		
		allPeople.get(personId).getFriends().add(allPeople.get(friendId));
		return allPeople.get(personId);
	}

	public List<Person> getFriends(Integer personId) {
		return allPeople.get(personId).getFriends();
	}

}
