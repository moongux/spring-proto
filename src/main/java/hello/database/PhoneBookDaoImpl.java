package hello.database;

import hello.database.model.PhoneEntry;
import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by mgkim on 2016. 2. 29..
 */
public class PhoneBookDaoImpl implements PhoneBookDao {

    @Override
    public boolean create(PhoneEntry entry) {
        return false;
    }

    @Override
    public boolean update(PhoneEntry entryToUpdate) {
        return false;
    }

    @Override
    public List<PhoneEntry> searchByNumber(String number) {
        return null;
    }

    @Override
    public List<PhoneEntry> searchByFirstName(String firstName) {
        return null;
    }

    @Override
    public List<PhoneEntry> searchByLastName(String lastName) {
        return null;
    }

    @Override
    public boolean delete(String number) {
        return false;
    }
}
