package ejcartas;

	class Carta {
	    private String destinatario;
	    private String ciudad;
	    private String pais;
	    
	    public Carta(String destinatario, String ciudad, String pais) {
	        this.destinatario = destinatario;
	        this.ciudad = ciudad;
	        this.pais = pais;
	    }
	    
	    @Override
	    public String toString() {
	        return destinatario + " - " + ciudad + ", " + pais;
	    }

		public String getCiudad() {
			return ciudad;
		}

		public String getPais() {
			return pais;
		}

		public String getDestinatario() {
			return destinatario;
		}
		
		
	
	    
}
