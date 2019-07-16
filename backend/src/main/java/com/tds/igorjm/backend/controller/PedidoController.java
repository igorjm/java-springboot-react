package com.tds.igorjm.backend.controller;

import com.tds.igorjm.backend.entity.Cliente;
import com.tds.igorjm.backend.entity.Livro;
import com.tds.igorjm.backend.entity.Pedido;
import com.tds.igorjm.backend.service.pedido.PedidoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value= "/api/pedido")
public class PedidoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PedidoService pedidoService;

    @GetMapping(value= "/getAllPedidos")
    public Iterable<Pedido> getAllPedidos() {
        logger.debug("Getting all Pedidos.");
        return pedidoService.findAllPedidos();
    }

    @PostMapping(value= "/realizarPedido")
    public String realizarPedido(@RequestBody Livro livro, @RequestBody Cliente cliente) {
        pedidoService.realizarPedido(livro, cliente);
        return "livro records created.";
    }

}
