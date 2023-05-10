<<<<<<< Updated upstream
package com.techmex.techmex.Data.Dao;public interface IMesasDao {
=======
package com.techmex.techmex.Data.Dao;

import com.techmex.techmex.Data.Entities.MesasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface IMesasDao extends JpaRepository<MesasModel, Integer> {

    Optional<MesasModel> findById(Integer id);

>>>>>>> Stashed changes
}
