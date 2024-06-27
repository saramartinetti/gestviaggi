package it.tsp.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "turisti")
public class Turista implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idturista")
    private int idTurista;

    @NotBlank(message = "questo campo è obbligatorio") 
    @Size(max = 45, message = "questo campo può avere massimo 45 caratteri")
    @Column(length = 45, nullable = false)
    private String cognome;

    @NotBlank(message = "questo campo è obbligatorio")
    @Size(max = 45, message = "questo campo può avere massimo 45 caratteri")
    @Column(length = 45, nullable = false)
    private String nome;

    @Email
    @NotBlank(message = "questo campo è obbligatorio")
    @Size(max = 45, message = "questo campo può avere massimo 45 caratteri")
    @Column(length = 45, nullable = false)
    private String mail;

    private String tel;

    public int getIdTurista() {
        return idTurista;
    }

    public void setIdTurista(int idTurista) {
        this.idTurista = idTurista;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idTurista;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Turista other = (Turista) obj;
        if (idTurista != other.idTurista)
            return false;
        return true;
    }
}
