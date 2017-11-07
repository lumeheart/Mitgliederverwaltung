/**
*
*/
public class Sponsor extends PassivesMitglied 
{
  /* Attribute */
	private int sponsoring;
  /* Methoden */
  /** setzt sponsoring 
*@param pSponsoring Integer
*/
  public void setzeSponsoring(int  pSponsoring){
    this.sponsoring = pSponsoring;
  }

  /** @return liefert sponsoring 
*/
  public int gibSponsoring(){
    return this.sponsoring;
  }

}//Ende Klasse: Sponsor

