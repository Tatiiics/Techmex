<<<<<<< Updated upstream
package com.techmex.techmex.Data.Dao;public interface IUsuariosDao {
=======
package com.techmex.techmex.Data.Dao;

import com.techmex.techmex.Data.Entities.UsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUsuariosDao extends JpaRepository<UsuariosModel, Integer> {

    Optional<UsuariosModel> findById(Integer id);
>>>>>>> Stashed changes
}
