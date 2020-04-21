package br.com.mariojp.exercise3;

public class Tarefa  implements Comparable<Tarefa> {
    private String desc;
    private int prioridade;

    public Tarefa(String desc, int prioridade) {
        this.desc = desc;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return desc;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public int compareTo(Tarefa tarefa) {
        if (this.prioridade < tarefa.getPrioridade()) {
            return -1;
        }
        if (this.prioridade > tarefa.getPrioridade()) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Tarefa other = (Tarefa) obj;
        return this.desc.equals(other.desc);
    }

    public boolean verificarPrioridade(Tarefa tarefa) {
        if(tarefa.getPrioridade() <= 0 || tarefa.getPrioridade() > 10) {
            return true;
        }else {
            return false;
        }
    }
}
