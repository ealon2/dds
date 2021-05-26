package qmp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import qmp.dao.UsuarioDAO;
import qmp.model.Usuario;

import java.util.UUID;

@Service
public class UsuarioService {
    private final UsuarioDAO usuarioDAO;

    @Autowired
    public UsuarioService(@Qualifier("mockDAO") UsuarioDAO usuarioDAO){
        this.usuarioDAO = usuarioDAO;
    }

    public int addUsuario(Usuario usuario){
        return usuarioDAO.addUsuario(usuario);
    }
}
