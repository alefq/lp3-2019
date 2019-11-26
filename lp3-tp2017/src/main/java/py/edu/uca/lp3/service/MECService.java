package py.edu.uca.lp3.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uca.lp3.domain.MEC;
import py.edu.uca.lp3.repository.MECRepository;

@Service
public class MECService {

	@Autowired
	private MECRepository mECRepository;
	
	public MEC findById(Long id) {
		MEC institute = mECRepository.findOne(id);
		return institute;
	}

	public List<MEC> findAll() {
		List<MEC> institutes = new ArrayList<>();
		Iterator<MEC> iteratorInstitutes = mECRepository.findAll().iterator();
		while(iteratorInstitutes.hasNext()) {
			institutes.add(iteratorInstitutes.next());
		}
		return institutes;
	}

	public void save(MEC institute) {
		mECRepository.save(institute);
	}

	public void delete(Long id) {
		mECRepository.delete(id);
	}

}
