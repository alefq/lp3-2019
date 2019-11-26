package py.edu.uca.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uca.lp3.domain.BaseInstitute;
import py.edu.uca.lp3.domain.MEC;
import py.edu.uca.lp3.service.MECService;

@RestController
@RequestMapping("/mec")
public class MECController {

	@Autowired
	private MECService mECService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BaseInstitute greetings(@PathVariable("id") Long id) {
        BaseInstitute baseInstitute = mECService.findById(id);
        return baseInstitute;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<MEC> list() {
        return mECService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody MEC institute) {
    	mECService.save(institute);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	mECService.delete(id);
    }

}