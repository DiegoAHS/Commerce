package ecommerce.model.dtos;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

public class Privilegies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String prioridad;

    private String description;
    @OneToMany(mappedBy = "privilegies")
    private List<Users> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        description = description;
    }

    @Override
    public String toString() {
        return "Privilegies{" +
                "id=" + id +
                ", prioridad='" + prioridad + '\'' +
                ", Description='" + description + '\'' +
                ", users=" + users +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Privilegies that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(prioridad, that.prioridad) && Objects.equals(description, that.description) && Objects.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prioridad, description, users);
    }
}
