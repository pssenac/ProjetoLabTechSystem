
package controller;

import Models.DAO;

public class FuncionarioController {
    
    public String salvarFuncionario( String cnpjFornecedor, String nomeFornecedor, 
            String emailFornecedor,String representanteFornecedor, String emailRepresentante, String ramoFornecedor, 
            String telFornecedor, String celFornecedor, int fkEnderecoFornecedor ){
        DAO dao = new DAO();
        dao.fornecedor.setCnpjFornecedor(cnpjFornecedor);
        dao.fornecedor.setNomeFornecedor(nomeFornecedor);
        dao.fornecedor.setEmailFornecedor(emailFornecedor);
        dao.fornecedor.setRepresentanteFornecedor(representanteFornecedor);
        dao.fornecedor.setEmailRepresentante(emailRepresentante);
        dao.fornecedor.setRamoFornecedor(ramoFornecedor);
        dao.fornecedor.setTelFornecedor(telFornecedor);
        dao.fornecedor.setCelFornecedor(celFornecedor);
        dao.fornecedor.setFkEnderecoFornecedor(fkEnderecoFornecedor);
        String msgInclusao = dao.atualizar(DAO.INCLUSAOFUNCIONARIO);
        return msgInclusao;
    }
     
    public String alterarFuncionario(String IdFornecedor, String cnpjFornecedor, String nomeFornecedor, 
            String emailFornecedor,String representanteFornecedor, String emailRepresentante, String ramoFornecedor, 
            String telFornecedor, String celFornecedor, int fkEnderecoFornecedor ){
        DAO dao = new DAO();
        dao.fornecedor.setIdFornecedor(IdFornecedor);
        dao.fornecedor.setCnpjFornecedor(cnpjFornecedor);
        dao.fornecedor.setNomeFornecedor(nomeFornecedor);
        dao.fornecedor.setEmailFornecedor(emailFornecedor);
        dao.fornecedor.setRepresentanteFornecedor(representanteFornecedor);
        dao.fornecedor.setEmailRepresentante(emailRepresentante);
        dao.fornecedor.setRamoFornecedor(ramoFornecedor);
        dao.fornecedor.setTelFornecedor(telFornecedor);
        dao.fornecedor.setCelFornecedor(celFornecedor);
        dao.fornecedor.setFkEnderecoFornecedor(fkEnderecoFornecedor);
      
        String msgInclusao = dao.atualizar(DAO.ALTERACAOFUNCIONARIO);
        return msgInclusao;
    }
    
}
