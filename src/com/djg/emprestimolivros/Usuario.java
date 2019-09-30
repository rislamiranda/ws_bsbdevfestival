package com.djg.emprestimolivros;

public class Usuario {
    private Long codigo;
    private String nomeCompleto;
    private String dataNascimento;
    private String endereco;

    public Usuario(String nomeCompleto, String endereco){
        this.nomeCompleto = nomeCompleto;
        this.endereco = endereco;
    }

    public void imprimeUsuario(){
        System.out.println(" Nome: "+ getNomeCompleto());
        System.out.println(" Data de Nascimento: "+ getDataNascimento());
        System.out.println(" Endereço: "+ getEndereco());
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
