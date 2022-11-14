package sample;
import static java.lang.System.*;


public class OutboundProcess {
    public void assignCarrier(boolean freeShipping) {
        if(freeShipping) {
            out.println("Use special carrier.");
        } else {
            out.println("Use regular carrier.");
        }
        recordShippingCharge(freeShipping);
    }

    public void recordShippingCharge(boolean freeShipping) {
        if(!freeShipping) {
            out.println("Add $5 shipping charge");
        } else {
            out.println("No shipping charge ");
        }
    }

    public static void main(String[] args) {
        OutboundProcess outboundProcess = new OutboundProcess();
        boolean freeShipping = false;
        out.println("free shipping: " + freeShipping);
        outboundProcess.assignCarrier(freeShipping);
    }
}
