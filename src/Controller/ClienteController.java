
package Controller;

import Models.DAO;


public class ClienteController {
    
     public String salvarCliente(String nomeCliente,String cpfCliente,String rgCliente,
             String telCliente,String celCliente,String emailCliente,int fkEnderecoCliente){
        DAO dao = new DAO();
        dao.cliente.setNomeCliente(nomeCliente);
        dao.cliente.setCpfCliente(cpfCliente);
        dao.cliente.setRgCliente(rgCliente);
        dao.cliente.setTelCliente(telCliente);
        dao.cliente.setCelCliente(celCliente);
        dao.cliente.setEmailCliente(emailCliente);
        dao.cliente.setFkEnderecoCliente(fkEnderecoCliente);
    
        String msgInclusao = dao.atualizar(DAO.INCLUSAOCLIENTE);
        return msgInclusao;
    }
     
    public String alterarCliente(String idCliente,String nomeCliente,String cpfCliente,String rgCliente,
             String telCliente,String celCliente,String emailCliente,int fkEnderecoCliente){
        DAO dao = new DAO();
        dao.cliente.setIdCliente(idCliente);
        dao.cliente.setNomeCliente(nomeCliente);
        dao.cliente.setCpfCliente(cpfCliente);
        dao.cliente.setRgCliente(rgCliente);
        dao.cliente.setTelCliente(telCliente);
        dao.cliente.setCelCliente(celCliente);
        dao.cliente.setEmailCliente(emailCliente);
        dao.cliente.setFkEnderecoCliente(fkEnderecoCliente);
        String msgInclusao = dao.atualizar(DAO.ALTERACAOCLIENTE);
        return msgInclusao;
    }
    
}
