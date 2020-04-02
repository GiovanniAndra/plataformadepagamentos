package br.com.plataforma.pagamentos.plataformapagamentos.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_account_organization_acor")
public class Account {

	@Id
	private Long id;
	
	@Column()
	private String accountNumber;
	
	@Column()
	private String verificationCode;
	
	@Column()
	private String validationDate;
	
	@Column()
	private String cardName;
	
	@Column
	private String identification;
	
	
}
