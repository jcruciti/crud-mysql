package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.MaxLength;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.utils.dao.BasicModel;

@Entity
@SuppressWarnings("serial")
public class Cliente extends Model implements BasicModel<Long> {
	@Id
	public Long id;
	
	@Basic
	@Required
	@MaxLength(256)
	@Column(length = 256)
	public String nome;
	
	@Basic
	public String email;
	
	@Basic
	@Required	
	public Date dtNascimento;
	
	public static Model.Finder<String, Cliente> find = new Model.Finder<String, Cliente>(String.class, Cliente.class);	
	public Cliente(){}
	
    public static List<Cliente> findAll(){
        return  Cliente.find.orderBy("id").findList();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public Long getKey() {
		return id;
	}
	public void setKey(Long key) {
		setId(key);
	}
}