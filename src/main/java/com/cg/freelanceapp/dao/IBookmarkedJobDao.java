package com.cg.freelanceapp.dao;

import java.util.List;

import com.cg.freelanceapp.entities.BookmarkedJob;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Skill;

public interface IBookmarkedJobDao {

	BookmarkedJob save(BookmarkedJob job);

	void remove(BookmarkedJob job);

	BookmarkedJob findById(Long id);

	List<BookmarkedJob> findBookmarkedJobsBySkill(Skill skill, Freelancer freelancer);
	
}
