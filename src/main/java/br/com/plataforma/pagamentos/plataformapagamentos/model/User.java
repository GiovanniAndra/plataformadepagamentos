package br.com.plataforma.pagamentos.plataformapagamentos.model;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_paymentuser_payu")
public class User {

    @Column()
    private Long id;

    @Column()
    private String username;

    @Column()
    private String password;

    @Column()
    private String role;
}