package br.com.bb.conta;

import java.math.BigDecimal;

public class ContaCorrente {

  private String cpf;
  private String agencia;
  private String conta;
  private BigDecimal saldo;
  
  
  public ContaCorrente(String cpf, String agencia, String conta, BigDecimal saldo) {
    super();
    this.cpf = cpf;
    this.agencia = agencia;
    this.conta = conta;
    this.saldo = saldo;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public String getConta() {
    return conta;
  }

  public void setConta(String conta) {
    this.conta = conta;
  }

  public BigDecimal getSaldo() {
    return saldo;
  }

  public void setSaldo(BigDecimal saldo) {
    this.saldo = saldo;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
    result = prime * result + ((conta == null) ? 0 : conta.hashCode());
    result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
    ContaCorrente other = (ContaCorrente) obj;
    if (agencia == null) {
      if (other.agencia != null)
        return false;
    } else if (!agencia.equals(other.agencia))
      return false;
    if (conta == null) {
      if (other.conta != null)
        return false;
    } else if (!conta.equals(other.conta))
      return false;
    if (cpf == null) {
      if (other.cpf != null)
        return false;
    } else if (!cpf.equals(other.cpf))
      return false;
    return true;
  }

 

}
