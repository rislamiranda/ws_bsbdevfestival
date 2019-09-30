package com.djg.emprestimolivros;

import java.time.LocalDate;

public class Emprestimo {
    private Long codigo;
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livro, LocalDate dataEmprestimo){
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        setDataDevolucao();
    }

    public void imprimeEmprestimo(){
        System.out.println(" Usuário: " + usuario.getNomeCompleto());
        System.out.println(" Livro: " + livro.getTitulo());
        System.out.println(" Data de empréstimo: " + dataEmprestimo);
        System.out.println(" Data de devolução: " + dataDevolucao);
        System.out.println(" O prazo está vencido? " + emprestimoVencido());
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setDataDevolucao() {
        this.dataDevolucao = dataEmprestimo.plusDays(3);
    }

    public boolean emprestimoVencido() {
        if (LocalDate.now().isAfter(dataDevolucao)){
            return true;
        } else {
            return false;
        }
    }
}
