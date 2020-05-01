package org.certificatic.tarjetaDigital.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.tarjetaDigital.model.Tarjeta;
import org.certificatic.tarjetaDigital.repository.TarjetaRepository;
import org.certificatic.tarjetaDigital.repository.TarjetaRepositoryImpl;

/*
 * esta es la clase de imple,mentacion
 * vamos a implementar tarjeta service
 *  y este TarjetaService vamos a implemetar los metodos
 *   vamos a a grgar una annotacion @WebService y una propiedad
 *   endpointInterface 
 *   y ponemos el paquete y el nombre de la  clase de la interfaz
 *   
 *   TarjetaRepository tarjetaRepository;
 *   vamos a hacer algo que no se debe de hacer para spring por que ya lo hace
 *   para ver diferencia entre este proyecto y el sigueinte
 *   
 *   el endpointInterface es el punto final va ejecutar la funcion 
 *   la interface es el contratao es decir tenemos el metodo TarjetaService
 *   no tiene cuerpo solo el contrato lo que va recibir y lo que va aretornar
 *   y su implementacion y se especufica su funcionabilidad es un metodo con cuerpo 
 *   es parte del dideño
 *   
 */

@WebService(endpointInterface = "org.certificatic.tarjetaDigital.service.TarjetaService")
public class TarjetaServiceImpl implements TarjetaService {

	TarjetaRepository tarjetaRepository = new TarjetaRepositoryImpl();
	
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		return tarjetaRepository.crearTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		return tarjetaRepository.obtenerTodas();
	}

}
