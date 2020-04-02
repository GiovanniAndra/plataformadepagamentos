package br.com.plataforma.pagamentos.plataformapagamentos.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode 
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_paymentorganization_payor")
public class Organization {

    @Column()
    private Long id;

    @Column()
    private String email;
    
    @Column()
    private String address;
    
    @Column()
    private String addressNumber;
   
    @Column()
    private String complement;
    
    @Column()
    private String cep;
    
    @Column()
    private String contact;
    
    @Column()
    private String cellphone;
    
    @Column()
    private String telephone;
    
    @Column()
    @OneToMany
    private List<User> users;
    
}