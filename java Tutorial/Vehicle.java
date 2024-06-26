class PersonalInfo {

	int id = 1044;
	String name = "Ram";

}

abstract class priveteinfo {
	int atmPIN = 8521;
	int AccountNumber = 95864859321;
}

class ShowInfo {

	public static void main(String[] args) {
		PersonalInfo ref = new PersonalInfo();
		ref.PersonalInfo();
		ref.priveteinfo();
	}
}
