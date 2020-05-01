package org.certificatic.tarjetaDigital.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.tarjetaDigital.model.Tarjeta;


//para indicar que esta interfase estara como un
//webservice

@WebService
public interface TarjetaService {
	
	Tarjeta crearTarjeta(Tarjeta  tarjeta); 
	
	/*Metodo para obtener todas las tarjetas
	 * @return 
	 * 
	 */
	List<Tarjeta> obtenerTodas();
	

}
