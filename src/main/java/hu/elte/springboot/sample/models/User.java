package hu.elte.springboot.sample.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @Column(unique = true)
    private String email;

    @Nullable
    private Timestamp email_verified_at;

    private String password;

    private boolean is_librarian = false;

    private String remember_token;

    private Timestamp created_at;

    private Timestamp updated_at;

    @Override
    public String toString() {
        return String.format("User[id=%d, name='%s', email='%s', email_verified_at=%s, is_librarian=%s, remember_token=%s, created_at=%s, updated_at=%s]",
                id,
                name,
                email,
                email_verified_at == null ? "null" : email_verified_at.toString(),
                is_librarian,
                remember_token,
                created_at.toString(),
                updated_at.toString());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Nullable
    public Timestamp getEmail_verified_at() {
        return email_verified_at;
    }

    public void setEmail_verified_at(@Nullable Timestamp email_verified_at) {
        this.email_verified_at = email_verified_at;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIs_librarian() {
        return is_librarian;
    }

    public void setIs_librarian(boolean is_librarian) {
        this.is_librarian = is_librarian;
    }

    public String getRemember_token() {
        return remember_token;
    }

    public void setRemember_token(String remember_token) {
        this.remember_token = remember_token;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
