package com.produtos.apiresttreino.repository;

import com.produtos.apiresttreino.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findById(long id);
}
