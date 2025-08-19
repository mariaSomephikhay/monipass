package com.unla.monipass.exceptions;


public class VehicleException extends Exception {
	private static final long serialVersionUID = -8712610664365126958L;
	private final Type tipo;
	
	public enum Type {
        VEHICLE_NOT_FOUND("El vehiculo no fue encontrado."),
        BLOCK_VEHICLE("El vehiculo no tiene permitido el acceso.");
		
		private final String mensaje;
		
		Type(String mensaje) {
            this.mensaje = mensaje;
        }

        public String getMensaje() {
            return mensaje;
        }
    }
	
	
	public VehicleException(Type tipo) {
        super(tipo.getMensaje());
        this.tipo = tipo;
    }

    public Type getTipo() {
        return tipo;
    }
    
    public static VehicleException of(Type tipo) {
        return new VehicleException(tipo);
    }
}
