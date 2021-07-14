package p02;
//********************************************************************************************************
//CLASS: OnCampusStudent (OnCampusStudent.java)
//
//DESCRIPTION
//Class to hold online student information
//
//COURSE AND PROJECT INFO
//CSE205 Object Oriented Programming and Data Structures, Fall 2020 B Session
//Project Number: Project02
//
//AUTHOR: Dylan Carey, docarey, docarey@asu.edu
//********************************************************************************************************

public class OnlineStudent extends Student {
	private boolean mTechFee;
	/*
	 * Constructor for OnlineStudent
	 */
	public OnlineStudent(String pId, String pFirstName, String pLastName) {
		super(pId, pFirstName, pLastName);
	}
	
	/*
	 * Tuition calculator for OnlineStudent
	 */
	@Override
	public void calcTuition() {
		double t = getCredits() * TuitionConstants.ONLINE_CREDIT_RATE;
		
		if (getTechFee() == true)
			t += TuitionConstants.ONLINE_TECH_FEE;
		// end if
		
		setTuition(t);
	}
	
	/*
	 * Accessor method for mTechFee
	 */
	public boolean getTechFee() {
		return mTechFee;
	}
	
	/*
	 * Mutator method for mTechFee
	 */
	public void setTechFee(boolean pTechFee) {
		mTechFee = pTechFee;
	}

}
