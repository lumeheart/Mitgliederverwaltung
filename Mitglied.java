/**
* In dieser Klasse werden die Attribute der Mitglieder definiert.
*/
public abstract class Mitglied 
{
  /* Attribute */
	protected String name;
	protected String vorname;
	protected int vereinsID;
	protected String adresse;
	protected String anmeldedatum;
	protected boolean aktiv;
  /* Methoden */
public Mitglied (){
    }
    
  /** @return liefert name 
*/
  public String gibName(){
    return this.name;
  }

  /** setzt name 
*@param pName String
*/
  public void setzeName(String  pName){
    this.name = pName;
  }

  /** @return liefert vorname 
*/
  public String gibVorname(){
    return this.vorname;
  }

  /** setzt vorname 
*@param pVorname String
*/
  public void setzeVorname(String  pVorname){
    this.vorname = pVorname;
  }

  /** @return liefert vereinsID 
*/
  public int gibVereinsID(){
    return this.vereinsID;
  }

  /** setzt vereinsID 
*@param pVereinsID Integer
*/
  public void setzeVereinsID(int  pVereinsID){
    this.vereinsID = pVereinsID;
  }

  /** @return liefert adresse 
*/
  public String gibAdresse(){
    return this.adresse;
  }

  /** setzt adresse 
*@param pAdresse String
*/
  public void setzeAdresse(String  pAdresse){
    this.adresse = pAdresse;
  }

  /** @return liefert anmeldedatum 
*/
  public String gibAnmeldedatum(){
    return this.anmeldedatum;
  }

  /** @return liefert aktiv 
*/
  public boolean gibAktiv(){
    return this.aktiv;
  }

  /** setzt anmeldedatum 
*@param pAnmeldedatum String
*/
  public void setzeAnmeldedatum(String  pAnmeldedatum){
    this.anmeldedatum = pAnmeldedatum;
  }

  /** setzt aktiv 
*@param pAktiv Boolean
*/
  public void setzeAktiv(boolean  pAktiv){
    this.aktiv = pAktiv;
  }

}//Ende Klasse: Mitglied

