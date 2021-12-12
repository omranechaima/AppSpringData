package enig.tn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import enig.tn.model.Magasin;
@Repository
public interface IGesMagasin extends JpaRepository<Magasin, Integer >{

}
