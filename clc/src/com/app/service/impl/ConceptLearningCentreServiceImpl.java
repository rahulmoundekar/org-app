package com.app.service.impl;

import java.util.Scanner;
import com.app.model.Batch;
import com.app.model.Course;
import com.app.service.ConceptLearningCentreService;

public class ConceptLearningCentreServiceImpl implements ConceptLearningCentreService {

	private String tabFormat = "\t|\t";
	private Course course = null;
	private Batch batch = null;
	Scanner sc = new Scanner(System.in);

	@Override
	public void addCourse() {
		course = new Course();
		System.out.println("Enter course id");
		course.setId(sc.nextInt());
		System.out.println("Enter Course Name");
		course.setName(sc.next());
	}

	@Override
	public void addBatch() {

		if (course != null) {
			batch = new Batch();
			System.out.println("Enter Batch Id");
			batch.setId(sc.nextInt());
			System.out.println("Enter Batch Name");
			batch.setBatchName(sc.next());

			batch.setCourse(course);
		} else {
			System.out.println("Course Not Found..Please add Course");
			addCourse();
		}

	}

	@Override
	public void addTrainer() {
		// Do nothing because of X and Y.

	}

	@Override
	public void addStudent() {
		// Do nothing because of X and Y.
	}

	@Override
	public void displayCourse() {
		System.out.println(course.getId() + "|\t" + course.getName());
	}

	@Override
	public void displayBatch() {

		System.out.println("Batch Id \t|\t Batch Name \t|\t Course Id \t|\t Course Name");
		if (batch != null && course != null) {
			Course c = batch.getCourse();
			System.out.println(
					batch.getId() + tabFormat + batch.getBatchName() + tabFormat + c.getId() + tabFormat + c.getName());

		}

	}

	@Override
	public void displayTrainer() {
		// Do nothing because of X and Y.

	}

	@Override
	public void displayStudent() {
		// Do nothing because of X and Y.

	}

}
