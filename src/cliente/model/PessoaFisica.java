/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.model;

import java.util.Date;

public class PessoaFisica {
    private int idCliente;
    private String cpf;
    
    public int getId(){
        return idCliente;
    }
    public void setId(int id){
        idCliente = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
