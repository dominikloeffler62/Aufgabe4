package de.hfu.residents.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.hfu.residents.domain.Resident;
import de.hfu.residents.service.BaseResidentService;
import de.hfu.residents.service.ResidentService;
import de.hfu.residents.service.ResidentServiceException;

public class ResidentRepositoryStub implements ResidentRepository{
	
	private List<Resident> residentListe;
	private BaseResidentService rs;
	Resident res1;
	Resident res2;
	Resident res3;
	Resident resWildcard;
	
	public ResidentRepositoryStub() {
		residentListe = new ArrayList<>();
		res1 = new Resident("Valentin","Reichenecker","Waldweg 1", "Tübingen" ,new Date());
		res2 = new Resident("Daniel", "Leer", "Am Talweg 1", "Villingen", new Date());
		res3 = new Resident("Dominik","Löffler","Unterer Weg 1","Freiburg", new Date());
		resWildcard = new Resident();
		resWildcard.setGivenName("*");
		
		residentListe.add(res1);
		residentListe.add(res2);
		residentListe.add(res3);
		residentListe.add(resWildcard);
	}
	

	
	@Override
	public List<Resident> getResidents() {	
		return residentListe;
	}
	

	
}
