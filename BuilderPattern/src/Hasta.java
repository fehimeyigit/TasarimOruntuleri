
public class Hasta {

	  private int yas;
	  private int HastaId;
	  private long TcKimlikNo;
	  private String Adi;
	  private String Soyadi;
	  private String Adres;
	  private String Cinsiyet;
	  private String MedeniHal;
		
	  
	  public int getYas() {
			return yas;
		}
		public int getHastaId() {
			return HastaId;
		}
		public long getTcKimlikNo() {
			return TcKimlikNo;
		}
		public String getAdi() {
			return Adi;
		}
		public String getSoyadi() {
			return Soyadi;
		}
		public String getAdres() {
			return Adres;
		}
		public String getCinsiyet() {
			return Cinsiyet;
		}
		public String MedeniHal() {
			return MedeniHal;
		}
	  
	  
		@Override
	    public String toString() {
	        return "Doktor: " + this.TcKimlikNo +", "+ this.Adi + ", " + this.Soyadi + ", "  + this.HastaId+","+ this.yas +   ", " + this.Adres+ "," + this.Cinsiyet+","+this.MedeniHal;
	    }
	  
	  private Hasta(Builder builder) {
		    yas = builder.yas;
		    HastaId = builder.HastaId;
		    TcKimlikNo = builder.TcKimlikNo;
		    Adi = builder.Adi;
		    Adres = builder.Adres;
		    Soyadi = builder.Soyadi;
		    Cinsiyet = builder.Cinsiyet;
		    MedeniHal = builder.MedeniHal;
		
		  }
	  public static class Builder {
	    
	   
	    private int yas;
	    private int HastaId;
	    private long TcKimlikNo;
		private String Adi;
	    private String Soyadi;
		private String Cinsiyet;
		private String Adres;
		private String MedeniHal;
		  
		  
		  
	    public Builder(long TckimlikNo, String Adi, String Soyadi) {
	     
	      this.TcKimlikNo = TckimlikNo;
	      this.Adi = Adi;
	      this.Soyadi = Soyadi;
	     
	    }
        public Builder yas(int yas) {
            this.yas = yas;
            return this;
        }

        public Builder HastaId(int HastaId) {
            this.HastaId = HastaId;
            return this;
        }

        public Builder Cinsiyet(String Cinsiyet) {
            this.Cinsiyet = Cinsiyet;
            return this;
        }
      
        public Builder Adres(String Adres) {
            this.Adres = Adres;
            return this;
        }
	    public Builder MedeniHal(String MedeniHal) {
	    	this.MedeniHal = MedeniHal;
	      return this;
	    }
	 
	    
	    public Hasta build() {
	    	Hasta hasta = new Hasta(this);
            return hasta;
	    }
	  }
	 
	  
	  
	  
	
}
