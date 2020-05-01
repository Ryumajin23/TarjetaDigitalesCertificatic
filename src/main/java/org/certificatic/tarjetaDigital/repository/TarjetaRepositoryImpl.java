package org.certificatic.tarjetaDigital.repository;

import java.util.ArrayList;
import java.util.List;

import org.certificatic.tarjetaDigital.model.Tarjeta;


/*implemntar la interface de tarjeta repository implements TarjetaRepository
 * nosotros al implementar una interfas nos obliga
 * a implementar todos los contratos que estan definidos				
 * agrar metodos unimplemetn nos implemtan los dos contratos para usar funcionabilida
 * vamos a crear una lista estatica
 * 
 */
public class TarjetaRepositoryImpl implements TarjetaRepository {

	private static List<Tarjeta> tarjetasDigitales = new ArrayList<Tarjeta>();
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		System.out.println("Crear tarjeta:::: ");
		tarjetasDigitales.add(tarjeta);
		return null;
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		System.out.println("Obtener todas las tarjetas");
		return tarjetasDigitales;
		//usar bitacoras de logueo como log4j esto en 
		//aplicaciones JEE empresariales
	}
	
	
	

}
