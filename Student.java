class Student {
	String index;
	String firstName;
	String lastName;

	int[] labPoints;

	//TODO constructor
	public Student(String index, String firstName, String lastName, int[] labPoints){
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}
	//TODO seters & getters

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int[] getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(int[] labPoints) {
		this.labPoints = labPoints;
	}

	public double getAverage() {
		//TODO
		int avg=0;
		for (int point: labPoints) {
			avg += point;
		}

		avg /= labPoints.length;
		return avg;
	}

	public boolean hasSignature() {
		//TODO
		int count=0;
		for (int point: labPoints) {
			if (point != null) count++;
		}

		if(count >= 8) return true;
		return false;
	}
}
