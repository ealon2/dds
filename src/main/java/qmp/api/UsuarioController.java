package qmp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import qmp.model.Usuario;
import qmp.service.UsuarioService;

@RequestMapping("api/v1/usuario")
@RestController
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public void addUsuario(@RequestBody Usuario usuario){
        this.usuarioService.addUsuario(usuario);
    }
}
