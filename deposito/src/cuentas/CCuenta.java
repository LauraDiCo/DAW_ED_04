package cuentas;

public class CCuenta {
    
/**Hemos hecho la encapsulación de
 * los atributos tal y como demandaba
 * el ejercicio 4 de la primera parte 
 * de la práctica de ED. 
 */
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

       
    /**Getter de cuenta
     * 
     * @return devuelve la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**Setter de cuenta
     * @param cuenta es el nombre que se ha introducido 
     * para este parámetro
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
/**Getter de saldo

     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /** Setter de saldo
     * 
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /** Getter de tipo de interés
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /** Setter de tipo de interés
     * 
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
/** 
 * A continuación van los parametros para CCuenta
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return getSaldo();
    }

   
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**método retirar*/
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
