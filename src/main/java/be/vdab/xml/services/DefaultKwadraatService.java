package be.vdab.xml.services;
/**
 * @Author Andre Komdeur
 */
public class DefaultKwadraatService implements KwadraatService{
    @Override
    public int kwadraat(int getal){
        return getal * getal;
    }
}
