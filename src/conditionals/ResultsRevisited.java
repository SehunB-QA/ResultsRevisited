package conditionals;

public class ResultsRevisited {
	
	int physicsMark;
	int chemistryMark; 
	int biologyMark;
	int totalMark; 
	int numOfSubjectsFailed;
	
	double totalExamPercentage;
	double physicsExamPercentage;
	double chemistryExamPercentage;
	double biologyExamPercentage;
	
	public void DisplayExamResults()
	{
		
		System.out.println("Physics Exam Mark : " + physicsMark);
		
		System.out.println("Chemistry Exam Mark : " + chemistryMark);
		
		System.out.println("Biology Exam Mark : " + biologyMark);
		
		totalMark = physicsMark + chemistryMark + biologyMark;
		
		
		System.out.println("Total Mark : " + totalMark);
		
		
	}
	
	
	public double CalculateExamResult() 
	{
		//total = (physics + chemistry + biology);
		
		physicsExamPercentage = (physicsMark  * 100 / 450);
		chemistryExamPercentage = (chemistryMark  * 100 / 450);
		biologyExamPercentage = (biologyMark  * 100 / 450);
		totalExamPercentage = (totalMark  * 100 / 450);
		
		//System.out.println("Your physics exam percentage is : " + physicsExamPercentage);
		//System.out.println("Your chemistry exam percentage is : " + chemistryExamPercentage);
		//System.out.println("Your biology exam percentage is : " + biologyExamPercentage);
	
		
		
		if(physicsExamPercentage < 60) {
			System.out.println("You have not passed the physics exam.");
			numOfSubjectsFailed++;
		}
		
		if(chemistryExamPercentage < 60) {
			System.out.println("You have not passed the chemistry exam.");
			numOfSubjectsFailed++;
		}
		
		if(biologyExamPercentage < 60) {
			System.out.println("You have not passed the biology exam.");
			numOfSubjectsFailed++;
		}
		
		
		if(totalExamPercentage < 60  || numOfSubjectsFailed >= 1 ){
			System.out.println("You have not passed your overall exams.");
			
		}
		
		
		return totalExamPercentage;
		
		
	}
	
	
	
	public int getPhysics() {
		return physicsMark;
	}


	public void setPhysics(int physics) {
		this.physicsMark = physics;
	}


	public int getChemistry() {
		return chemistryMark;
	}


	public void setChemistry(int chemistry) {
		this.chemistryMark = chemistry;
	}


	public int getBiology() {
		return biologyMark;
	}


	public void setBiology(int biology) {
		this.biologyMark = biology;
	}


	public int getTotal() {
		return totalMark;
	}


	public void setTotal(int total) {
		this.totalMark = total;
	}


	public double getTotalPercentage() {
		return totalExamPercentage;
	}


	public void setTotalExamPercentage(double totalPercentage) {
		this.totalExamPercentage = totalPercentage;
	}


}
