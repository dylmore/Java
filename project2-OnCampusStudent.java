package p02;
//********************************************************************************************************
//CLASS: OnCampusStudent (OnCampusStudent.java)
//
//DESCRIPTION
//Class to hold on campus student information
//
//COURSE AND PROJECT INFO
//CSE205 Object Oriented Programming and Data Structures, Fall 2020 B Session
//Project Number: Project02
//
//AUTHOR: Dylan Carey, docarey, docarey@asu.edu
//********************************************************************************************************

public class OnCampusStudent extends Student {
	public final int RESIDENT = 1;
	public final int NON_RESIDENT = 2;
	private int mResident;
	private double mProgramFee;
	
	public OnCampusStudent(String pId, String pFirstName, String pLastName) {
		super(pId, pFirstName, pLastName);
	}

	@Override
	public void calcTuition() {
		double t;
		if (getResidency() == RESIDENT)
			t = TuitionConstants.ONCAMP_RES_BASE;
		else
			t = TuitionConstants.ONCAMP_NONRES_BASE;
		// end if
		
		t = t + getProgramFee();
		
		if (getCredits() > TuitionConstants.ONCAMP_MAX_CREDITS) {
			t = t + (getCredits() - TuitionConstants.ONCAMP_MAX_CREDITS) *
					TuitionConstants.ONCAMP_ADD_CREDITS;
		}
		// end if
		
		setTuition(t);
	}
	
	/*
	 * Accessor method for mProgramFee
	 */
	public double getProgramFee() {
		return mProgramFee;
	}
	
	/*
	 * Accessor method for mResidency
	 */
	public int getResidency() {
		return mResident;
	}
	
	/*
	 * Mutator method for mProgramFee
	 */
	public void setProgramFee(double pProgramFee) {
		mProgramFee = pProgramFee;
	}
	
	/*
	 * Mutator method for mResident
	 */
	public void setResidency(int pResident) {
		mResident = pResident;
	}
}
