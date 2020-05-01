package org.certificatic.tarjetaDigital.repository;

import java.util.List;

import org.certificatic.tarjetaDigital.model.Tarjeta;

public interface TarjetaRepository {
	
	//una interface es una clase 100% abstrcta y nos sirve
	//para defibir contratos que contratos va a tener nuestro repositorioo
	
	
	/*Metodo para crear una tarjeta nueva
	 * @param tarjeta
	 * @return tarjeta creada
	 */
	Tarjeta crearTarjeta(Tarjeta  tarjeta); 
	
	/*Metodo para obtener todas las tarjetas
	 * @return 
	 * 
	 */
	List<Tarjeta> obtenerTodas();
	

}
