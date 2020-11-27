package person;

public class TestOverreiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.name = "Stiv";
		p.address = "Maria Liusa Str. 56";
		p.phoneNumber = "+359888935673";
		p.e_mail = "stiv_ad@gmail.com";
		
		Student stud = new Student();
		stud.name = "Monica";
		stud.address = "Bulgaria Bul. 78";
		stud.phoneNumber = "+359887156237";
		stud.e_mail = "mon_ka@abv.bg";
		stud.classStatus = "sophomore";
		
		Employee e = new Employee();
		e.name = "Mario";
		e.address = "Vitosha Bul. 60";
		e.phoneNumber = "+359889135238";
		e.e_mail = "marioSt@gmail.com";
		e.office = "OfficeOne";
		e.salary = 1050;
		
		Faculty f = new Faculty();
		f.name = "Georgy";
		f.address = "Han Krum Str. 14";
		f.phoneNumber = "+359884191945";
		f.e_mail = "go_go@abv.bg";
		f.office = "Kaufland";
		f.salary = 760;
		f.rank = "Cashier";
	
		Staff staff = new Staff();
		staff.name = "Nicoletta";
		staff.address = "Brqta Murmarevi Str. 32";
		staff.phoneNumber = "+359884112248";
		staff.e_mail = "nicky@yahoo.com";
		staff.office = "Expirian";
		staff.salary = 2300;
		staff.title = "Junior programmer";
		
		System.out.println(p.toString() + "\n\n" + stud.toString() + "\n\n" + 
				e.toString() + "\n\n" + f.toString() + "\n\n" + staff.toString());
	}

}
