package onpe.final2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onpe.final2.model.Resumen;
import onpe.final2.repository.IResumen;

@Service
public class ResumenServiceImp implements IResumenService{
	@Autowired
	IResumen iresumen;
	
	@Override
	public Resumen getResumen() {
		return iresumen.getResumen();
	}

}
