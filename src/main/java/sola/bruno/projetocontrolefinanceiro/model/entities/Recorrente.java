package sola.bruno.projetocontrolefinanceiro.model.entities;

import java.io.Serializable;
import java.util.Date;

public class Recorrente implements Serializable {

    private String assinatura;
    private Double valor;
    private Date dataPagamento;

    public Recorrente() {
    }

    public Recorrente(String assinatura, Double valor, Date dataPagamento) {
        this.assinatura = assinatura;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Recorrente that = (Recorrente) o;

        return assinatura.equals(that.assinatura);
    }

    @Override
    public int hashCode() {
        return assinatura.hashCode();
    }

    @Override
    public String toString() {
        return "Recorrente{" +
                "assinatura='" + assinatura + '\'' +
                ", valor=" + valor +
                ", dataPagamento=" + dataPagamento +
                '}';
    }
}
