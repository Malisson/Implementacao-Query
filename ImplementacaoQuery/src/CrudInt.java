import java.util.List;
import java.util.Optional;

public interface CrudInt<C>  {

    List<C> findAll();
    Optional<C> save(C entity);
    Optional<C> findById(long id);
    void delete(C entity);
    void deleteById(long id);
    long count();

}