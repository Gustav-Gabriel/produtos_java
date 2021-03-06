package com.example.demo.controller;

import com.example.demo.controller.dto.FichaTecnicaDTOIn;
import com.example.demo.controller.dto.FormaEntregaDTOIn;
import com.example.demo.controller.dto.ProdutoDTO;
import com.example.demo.controller.dto.ProdutoDTOIn;
import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Produto;
import com.example.demo.model.repository.ProdutoRepository;
import java.net.URI;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
  //url: localhost:8080/produtos/  
     @Autowired // This means to get the bean called userRepository
         // Which is auto-generated by Spring, we will use it to handle the data
      private ProdutoRepository produtoRepository;
    
     
     
	@GetMapping
	public List<ProdutoDTO> getProdutos(){
		
                 List<Produto> produtos = produtoRepository.findAll();
                 return ProdutoDTO.parse(produtos);		
	}
     
        @GetMapping("{id}")
	public ResponseEntity<ProdutoDTO> getProduto(@PathVariable Long id){
		
                    //procura no banco o registro com o id 
                  Optional<Produto> produtoOptional= produtoRepository.findById(id);
                 
                  //verificar se o produto está na tabela e foi retornado
                  if(produtoOptional.isPresent()){
                      
                      Produto produto = produtoOptional.get();
                      return ResponseEntity.ok().body(new ProdutoDTO(produto));
                  }
                  
                 return ResponseEntity.notFound().build();
	}
     
        
       
        @GetMapping("/nome")
	public List<ProdutoDTO> getProdutosPorNome(String nomeProduto){
            
                if(nomeProduto==null){
                    return getProdutos();
                }
		
                 List<Produto> produtos = produtoRepository.findByNome(nomeProduto);
                 return ProdutoDTO.parse(produtos);		
	}
        
        
        
        @GetMapping("/entregas")
	public List<ProdutoDTO> getProdutosPorEntregas(String formaEntrega){
            
                if(formaEntrega==null){
                    return getProdutos();
                }
		
                 List<Produto> produtos = produtoRepository.findByFormasEntrega_Nome(formaEntrega);
                 return ProdutoDTO.parse(produtos);		
	}
        
  /*     @PostMapping("/antigo")
       public String exemploPost(@RequestBody ProdutoDTOIn produto){
           
           Produto novo = produto.parseToProduto();
           produtoRepository.save(novo);
           
           return "cadastrou "+ novo.getNome();
       }
    */
        
       @PostMapping
       @Transactional
       public ResponseEntity<ProdutoDTO> cadastraProduto(
               @Valid @RequestBody ProdutoDTOIn produto,
               UriComponentsBuilder construtor){
           
           Produto novo = produto.parseToProduto();
           produtoRepository.save(novo);
           
           URI location = construtor.path("/produtos/{id}").buildAndExpand(novo.getIdProduto()).toUri();
            
           return ResponseEntity.created(location).body(new ProdutoDTO(novo));
       }
       
       @PutMapping("/{id}")
       @Transactional
       public ResponseEntity<ProdutoDTO> alteraProduto(
               @PathVariable Long  id, 
               @RequestBody ProdutoDTOIn produto,
               UriComponentsBuilder construtor){
           
           //recuperar do banco o objeto que possui o id
           Optional<Produto> produtoOptional = produtoRepository.findById(id);
           
           if(produtoOptional.isPresent()){
              Produto editavel  = produtoOptional.get();
                     
                if(produto.getNome()!=null){
                    editavel.setNome(produto.getNome());
                }
           
                if(produto.getPreco()>=0){
                    editavel.setPreco(produto.getPreco());
                }
           
                if(produto.getPrecoVenda()>=0){
                    editavel.setPrecoVenda(produto.getPrecoVenda());
                }
           
                if(produto.getFormasEntrega()!=null){
                editavel.setFormasEntrega(FormaEntregaDTOIn.parse(
                       produto.getFormasEntrega()));
                }
                if(produto.getUrlsImagens()!=null){
                    editavel.setUrlsImagens(produto.getUrlsImagens());
                }
           
                if(produto.getFichaTecnica() != null) {
                    editavel.setFichaTecnica(FichaTecnicaDTOIn.parse(produto.getFichaTecnica()));
                }
                    //URI location = construtor.path("/produtos/{id}").buildAndExpand(id).toUri();
            
                return ResponseEntity.ok().body(new ProdutoDTO(editavel));
           }
           return ResponseEntity.notFound().build();
           }
       
       @DeleteMapping("/{id}")
       @Transactional
       public ResponseEntity<?> removerProduto(@PathVariable Long id){
           
           Optional<Produto> produtoOptional = produtoRepository.findById(id);
           
           if(produtoOptional.isPresent()){
             produtoRepository.deleteById(id);
             return ResponseEntity.ok().build();
           }
           return ResponseEntity.notFound().build();
       }
       
       
}
