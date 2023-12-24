
package dao;

import java.util.ArrayList;

public interface ICRUD<T> {
    
    T create(T t);
    
    T readByID(int id);
    
    ArrayList<T> readAll();
    
    T update(T t);
    
    int delete(int id);
    
}
