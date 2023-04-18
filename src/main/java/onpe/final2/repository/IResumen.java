package onpe.final2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import onpe.final2.model.Resumen;

@Repository
public interface IResumen extends JpaRepository<Resumen, Integer>{
	@Query(value="{call  sp_getResumen_DionisioNoriega}",nativeQuery = true)
	Resumen getResumen();
}
