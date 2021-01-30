package com.app.client;

import java.util.Scanner;

import com.app.service.ConceptLearningCentreService;
import com.app.service.impl.ConceptLearningCentreServiceImpl;

public class OrgTool {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		ConceptLearningCentreService clcs = new ConceptLearningCentreServiceImpl();
		do {
			System.out.println("1] Add Course");
			System.out.println("2] Add Batch");
			System.out.println("3] Add Trainer");
			System.out.println("4] Add Student");
			System.out.println("5] View Course");
			System.out.println("6] View Batch");
			System.out.println("7] View Trainer");
			System.out.println("8] View Student");

			System.out.println("Select anyone option : ");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				clcs.addCourse();
				break;
			case 2:
				clcs.addBatch();
				break;
			case 3:
				clcs.addTrainer();
				break;
			case 4:
				clcs.addStudent();
				break;
			case 5:
				clcs.displayCourse();
				break;
			case 6:
				clcs.displayBatch();
				break;
			case 7:
				clcs.displayTrainer();
				break;
			case 8:
				clcs.displayStudent();
				break;
			default:
				System.out.println("You Entered Wrong input!!");
				System.exit(0);
				break;
			}
			System.out.println("Do you want to continue(y/n)");
			s = sc.next();
		} while (s.equals("y"));

	}

}
