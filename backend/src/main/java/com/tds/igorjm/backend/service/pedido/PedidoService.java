package com.tds.igorjm.backend.service.pedido;

import com.tds.igorjm.backend.entity.Cliente;
import com.tds.igorjm.backend.entity.Livro;
import com.tds.igorjm.backend.entity.Pedido;

public interface PedidoService {

    void realizarPedido(Livro livro, Cliente cliente);

    Iterable<Pedido> findAllPedidos();
}
