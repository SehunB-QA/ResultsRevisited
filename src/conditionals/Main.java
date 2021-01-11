// Sehun Babatunde

package conditionals;



public class Main {

	public static void main(String[] args) {
		         
		     
				
				
				
				

				System.out.println("Exam Results");
				
				ResultsRevisited  examgrades = new ResultsRevisited();
				
				examgrades.setPhysics(84);
		        examgrades.setChemistry(150);
				examgrades.setBiology(150);
			    examgrades.DisplayExamResults();
			    System.out.println("Your total exam percentage is: " + examgrades.CalculateExamResult() + "%");

	}

}
