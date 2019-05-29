package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class HelloController {

    public class Livro{
        Number isbn;
        String titulo;
        String autor;
        }
    
    @GetMapping("/livro")
    public String searchLivro() {
        return "lista de livros";
    }

    @PostMapping("/livro")
    public String createLivro() {
        return "Criado com sucesso";
    }

    @GetMapping("/livro/{livroId}")
    public String getLivroById(@PathVariable Long param){
        return "livro";
    }

    @DeleteMapping("/livro/{livroId}")
    public String deleteLivroById(@PathVaria) {
        return "Deletado com sucesso";
    }
    
}
