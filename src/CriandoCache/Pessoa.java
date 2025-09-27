package CriandoCache;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    Scanner sc = new Scanner(System.in);

    private int id;
    private String nome;
    private int idade;

    public int newId = 13;

    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nID: " + id + " Nome: " + this.nome + " \tIdade: " + this.idade;
    }

    public Pessoa cadastrarPessoa() {
        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade da pessoa: ");
        int idade = sc.nextInt();
        sc.nextLine();

        return new Pessoa(newId++, nome, idade);
    }

    public static String pesquisarPessoa(ArrayList<Pessoa> banco, ArrayList<Pessoa> cache) {
        Scanner sc = new Scanner(System.in);

        int id;

        System.out.println("Digite o ID da pessoa que deseja pesquisar: ");
        id = sc.nextInt();
        sc.nextLine();

        for (Pessoa value : cache) {
            if (id == value.getId()) {
                System.out.println("\nPessoa encontrada no cache: ");
                return "Nome: " + value.getNome() + "\nIdade: " + value.getIdade();
            }
        }

        for (Pessoa pessoa : banco) {
            if (id == pessoa.getId()) {
                System.out.println("\nPessoa buscada no banco e adicionada ao cache: ");
                cache.add(banco.get(id - 1));
                if (cache.size() > 10) {
                    cache.removeFirst();
                }
                return "Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade();
            }
        }

        sc.close();
        return "\nPessoa não encontrada";
    }
}
