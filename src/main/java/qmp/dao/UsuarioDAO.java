package qmp.dao;

import qmp.model.Usuario;

import java.util.UUID;

public interface UsuarioDAO {
    int insertUsuario(UUID id, Usuario usuario);

    default int addUsuario (Usuario usuario){
        return insertUsuario(UUID.randomUUID(),usuario);
    }
}
