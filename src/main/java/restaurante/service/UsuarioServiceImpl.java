package restaurante.service;

import java.util.List;
import restaurante.entity.Usuario;
import restaurante.model.IUsuarioModel;
import restaurante.model.UsuarioModelImpl;

public class UsuarioServiceImpl implements IUsuarioService {

    private IUsuarioModel model = new UsuarioModelImpl();

    @Override
    public void insertarRegistro(Usuario usuario) {
        model.insertarRegistro(usuario);
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        return model.obtenerRegistros();
    }

}
