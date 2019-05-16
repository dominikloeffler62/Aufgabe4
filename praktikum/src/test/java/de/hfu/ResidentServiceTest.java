package de.hfu;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import de.hfu.residents.domain.Resident;
import de.hfu.residents.repository.ResidentRepository;
import de.hfu.residents.repository.ResidentRepositoryStub;
import de.hfu.residents.service.BaseResidentService;
import de.hfu.residents.service.ResidentServiceException;

public class ResidentServiceTest {
	
	@Test
	public void testUniqueResident() throws ResidentServiceException {
		
		ResidentRepository stub = new ResidentRepositoryStub();
		
		List<Resident> residentListe = new ArrayList<>();
		
		
		residentListe = stub.getResidents();
		
		BaseResidentService service = new BaseResidentService();
		
		service.setResidentRepository(stub);
		
		
		assertEquals(residentListe.get(0), service.getUniqueResident(residentListe.get(0)));
	}
	
	@Test(expected = ResidentServiceException.class)
	public void testUniqueResidentWildcard() throws ResidentServiceException {
		ResidentRepository stub = new ResidentRepositoryStub();
		
		List<Resident> residentListe = new ArrayList<>();
		
		
		residentListe = stub.getResidents();
		
		BaseResidentService service = new BaseResidentService();
		
		service.setResidentRepository(stub);
		
		service.getUniqueResident(residentListe.get(3));
	}
	
	@Test(expected = ResidentServiceException.class)
	public void testUniqueResidentVoid() throws ResidentServiceException {
		ResidentRepository stub = new ResidentRepositoryStub();
		
		List<Resident> residentListe = new ArrayList<>();
		
		residentListe = stub.getResidents();
		
		BaseResidentService service = new BaseResidentService();
		
		service.setResidentRepository(stub);
		
		Resident sollRes = new Resident();
		
		service.getUniqueResident(sollRes);
	}
	
	@Test
	public void testgetFillteredWildcard() {
ResidentRepository stub = new ResidentRepositoryStub();
		
		List<Resident> residentListe = new ArrayList<>();
		
		residentListe = stub.getResidents();
		
		BaseResidentService service = new BaseResidentService();
		
		service.setResidentRepository(stub);
		Resident sollRes = new Resident();
		sollRes.setGivenName("*");
		
		assertEquals(residentListe, service.getFilteredResidentsList(sollRes));		
	}

}
