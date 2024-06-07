package week5.day2;

import org.testng.annotations.Test;

public class LearnDependency extends BaseClass {
	
	@Test
	public  void CreateLead() {
		System.out.println("Create Lead");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = "week5.day2.LearnDependency.CreateLead")
	public  void DeleteLead() {
		System.out.println("Delete Lead");

	}
	@Test(dependsOnMethods = "week5.day2.LearnDependency.CreateLead, week5.day2.LearnDependency.DeleteLead")
	public void EditLead() {
		System.out.println("Edit Lead");

	}

}
