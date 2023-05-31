import java.util.List;

public interface CocheCRUD {

    void save(CocheCRUDimpl coche);

    List<CocheCRUDimpl> findAll(); 
        

    void delete (CocheCRUD coche);
    
}