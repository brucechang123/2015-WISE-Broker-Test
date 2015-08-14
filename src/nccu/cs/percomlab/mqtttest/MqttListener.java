package nccu.cs.percomlab.mqtttest;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MqttListener implements MqttCallback
{
	public static String MESSAGE;
	public static boolean isReceived = false;
    @Override
    public void connectionLost(Throwable arg0)
    {
        // do nothing
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken arg0)
    {
        // do nothing
    }

    @Override
    public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception
    {
    	MESSAGE = mqttMessage.toString();
    	isReceived = true;
        System.out.println(mqttMessage.toString());
    }

}
