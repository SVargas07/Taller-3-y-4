package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Avion;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {

 public double impuesto = 0.28;
 
	
	public int CalcularTarifa(Vuelo vuelo, Cliente cliente )
	{
		return 0;
		
	}
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente );
	
	
	
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	
	
	protected int calcularDistanciaVuelo(Ruta ruta)
	{
		return 0;
		
	}
	
	protected int calcularValorImpuestos(int costoBase) {
		
		return costoBase;
		
	}
	
	
	
	
}

