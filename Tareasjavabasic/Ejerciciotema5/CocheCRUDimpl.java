import java.util.List;

public class CocheCRUDimpl implements CocheCRUD{

    String save = "Guardando";
    String findAll = "Buscar todo";
    String delete = "Borrando";


    @Override
    public void save(CocheCRUDimpl coche) {
    }

    @Override
    public List<CocheCRUDimpl> findAll() {
        return null;
    }

    @Override
    public void delete(CocheCRUD coche) {
    }

    @Override
    public String toString() {
        return "CocheCRUDimpl [save=" + save + ", findAll=" + findAll + ", delete=" + delete + "]";
    }

    


}
