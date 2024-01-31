package ecommerce.model.dtos;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "roles")
public class Rols {

    public Rols() {
    }

    public Rols(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rols_id")
    private Integer id;
    private String rol;
    @ManyToMany(mappedBy = "roles")
    private List<Users> usuarios;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<Users> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Users> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Rols{" +
                "id=" + id +
                ", rol='" + rol + '\'' +
                ", usuarios=" + usuarios +
                '}';
    }
}
