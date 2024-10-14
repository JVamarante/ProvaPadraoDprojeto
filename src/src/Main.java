public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro3 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.exibirLivrosDisponiveis();

        Usuario usuario1 = new Usuario("Ana");
        Usuario usuario2 = new Usuario("Bob");

        biblioteca.emprestarLivro(livro1, usuario1);
        biblioteca.emprestarLivro(livro2, usuario2);

        usuario1.exibirLivrosEmprestados();
        usuario2.exibirLivrosEmprestados();

        biblioteca.exibirLivrosDisponiveis();

        biblioteca.devolverLivro(livro1, usuario1);

        biblioteca.exibirLivrosDisponiveis();
    }
}
