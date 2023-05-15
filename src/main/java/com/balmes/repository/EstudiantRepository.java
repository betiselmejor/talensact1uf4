package com.balmes.repository;

import com.balmes.model.Curs;
import com.balmes.model.Estudiant;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class EstudiantRepository implements crudRepository<Estudiant> {

    public List<Estudiant> findAll() {
        // TODO Auto-generated method stub
        List<Estudiant> estudiantList = new ArrayList<>();
        cursRepository cursRepository = new cursRepository();
        final List<Curs> allCursos = cursRepository.findAll();
        estudiantList.add(new Estudiant(1, "ASH", "KETCHUM", allCursos.get(0)));
        estudiantList.add(new Estudiant(2, "WILLI", "REX", allCursos.get(1)));
        estudiantList.add(new Estudiant(3, "ANAKIN", "SKYWALKER", allCursos.get(0)));
        estudiantList.add(new Estudiant(4, "CHRISTIAN", "PERONA", allCursos.get(1)));
        estudiantList.add(new Estudiant(5, "GONZO", "MUPPET", allCursos.get(1)));
        return estudiantList;
    }

    public List<Estudiant> getEstudiantsperCurs(int cursId) {
        List<Estudiant> estudiantList = findAll();
        List<Estudiant> estudiantsPerCurs = new ArrayList<>();

        for (Estudiant estudiant : estudiantList) {
            if (estudiant.getCurs().getCursId() == cursId) {
                estudiantsPerCurs.add(estudiant);
            }
        }

        return estudiantsPerCurs;

    }
}
