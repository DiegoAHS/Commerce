package ecommerce.model.dtos;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "customers")
public class Users {

    public void Users() {
    }

    public Users(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;
    private String name;
    private String lastname;
    private String tipo_doc;

    @ManyToMany
    @JoinTable(
            name = "fkusuario_roles",
            joinColumns = @JoinColumn(name = "fk_usuarios"),
            inverseJoinColumns = @JoinColumn(name = "fk_roles")
    )
    private List<Rols> roles;

    @ManyToOne
    @JoinColumn(name = "fk_privilegios")
    private Privilegies privilegies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public List<Rols> getRoles() {
        return roles;
    }

    public void setRoles(List<Rols> roles) {
        this.roles = roles;
    }

    public Privilegies getPrivilegies() {
        return privilegies;
    }

    public void setPrivilegies(Privilegies privilegies) {
        this.privilegies = privilegies;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", tipo_doc='" + tipo_doc + '\'' +
                ", roles=" + roles +
                ", privilegies=" + privilegies +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(id, users.id) && Objects.equals(name, users.name) && Objects.equals(lastname, users.lastname) && Objects.equals(tipo_doc, users.tipo_doc) && Objects.equals(roles, users.roles) && Objects.equals(privilegies, users.privilegies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastname, tipo_doc, roles, privilegies);
    }
}
