package org.acme.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
    @Column(nullable = false)
    private String endereco;
    
    @Column(nullable = false)
    private String bairro;
    
    @Column(nullable = false)
    private String logradouro;
    
    @Column(nullable = false)
    private String complemento;
    
    @Column(nullable = false)
    private String cep;
    
    @Column(nullable = false)
    private int estado;
}
