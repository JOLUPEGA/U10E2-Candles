
package ScentCandle;

import Candle.Candle;
import EnumScent.Scent;

public class scentedCandle extends Candle{
    
    public static final Double PRICE = 3.0;
    private Scent aroma;

    public void scentedCandle(Double altura){
        
    }
    
    public void setAroma(Scent aroma) {
        this.aroma = aroma;
    }

    public Scent getAroma() {
        return aroma;
    }
}
