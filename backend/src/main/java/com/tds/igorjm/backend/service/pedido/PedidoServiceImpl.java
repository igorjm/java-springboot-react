package com.tds.igorjm.backend.service.pedido;

import com.tds.igorjm.backend.entity.Cliente;
import com.tds.igorjm.backend.entity.Livro;
import com.tds.igorjm.backend.entity.Pedido;
import com.tds.igorjm.backend.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PedidoServiceImpl implements PedidoService{

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public void realizarPedido(Livro livro, Cliente cliente) {
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setLivro(livro);
        pedido.setData(new Date());

        pedidoRepository.save(pedido);
    }

    @Override
    public Iterable<Pedido> findAllPedidos() {
        return pedidoRepository.findAll();
    }

}
