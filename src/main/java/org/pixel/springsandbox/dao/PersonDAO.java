package org.pixel.springsandbox.dao;

import org.pixel.springsandbox.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private final Connection connection;

    @Autowired
    public PersonDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Person> getPeople() {
        String SQL = "SELECT * FROM person";
        List<Person> people = new ArrayList<>();

        try (final PreparedStatement ps = connection.prepareStatement(SQL)) {
            try (final ResultSet peopleResultSet = ps.executeQuery()) {
                while (peopleResultSet.next()) {
                    int id = peopleResultSet.getInt("id");
                    String nickname = peopleResultSet.getString("nickname");
                    String email = peopleResultSet.getString("email");

                    people.add(new Person(id, nickname, email));
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return people;
    }

    public Person getPerson(int id) {
        Person person = null;

        try (final PreparedStatement statement = connection.prepareStatement(
                "SELECT nickname, email FROM person WHERE id=?"
        )) {
            statement.setInt(1, id);
            try (final ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String nickname = resultSet.getString("nickname");
                    String email = resultSet.getString("email");

                    person = new Person(id, nickname, email);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return person;
    }

    public void save(Person person) {
        String SQL = "INSERT INTO person VALUES(default, ?, ?)";

        try (final PreparedStatement statement = connection.prepareStatement(SQL)) {
            statement.setString(1, person.getNickname());
            statement.setString(2, person.getEmail());

            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public void update(int id, Person person) {
        String SQL = "UPDATE person SET nickname = ?, email = ? WHERE id = ?";

        try (final PreparedStatement statement = connection.prepareStatement(SQL)) {
            statement.setString(1, person.getNickname());
            statement.setString(2, person.getEmail());
            statement.setInt(3, id);

            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void delete(int id) {
        String SQL = "DELETE FROM person WHERE id = ?";

        try (final PreparedStatement statement = connection.prepareStatement(SQL)) {
            statement.setInt(1, id);

            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}