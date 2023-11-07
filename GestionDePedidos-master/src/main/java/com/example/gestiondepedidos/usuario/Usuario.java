package com.example.gestiondepedidos.usuario;

import com.example.gestiondepedidos.pedido.Pedido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario implements Serializable {
    /**
     * Identificación única del usuario.
     */
    private Integer id;

    /**
     * Nombre del usuario.
     */
    private String nombre;

    /**
     * Contraseña del usuario.
     */
    private String contrasenya;

    /**
     * Dirección de correo electrónico del usuario.
     */
    private String email;

    /**
     * ArrayList que almacena los pedidos asociados con el usuario.
     */
    private ArrayList<Pedido> pedidos;
}
