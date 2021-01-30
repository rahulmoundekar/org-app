package com.app.service.impl;

import java.util.Scanner;
import com.app.model.Batch;
import com.app.model.Course;
import com.app.model.Student;
import com.app.model.Trainer;
import com.app.service.ConceptLearningCentreService;

public class ConceptLearningCentreServiceImpl implements ConceptLearningCentreService {

	private Course course = null;
	private Batch batch = null;
	private Trainer trainer = null;
	private Student student = null;

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
		// TODO Auto-generated method stub

	}

	@Override
	public void addStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayCourse() {
		System.out.println(course.getId() + "|\t" + course.getName());
	}

	@Override
	public void displayBatch() {
		System.out.println("Batch Id \t|\t Batch Name \t|\t Course Id \t|\t Course Name");
		if (batch != null && course != null) {
			Course c=batch.getCourse();
			System.out.println(batch.getId() + "\t|\t" + batch.getBatchName() + "\t|\t" + c.getId() + "\t|\t"
					+ c.getName());

		}

	}

	@Override
	public void displayTrainer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayStudent() {
		// TODO Auto-generated method stub

	}

}
