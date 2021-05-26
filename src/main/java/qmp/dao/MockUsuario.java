package qmp.dao;

import org.springframework.stereotype.Repository;
import qmp.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("mockDAO")
public class MockUsuario implements UsuarioDAO{

    private static List<Usuario> DB = new ArrayList<>();

    @Override
    public int insertUsuario(UUID id, Usuario usuario) {
        DB.add(usuario);
        return 1;
    }

    @Override
    public int addUsuario(Usuario usuario) {
        return 0;
    }
}
