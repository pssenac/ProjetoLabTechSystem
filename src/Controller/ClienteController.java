package Controller;

import Models.DAO;

public class ClienteController {

    public String salvarCliente(String nomeCliente, String cpfCliente, String rgCliente,
            String telCliente, String celCliente, String emailCliente, int fkEnderecoCliente,
            // DADOS ENDERECO 

            int idEndereco, String cep, String bairro, String logradouro, String complemento,
            String numero, String cidade, String estado) {

        DAO dao = new DAO();
        dao.cliente.setNomeCliente(nomeCliente);
        dao.cliente.setCpfCliente(cpfCliente);
        dao.cliente.setRgCliente(rgCliente);
        dao.cliente.setTelCliente(telCliente);
        dao.cliente.setCelCliente(celCliente);
        dao.cliente.setEmailCliente(emailCliente);
        dao.cliente.setFkEnderecoCliente(fkEnderecoCliente);

        dao.endereco.setIdendereco(cidade);
        dao.endereco.setBairro(bairro);
        dao.endereco.setCep(cep);
        dao.endereco.setCidade(cidade);
        dao.endereco.setComplemento(complemento);
        dao.endereco.setEstado(estado);
        dao.endereco.setLogradouro(logradouro);
        dao.endereco.setNumero(numero);

        String msgInclusao = dao.atualizar(DAO.INCLUSAOCLIENTE);
        return msgInclusao;
    }

    public String alterarCliente(String idCliente, String nomeCliente, String cpfCliente, String rgCliente,
            String telCliente, String celCliente, String emailCliente, int fkEnderecoCliente) {
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
