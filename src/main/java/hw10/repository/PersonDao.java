package hw10.repository;

import hw10.Person;
import hw10.Storage;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

import static hw10.repository.ConnectionManager.*;

public class PersonDao implements Dao {

    Connection connection = getConnection();
    QueryRunner run = new QueryRunner();


    @Override
    public void add(Person person) {

        try {
            run.update(connection,
                    "INSERT INTO `apps`.`person` (`name`, `age`, `email`) VALUES (?, ?, ?)",
                    person.getName(), person.getAge(),person.getEmail());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-----\nPerson " + person + " was successfully added into the Storage\n-----");
    }

    @Override
    public Storage getAll() {
        try {
            return run.query(connection, "SELECT * FROM person", new UserRowMapper());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Storage findPersonByName(String name) {
        try {
            return run.query(connection, "SELECT * FROM person WHERE name = ?", new UserRowMapper(), name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Storage findPersonByEmail(String email) {
        try {
            return run.query(connection, "SELECT * FROM person WHERE email = ?", new UserRowMapper(), email);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
