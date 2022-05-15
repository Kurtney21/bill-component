package za.ac.cput.Repository;

public interface IRepository<T,X> {
    T create(T t);
    T update(T t);
    T read(X id);
    boolean delete(X id);
}
