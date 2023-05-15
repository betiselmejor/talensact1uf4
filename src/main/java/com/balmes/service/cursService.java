package com.balmes.service;

import com.balmes.model.Curs;
import com.balmes.repository.cursRepository;
import com.balmes.repository.EstudiantRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cursService implements crudService<Curs> {

/*	
  private List<Curs> cursos;

  public cursService() {
    cursos = new ArrayList<Curs>();

//instancio dos cursos i els afegir� a la llista
    Curs accesADades = new Curs(1, "Modul 6","Acces a dades",
        "https://ioc.xtec.cat/materials/FP/Recursos/fp_dam_m06_/web/fp_dam_m06_htmlindex/index.html");

    Curs programacioMultimedia = new Curs(2, "Modul 8","Programacio Multimedia",
        "https://ioc.xtec.cat/materials/FP/Recursos/fp_dam_m08_/web/fp_dam_m08_htmlindex/index.html");

    cursos.add(accesADades);
    cursos.add(programacioMultimedia);

  }
*/

	@Autowired
	private cursRepository repositori;

	@Autowired
	private EstudiantRepository estudiantRepository;
/*	
  public cursService() {
    repositori = new cursRepository();
}
*/

	public cursService(cursRepository cursRepository) {
		repositori = cursRepository;
	}

	public List<Curs> list() {
		List<Curs> listaCursos = repositori.findAll();
		listaCursos.forEach(curs -> curs.setEstudiants(estudiantRepository.getEstudiantsperCurs(curs.getCursId())));

		return listaCursos;
	}

	public Curs create(Curs t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Curs> get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Curs t, int id) {
		// TODO Auto-generated method stub

	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}
}
