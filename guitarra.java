public  class  Guitarra {
    private  String numeroSerie, fabricante, modelo, tipo, madeira;
     preco duplo privado ;
    public  Guitarra ( String  numeroSerie , String  fabricante , String  modelo , String  tipo , String  madeira , double  preco ) {
      isso . numeroSerie = numeroSerie;
      isso . fabricante = fabricante;
      isso . modelo = modelo;
      isso . tipo = tipo;
      isso . madeira = madeira;
      isso . preco = preco;
    }
  
    public  String  getNumeroSerie () {
      return numeroSerie;
    }
  
    public  void  setNumeroSerie ( String  numeroSerie ) {
      isso . numeroSerie = numeroSerie;
    }
  
    public  String  getFabricante () {
      return fabricante;
    }
  
    public  void  setFabricante ( String  fabricante ) {
      isso . fabricante = fabricante;
    }
  
    public  String  getModelo () {
      return modelo;
    }
  
    public  void  setModelo ( String  modelo ) {
      isso . modelo = modelo;
    }
  
    public  String  getTipo () {
      return tipo;
    }
  
    public  void  setTipo ( String  tipo ) {
      isso . tipo = tipo;
    }
  
    public  String  getMadeira () {
      voltar madeira;
    }
  
    public  void  setMadeira ( String  madeira ) {
      isso . madeira = madeira;
    }
  
    public  double  getPreco () {
      return preco;
    }
  
    public  void  setPreco ( double  preco ) {
      isso . preco = preco;
    } 
    public  static  void  main ( String [] args ) {
      Guitarra minhaGuitarra =  new  Guitarra ( " 01058704 " , " Fender " , " Telecaster " , " elétrica " , " mogno " , 1500 );

      Sistema . para fora . println (minhaGuitarra . getNumeroSerie ());
      Sistema . para fora . println (minhaGuitarra . getFabricante ());
      Sistema . para fora . println (minhaGuitarra . getModelo ());
      Sistema . para fora . println (minhaGuitarra . getTipo ());
      Sistema . para fora . println (minhaGuitarra . getMadeira ());
      Sistema . para fora . println (minhaGuitarra . getPreco ());
    }
  }
