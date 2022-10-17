

/*
 * CronusPort.java
 *
 * 
 */

import javax.comm.*;
import java.util.*;
/**
 *
 * 
 */
public class CronusPort {
    
    private static SerialPort serialPort;
    /** Creates a new instance of CronusPort */
    /*public CronusPort() {
    }
    */
    public static SerialPort getAbailablePort()
    {
        System.out.println("Cronus Port : Modo de verificacion");

        if (serialPort != null)
            return serialPort;
        CommPortIdentifier portId;
        Enumeration portList;
        portList = CommPortIdentifier.getPortIdentifiers();

        while (portList.hasMoreElements()) {
            portId = (CommPortIdentifier) portList.nextElement();
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                   if (portId.getName().equals("COM1")) {
                    try {
                        serialPort = (SerialPort) portId.open("Holman",  2000);
                    } catch (PortInUseException e) {}

                }
            }
        }
        
        return serialPort;
        
    }
    
}
