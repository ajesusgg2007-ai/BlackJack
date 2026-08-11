import java.util.Random;

public class carta {

    private String nombre;
    private int valor;
    private String palo;
    private int nuevacarta;
    private static Random numero= new Random();

    public carta() 
    {
        this.nombre = "";
        this.valor = 0;
        this.palo= "";
        this.nuevacarta=0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    public String getPalo()
    {
        return palo;
    }

    public int getNuevacarta() 
    {
        return nuevacarta;
    }

    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public void setValor(int valor)
    {
        this.valor = valor;
    }

    public void setPalo(String palo)
    {
        this.palo = palo;
    }

    public String toString()
    {
        return this.nombre+ " " + this.palo;
    }


    public void asignarCarta() {
        valor = numero.nextInt(10) + 1;

        if (valor == 1) nombre = "As de";
        else if (valor == 10) 
        {
            switch (numero.nextInt(2)) {
                case 0:
                    
                nombre = "Rey ";

                    break;

                case 1:

                nombre = "Reina ";

                break;

                case 2:

                nombre = "Jota ";
                
                break;
            }
        }
        
        else if (valor == 1 && nuevacarta <= 2) 
        {
            valor = 11;
        }
  
        
        else nombre = String.valueOf(valor);

        String[] palos = {"de Corazones", "de Picas", "de Diamantes", "de Tréboles"};
        palo = palos[numero.nextInt(4)];
    }


}




    
    
        
    

    










